import { call, put, select } from 'redux-saga/effects'

import LoginActions from './login.reducer'
import AccountActions from '../../shared/reducers/account.reducer'

export const selectAuthToken = (state) => state.login.authToken
export const selectTrustosToken = (state) => state.login.trustosToken

function* loginTrustos(api) {
  // FIXME traer del backend el usuario trustos?
  const account = {
    id: 'did:vtn:trustid:0106a4d4a997ac85895ed20cbdaafe6a58c5bd8d7311b446d11502bfe9942311',
    password: 'KMv52hzgfQYW',
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
    console.log('success', response.data.id_token)
    const trustosToken = yield loginTrustos(api)
    yield call(api.setTrustOSToken, trustosToken)
    yield put(LoginActions.loginSuccess(response.data.id_token, trustosToken))
    yield put(AccountActions.accountRequest())
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
