import { call, put, select, all } from 'redux-saga/effects'
import AssetActionActions from './asset-action-screen.reducer'

export const selectAssetList = (state) => state.assetAction.assetList
export const selectActionsList = (state) => state.assetAction.actionsList
export const selectAuthority = (state) => state.account.account


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

export function* getActionsAction(api, action) {
  const account = yield select(selectAuthority)
  const {assets} = action

  const response = yield all(assets.map((asset) => call(api.getActionsByAsset, asset.type, account.authorities[0])))
  let actions = []

  response.forEach((action, index) => {
    if(action.ok){
      actions.push(action.data)
    }
  })

  // success?
  if (actions != []) {
    yield put(AssetActionActions.assetActionActionSuccess(actions))
  } else {
    yield put(AssetActionActions.assetActionActionFailure(response.data))
  }
}

export function* createAssetAction(api, action) {
  const { newAsset } = action
  const response = yield call(api.createAsset, newAsset)
  // success?
  if (!response.ok) {
    yield put(AssetActionActions.assetActionCreateFailure(response.data))
  }
}

export function* updateAssetAction(api, action) {
  const isAuthorised = false
  const { asset } = action

  const response = yield call(api.updateAsset, isAuthorised, asset.assetId, asset.metadata)

  // success?
  if (!response.ok) {
    yield put(AssetActionActions.assetActionUpdateFailure(response.data))
  }
}