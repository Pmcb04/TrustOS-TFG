import { takeLatest, all } from 'redux-saga/effects'
import API from '../services/api'
import FixtureAPI from '../services/fixture-api'
import AppConfig from '../../config/app-config'

/* ------------- Types ------------- */

import { StartupTypes } from '../reducers/startup.reducer'
import { AuthInfoTypes } from '../reducers/auth-info.reducer'
import { LoginTypes } from '../../modules/login/login.reducer'
import { AccountTypes } from '../../shared/reducers/account.reducer'
import { UserTypes } from '../../shared/reducers/user.reducer'
// jhipster-react-native-saga-redux-import-needle
import { AssetListTypes } from '../../modules/my-assets/my-assets-screen.reducer'

/* ------------- Sagas ------------- */

import { startup } from './startup.saga'
import { getAuthInfo } from './auth-info.saga'
import { login, logout, loginLoad } from '../../modules/login/login.sagas'
import { getAccount, updateAccount } from '../../shared/sagas/account.sagas'
import UserSagas from '../../shared/sagas/user.sagas'
// jhipster-react-native-saga-method-import-needle
import { getAssets, setOffset, loadNextAssets, loadPreviousAssets, search } from '../../modules/my-assets/my-assets-screen.sagas'

/* ------------- API ------------- */

// The API we use is only used from Sagas, so we create it here and pass along
// to the sagas which need it.
const api = AppConfig.useFixtures ? FixtureAPI : API.create()

/* ------------- Connect Types To Sagas ------------- */

//  FIXME state para filtar la lista?
const OFFSET = 2

export default function* root() {
  yield all([
    // some sagas only receive an action
    takeLatest(StartupTypes.STARTUP, startup),
    takeLatest(AuthInfoTypes.AUTH_INFO_REQUEST, getAuthInfo, api),

    // JHipster accounts
    takeLatest(LoginTypes.LOGIN_LOAD, loginLoad, api),
    takeLatest(LoginTypes.LOGIN_REQUEST, login, api),
    takeLatest(LoginTypes.LOGOUT_REQUEST, logout, api),
    // jhipster-react-native-saga-redux-connect-needle

    takeLatest(UserTypes.USER_ALL_REQUEST, UserSagas.getAllUsers, api),

    takeLatest(AccountTypes.ACCOUNT_REQUEST, getAccount, api),
    takeLatest(AccountTypes.ACCOUNT_UPDATE_REQUEST, updateAccount, api),

    // Asset list
    takeLatest(AssetListTypes.MY_ASSETS_REQUEST, getAssets, api),
    takeLatest(AssetListTypes.MY_ASSETS_REQUEST, setOffset, OFFSET),
    takeLatest(AssetListTypes.MY_ASSETS_SUCCESS, loadNextAssets, api),
    takeLatest(AssetListTypes.MY_ASSETS_LOAD_NEXT_CONTENT, loadNextAssets, api),
    takeLatest(AssetListTypes.MY_ASSETS_LOAD_PREVIOUS_CONTENT, loadPreviousAssets, api),
    takeLatest(AssetListTypes.MY_ASSETS_SEARCH, search, api),
  ])
}
