import { call, put, select } from 'redux-saga/effects'
import AssetActionActions from './asset-action-screen.reducer'

export const selectAssetList = (state) => state.assetAction.assetList

export function* getAssetAction(api, action) {
  const { isAuthorised, assetId, index } = action
  const response = yield call(api.getAsset, isAuthorised, assetId)
  // success?
  if (response.ok) {
    let assetList = yield select(selectAssetList)
    let copyAssetList = [...assetList]
    copyAssetList[index] = response.data
    yield put(AssetActionActions.assetActionSuccess(copyAssetList))
  } else {
    yield put(AssetActionActions.assetActionFailure(response.data))
  }
}