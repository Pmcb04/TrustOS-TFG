import { call, put } from 'redux-saga/effects'
import AssetCreateActions from './asset-create-screen.reducer'

export function* createAsset(api, action) {
  const { newAsset } = action
  const response = yield call(api.createAsset, newAsset)
  // success?
  if (response.ok) {
    yield put(AssetCreateActions.assetCreateSuccess(response.data.assetId))
  } else {
    yield put(AssetCreateActions.assetCreateFailure(response.data))
  }
}
