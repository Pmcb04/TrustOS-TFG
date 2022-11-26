import { call, put } from 'redux-saga/effects'

import RegisterActions from './register.reducer'

// attempts to register
export function* register(api, { user }) {
  const response = yield call(api.register, { langKey: 'en', ...user }) // cambiar langKey por el de la aplicacion
  // success?
  if (response.ok) {
    console.log('Register - OK')
    yield put(RegisterActions.registerSuccess())
  } else {
    console.log('Register - FAIL')
    yield put(RegisterActions.registerFailure((response.data && response.data.title) || 'Registration failed'))
  }
}
