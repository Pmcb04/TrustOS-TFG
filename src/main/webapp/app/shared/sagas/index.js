import { takeLatest, all } from 'redux-saga/effects'
import API from '../services/api'
import FixtureAPI from '../services/fixture-api'
import AppConfig from '../../config/app-config'

/* ------------- Types ------------- */

import { StartupTypes } from '../reducers/startup.reducer'
import { LoginTypes } from '../../modules/login/login.reducer'
import { AccountTypes } from '../../shared/reducers/account.reducer'
import { RegisterTypes } from '../../modules/register/register.reducer'
import { ForgotPasswordTypes } from '../../modules/account/password-reset/forgot-password.reducer'
import { ChangePasswordTypes } from '../../modules/account/password/change-password.reducer'
import { UserTypes } from '../../shared/reducers/user.reducer'
// jhipster-react-native-saga-redux-import-needle

import { AssetListTypes } from '../../modules/my-assets/my-assets-screen.reducer'
import { AssetDetailsTypes } from '../../modules/asset-details/asset-details-screen.reducer'
import { AssetTraceabilityTypes } from '../../modules/asset-traceability/asset-traceability-screen.reducer'
import { AssetCreateTypes } from '../../modules/asset-create/asset-create-screen.reducer'
import { AssetActionTypes } from '../../modules/asset-action/asset-action-screen.reducer'

/* ------------- Sagas ------------- */

import { startup } from './startup.saga'
import { login, logout, loginLoad } from '../../modules/login/login.sagas'
import { register, getRoles} from '../../modules/register/register.sagas'
import { forgotPassword } from '../../modules/account/password-reset/forgot-password.sagas'
import { changePassword } from '../../modules/account/password/change-password.sagas'
import { getAccount, updateAccount, getAssetAccount,updateAssetAccount } from '../../shared/sagas/account.sagas'
import UserSagas from '../../shared/sagas/user.sagas'
// jhipster-react-native-saga-method-import-needle

import {
  getAssets,
  loadAssetsAgain,
  loadNextAssets,
  loadPreviousAssets,
  search,
  getAssetCreate,
  changeOrder,
} from '../../modules/my-assets/my-assets-screen.sagas'
import { getAsset, updateAsset, getActions } from '../../modules/asset-details/asset-details-screen.sagas'
import { getAssetTraceability, getAssetRangeTraceability, getAssetTraceabilityBefore} from '../../modules/asset-traceability/asset-traceability-screen.sagas'
import { createAsset, getActionsCreate } from '../../modules/asset-create/asset-create-screen.sagas'
import { getAssetAction, createAssetAction, updateAssetAction, getActionsAction } from '../../modules/asset-action/asset-action-screen.sagas'
/* ------------- API ------------- */

// The API we use is only used from Sagas, so we create it here and pass along
// to the sagas which need it.
const api = AppConfig.useFixtures ? FixtureAPI : API.create()

/* ------------- Connect Types To Sagas ------------- */

export default function* root() {
  yield all([
    // some sagas only receive an action
    takeLatest(StartupTypes.STARTUP, startup),

    // JHipster accounts
    takeLatest(LoginTypes.LOGIN_LOAD, loginLoad, api),
    takeLatest(LoginTypes.LOGIN_REQUEST, login, api),
    takeLatest(LoginTypes.LOGOUT_REQUEST, logout, api),
    // jhipster-react-native-saga-redux-connect-needle

    // register
    takeLatest(RegisterTypes.REGISTER_REQUEST, register, api),
    takeLatest(RegisterTypes.REGISTER_REQUEST_ROLES, getRoles, api),

    // account
    takeLatest(ForgotPasswordTypes.FORGOT_PASSWORD_REQUEST, forgotPassword, api),
    takeLatest(ChangePasswordTypes.CHANGE_PASSWORD_REQUEST, changePassword, api),
    takeLatest(UserTypes.USER_REQUEST, UserSagas.getUser, api),
    takeLatest(UserTypes.USER_UPDATE_REQUEST, UserSagas.updateUser, api),
    takeLatest(UserTypes.USER_DELETE_REQUEST, UserSagas.deleteUser, api),
    takeLatest(UserTypes.USER_ALL_REQUEST, UserSagas.getAllUsers, api),

    takeLatest(AccountTypes.ACCOUNT_REQUEST, getAccount, api),
    takeLatest(AccountTypes.ACCOUNT_UPDATE_REQUEST, updateAccount, api),
    takeLatest(AccountTypes.ACCOUNT_ASSET_REQUEST, getAssetAccount, api),
    takeLatest(AccountTypes.ACCOUNT_ASSET_UPDATE, updateAssetAccount, api),

    // Asset list
    takeLatest(AssetListTypes.MY_ASSETS_REQUEST, getAssets, api),
    takeLatest(AssetListTypes.MY_ASSETS_SET_SHOW_OWNER, getAssets, api),
    takeLatest(AssetListTypes.MY_ASSETS_SET_SHOW_AUTHORIZATHED, getAssets, api),
    takeLatest(AssetListTypes.MY_ASSETS_CHANGE_OFFSET, loadAssetsAgain, api),
    takeLatest(AssetListTypes.MY_ASSETS_SUCCESS, loadNextAssets, api),
    takeLatest(AssetListTypes.MY_ASSETS_LOAD_NEXT_CONTENT, loadNextAssets, api),
    takeLatest(AssetListTypes.MY_ASSETS_LOAD_PREVIOUS_CONTENT, loadPreviousAssets, api),
    takeLatest(AssetListTypes.MY_ASSETS_SEARCH, search, api),
    takeLatest(AssetListTypes.MY_ASSETS_CREATE, getAssetCreate, api),
    takeLatest(AssetListTypes.MY_ASSETS_SET_ORDER, changeOrder, api),

    // Asset Details
    takeLatest(AssetDetailsTypes.ASSET_DETAILS_REQUEST, getAsset, api),
    takeLatest(AssetDetailsTypes.ASSET_DETAILS_UPDATE, updateAsset, api),
    takeLatest(AssetDetailsTypes.ASSET_DETAILS_ACTION_REQUEST, getActions, api),

    // Asset Traceability
    takeLatest(AssetTraceabilityTypes.ASSET_TRACEABILITY_REQUEST, getAssetTraceability, api),
    takeLatest(AssetTraceabilityTypes.ASSET_TRACEABILITY_RANGE_REQUEST, getAssetRangeTraceability, api),
    takeLatest(AssetTraceabilityTypes.ASSET_TRACEABILITY_REQUEST_ASSET_BEFORE, getAssetTraceabilityBefore, api),

    // Asset create
    takeLatest(AssetCreateTypes.ASSET_CREATE_REQUEST, createAsset, api),
    takeLatest(AssetCreateTypes.ASSET_CREATE_ACTION_REQUEST, getActionsCreate, api),


    // Asset Action
    takeLatest(AssetActionTypes.ASSET_ACTION_REQUEST, getAssetAction, api),
    takeLatest(AssetActionTypes.ASSET_ACTION_CREATE, createAssetAction, api),
    takeLatest(AssetActionTypes.ASSET_ACTION_UPDATE, updateAssetAction, api),
    takeLatest(AssetActionTypes.ASSET_ACTION_ACTION_REQUEST, getActionsAction, api),


  ])
}
