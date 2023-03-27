import { call, put, select } from 'redux-saga/effects'
import AssetDetailsActions from './asset-details-screen.reducer'

export const selectIsAuthorised = (state) => state.assetDetails.isAuthorised
export const selectAssetId = (state) => state.assetDetails.assetId
export const selectAsset = (state) => state.assetDetails.asset
export const selectAuthority = (state) => state.account.account

export function* getAsset(api) {
  const isAuthorised = yield select(selectIsAuthorised)
  const assetId = yield select(selectAssetId)

  const response = yield call(api.getAsset, isAuthorised, assetId)
  // success?
  if (response.ok) {
    yield put(AssetDetailsActions.assetDetailsSuccess(response.data))
  } else {
    yield put(AssetDetailsActions.assetDetailsFailure(response.data))
  }
}

export function* updateAsset(api) {
  const isAuthorised = yield select(selectIsAuthorised)
  const assetId = yield select(selectAssetId)
  const asset = yield select(selectAsset)

  const response = yield call(api.updateAsset, isAuthorised, assetId, asset.metadata)

  // success?
  if (!response.ok) {
    yield put(AssetDetailsActions.assetDetailsFailure(response.data))
  }
}

export function* getActions(api,action) {

  const account = yield select(selectAuthority)
  const {assetType} = action

  const response = yield call(api.getActionsByAsset, assetType, account.authorities[0])
  
  // success?
  if (response.ok) {
    yield put(AssetDetailsActions.assetDetailsActionSuccess(response.data))
  } else {
    yield put(AssetDetailsActions.assetDetailsActionFailure(response.data))
  }
}
