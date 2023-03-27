import { call, put, select, take } from 'redux-saga/effects'

import LoginActions from './login.reducer'
import AccountActions from '../../shared/reducers/account.reducer'
import AppConfig from '../../config/app-config'

export const selectAuthToken = (state) => state.login.authToken
export const selectTrustosToken = (state) => state.login.trustosToken
export const selectAccount = (state) => state.account.account

function* loginTrustos(api) {
  const account = {
    id: AppConfig.idTrustos,
    password: AppConfig.password,
  }
  const token = yield call(api.loginTrustOS, account)
  return token.data.message
}

// attempts to login
export function* login(api, { username, password }) {
  const authObj = {
    username: username,
    password: password,
    rememberMe: true,
  }

  const response = yield call(api.login, authObj)

  // success?
  if (response.ok) {
    yield call(api.setAuthToken, response.data.id_token)
    yield put(AccountActions.accountRequest())
    let account = yield select(selectAccount)
    while (account === null) {
      yield take()
      account = yield select(selectAccount)
    }
    const trustosToken = yield loginTrustos(api)
    yield call(api.setTrustOSToken, trustosToken)
    yield put(LoginActions.loginSuccess(response.data.id_token, trustosToken))
    yield put({ type: 'RELOGIN_OK' })
  } else {
    const errorMessage = !response.data
      ? 'Failed to reach backend API'
      : response.data && response.data.detail
      ? response.data.detail
      : 'Bad credentials'
    yield put(LoginActions.loginFailure(errorMessage))
  }
}
// attempts to logout
export function* logout(api) {
  yield call(api.removeAuthToken)
  yield put(AccountActions.accountReset())
  yield put(AccountActions.accountRequest())
  yield put(LoginActions.logoutSuccess())
  yield put({ type: 'RELOGIN_ABORT' })
}

// loads the login
export function* loginLoad(api) {
  const authToken = yield select(selectAuthToken)
  const trustosToken = yield select(selectTrustosToken)
  // only set the token if we have it
  if (authToken) {
    yield call(api.setAuthToken, authToken)
  }
  if (trustosToken) {
    yield call(api.setTrustOSToken, trustosToken)
  }
  yield put(LoginActions.loginLoadSuccess())
}
