import { call, put, select } from 'redux-saga/effects'
import AssetCreateActions from './asset-create-screen.reducer'
export const selectAuthority = (state) => state.account.account


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

export function* getActionsCreate(api,action) {

  const account = yield select(selectAuthority)
  const {assetType} = action

  const response = yield call(api.getActionsByAsset, assetType, account.authorities[0])
  
  // success?
  if (response.ok) {
    yield put(AssetCreateActions.assetCreateActionSuccess(response.data))
  } else {
    yield put(AssetCreateActions.assetCreateActionFailure(response.data))
  }
}