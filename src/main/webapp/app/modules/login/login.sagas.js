import { call, put, select } from 'redux-saga/effects'

import AppConfig from '../../config/app-config'
import LoginActions from './login.reducer'
import AccountActions from '../../shared/reducers/account.reducer'
import AuthInfoActions from '../../shared/reducers/auth-info.reducer'
import { doOauthPkceFlow, logoutFromIdp } from './login.utils'

export const selectAuthInfo = (state) => state.authInfo.authInfo
export const selectIdToken = (state) => state.login.idToken
export const selectAuthToken = (state) => state.login.authToken
// attempts to login
export function* login(api) {
  try {
    const authInfo = yield select(selectAuthInfo)
    if (authInfo === null) {
      yield put(AuthInfoActions.authInfoRequest())
    }
    const { issuer, clientId } = authInfo
    console.log('issuer_>', issuer)
    console.log('clientID>', clientId)
    const { accessToken, idToken } = yield call(doOauthPkceFlow, AppConfig.nativeClientId || clientId, issuer)
    console.table('accessToken_> ', accessToken)
    console.log('idToken_> ', idToken)

    if (accessToken) {
      yield call(api.setAuthToken, accessToken)
      yield put(LoginActions.loginSuccess(accessToken, idToken))
      yield put(AccountActions.accountRequest())
      yield put({ type: 'RELOGIN_OK' })
    }
  } catch (e) {
    let errorMessage = 'Login failed, please try again'
    if (e.type === 'cancel' || e.type === 'dismiss') {
      errorMessage = 'Login dismissed'
    } else if (e.type === 'error') {
      errorMessage += ` (code ${e.errorCode})`
    }
    yield put(LoginActions.loginFailure(errorMessage))
    if (AppConfig.debugMode) {
      console.error(e)
    }
  }
}

// attempts to logout
export function* logout(api) {
  yield call(api.removeAuthToken)
  yield put(AccountActions.accountReset())
  yield put(AccountActions.accountRequest())
  const { clientId, issuer } = yield select(selectAuthInfo)
  const idToken = yield select(selectIdToken)
  if (idToken) {
    yield call(logoutFromIdp, AppConfig.nativeClientId || clientId, issuer, idToken)
  }
  yield put(LoginActions.logoutSuccess())
  yield put({ type: 'RELOGIN_ABORT' })
}

// loads the login
export function* loginLoad(api) {
  const authToken = yield select(selectAuthToken)
  // only set the token if we have it
  if (authToken) {
    yield call(api.setAuthToken, authToken)
  }
  yield put(LoginActions.loginLoadSuccess())
}
