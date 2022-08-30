import { endsWith, findLastIndex } from 'lodash'
import { select, call, put, all } from 'redux-saga/effects'
import AssetListActions from '../asset-list/asset-list.reducer'

export const selectIndex = (state) => state.assetList.index
export const selectOffset = (state) => state.assetList.offset
export const selectAssets = (state) => state.assetList.assets

// TODO mover a el reducer para que pueda coger el estado de algun filtro
const isAuthorised = false

export function* getAssets(api) {
  // FIXME eliminar cuando tengamos el login resuelto
  const account = {
    id: 'did:vtn:trustid:0106a4d4a997ac85895ed20cbdaafe6a58c5bd8d7311b446d11502bfe9942311',
    password: 'KMv52hzgfQYW',
  }
  const token = yield call(api.loginTrustOS, account)
  yield call(api.setTrustOSToken, token.data.message)
  const response = yield call(api.getAssets, isAuthorised)

  // success?
  if (response.ok) {
    // obtain all data for all assets
    yield put(AssetListActions.assetListSuccess(response.data))
    console.log('RESPONSE GET ASSETS OK')
  } else {
    yield put(AssetListActions.assetListFailure(response.data))
    console.log('RESPONSE GET ASSETS NOT OK')
  }
}

export function* setOffset(offset) {
  yield put(AssetListActions.assetListSetOffset(offset))
}

function* loadAssets(api, start, end) {
  const assets = yield select(selectAssets)
  let assetsLoaded = []

  // set assets loaded
  const response = yield all(
    assets.map((assetId) => (assetId !== null && assetId !== '' ? call(api.getAsset, isAuthorised, assetId) : null)),
  )
  // for each reponse  check if it is diferent of null
  response.forEach((asset, index) => {
    if (asset !== null && index >= start && index < end) assetsLoaded.push(asset.data)
  })

  console.log(assetsLoaded)
  yield put(AssetListActions.assetListSetAssetsLoaded(assetsLoaded))
}

export function* loadNextAssets(api) {
  const index = yield select(selectIndex)
  const offset = yield select(selectOffset)
  // calculate new index
  const start = index
  const end = index + offset
  yield loadAssets(api, start, end)
  yield put(AssetListActions.assetListSetIndex(end))
}

export function* loadPreviousAssets(api) {
  let index = yield select(selectIndex)
  const offset = yield select(selectOffset)
  // calculate new index
  const start = index - 2 * offset
  const end = index - offset
  yield loadAssets(api, start, end)
  yield put(AssetListActions.assetListSetIndex(end))
}
