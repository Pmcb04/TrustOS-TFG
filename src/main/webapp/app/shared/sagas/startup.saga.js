import { put } from 'redux-saga/effects'
import AppStateActions from '../reducers/app-state.reducer'
import LoginActions from '../../modules/login/login.reducer'
import AccountActions from '../reducers/account.reducer'
import MyAssetsActions from '../../modules/my-assets/my-assets-screen.reducer'

// process STARTUP actions
export function* startup(action) {
  yield put(LoginActions.loginLoad())
  yield put(AccountActions.accountRequest())
  yield put(AppStateActions.setRehydrationComplete())
  yield put(MyAssetsActions.myAssetsSuccess([])) // TODO eliminar cuando tengamos el login
}
