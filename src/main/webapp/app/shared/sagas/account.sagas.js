import { call, put, select} from 'redux-saga/effects'

import AccountActions from '../reducers/account.reducer'
import { callApi } from './call-api.saga'

export const selectAssetId = (state) => state.account.account.assetId


// attempts to account
export function* getAccount(api) {
  const response = yield call(api.getAccount)
  // TODO llamar a get asset de account.login para obtener el asset del usuario.

  // success?
  if (response.ok && response.headers['content-type']?.indexOf('json') !== -1) {
    console.log('Account - OK')
    yield put(AccountActions.accountSuccess(response.data))
  } else {
    console.log('Account - FAIL')
    yield put(AccountActions.accountFailure((response.data && response.data.detail) || 'Failed to get account'))
  }
}

// attempts to update account settings
export function* updateAccount(api, action) {
  const { account } = action
  const apiCall = call(api.updateAccount, account)
  const response = yield call(callApi, apiCall)

  // success?
  if (response.ok) {
    console.log('AccountUpdate - OK')
    yield put(AccountActions.accountUpdateSuccess())
  } else {
    console.log('AccountUpdate - FAIL')
    yield put(AccountActions.accountUpdateFailure((response.data && response.data.detail) || 'Failed to update account'))
  }
}


export function* getAssetAccount(api) {
  const isAuthorised = false
  const assetId = yield select(selectAssetId)

  const response = yield call(api.getAsset, isAuthorised, assetId)
  // success?
  if (response.ok) {
    yield put(AccountActions.accountAssetSuccess(response.data))
  } else {
    yield put(AccountActions.accountAssetFailure(response.data))
  }
}

export function* updateAssetAccount(api, action) {
  const isAuthorised = false
  const assetId = yield select(selectAssetId)
  const {metadata} = action

  const response = yield call(api.updateAsset, isAuthorised, assetId, metadata)

  // success?
  if (!response.ok) {
    yield put(AccountActions.accountAssetFailure(response.data))
  }
}
