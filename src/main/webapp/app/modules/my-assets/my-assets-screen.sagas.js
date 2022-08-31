import { select, call, put, all } from 'redux-saga/effects'
import MyAssetsActions from './my-assets-screen.reducer'

export const selectIndex = (state) => state.myAssets.index
export const selectOffset = (state) => state.myAssets.offset
export const selectAssets = (state) => state.myAssets.assets
export const selectSearch = (state) => state.myAssets.search

// TODO mover a el reducer para que pueda coger el estado de algun filtro
const isAuthorised = false

export function* getAssets(api) {
  console.log('begin')
  // FIXME eliminar cuando tengamos el login resuelto
  const account = {
    id: 'did:vtn:trustid:0106a4d4a997ac85895ed20cbdaafe6a58c5bd8d7311b446d11502bfe9942311',
    password: 'KMv52hzgfQYW',
  }
  const token = yield call(api.loginTrustOS, account)
  yield call(api.setTrustOSToken, token.data.message)
  const response = yield call(api.getAssets, isAuthorised)
  console.log(response)
  // success?
  if (response.ok) {
    // obtain all data for all assets
    yield put(MyAssetsActions.myAssetsSuccess(response.data))
    console.log('RESPONSE GET ASSETS OK')
  } else {
    yield put(MyAssetsActions.myAssetsFailure(response.data))
    console.log('RESPONSE GET ASSETS NOT OK')
  }

  console.log('end')
}

export function* setOffset(offset) {
  yield put(MyAssetsActions.myAssetsSetOffset(offset))
}

function* loadAssets(api, assets) {
  let assetsLoaded = []

  // set assets loaded
  const response = yield all(
    assets.map((assetId) => (assetId !== null && assetId !== '' ? call(api.getAsset, isAuthorised, assetId) : null)),
  )
  // for each reponse  check if it is diferent of null
  response.forEach((asset, index) => {
    if (asset !== null) assetsLoaded.push(asset.data)
  })

  // set list of asset in state
  yield put(MyAssetsActions.myAssetsSetAssetsLoaded(assetsLoaded))
}

export function* loadNextAssets(api) {
  const index = yield select(selectIndex)
  let assets = yield select(selectAssets)
  const offset = yield select(selectOffset)

  // calculate new index
  const start = index
  const end = index + offset
  yield loadAssets(api, assets.slice(start, end))
  yield put(MyAssetsActions.myAssetsSetIndex(end))
}

export function* loadPreviousAssets(api) {
  let index = yield select(selectIndex)
  let assets = yield select(selectAssets)
  const offset = yield select(selectOffset)

  // calculate new index
  const start = index - 2 * offset
  const end = index - offset
  yield loadAssets(api, assets.slice(start, end))
  yield put(MyAssetsActions.myAssetsSetIndex(end))
}

export function* search(api) {
  let assets = yield select(selectAssets)
  const found = yield select(selectSearch)
  let assetsSearch = []
  // filter by search
  yield assets.forEach((assetId) => {
    if (assetId.toLowerCase().includes(found.toLowerCase())) {
      assetsSearch.push(assetId)
    }
  })
  yield loadAssets(api, assetsSearch)
}
