import { select, call, put, all } from 'redux-saga/effects'
import MyAssetsActions from './my-assets-screen.reducer'

export const selectIndex = (state) => state.myAssets.index
export const selectOffset = (state) => state.myAssets.offset
export const selectAssets = (state) => state.myAssets.assets
export const selectSearch = (state) => state.myAssets.search
export const selectChangeOffset = (state) => state.myAssets.changeOffset
export const selectOrder = (state) => state.myAssets.order
export const selectAssetsLoaded = (state) => state.myAssets.assetsLoaded
export const selectShowOwner = (state) => state.myAssets.showOwner
export const selectShowAuthorizathed = (state) => state.myAssets.showAuthorizathed

function* login(api) {
  // FIXME eliminar cuando tengamos el login resuelto
  const account = {
    id: 'did:vtn:trustid:0106a4d4a997ac85895ed20cbdaafe6a58c5bd8d7311b446d11502bfe9942311',
    password: 'KMv52hzgfQYW',
  }
  const token = yield call(api.loginTrustOS, account)
  yield call(api.setTrustOSToken, token.data.message)
}

export function* getAssets(api) {
  yield login(api) // TODO eliminar cuando tengamos el login

  const showOwner = yield select(selectShowOwner)
  const showAuthorizathed = yield select(selectShowAuthorizathed)
  const order = yield select(selectOrder)

  let assetsOwner = []
  let assetsAuthorised = []

  if (showOwner) {
    assetsOwner = yield call(api.getAssets, false)
    assetsOwner = yield putIsAuthorisedFlag(assetsOwner.data, false)
  }

  if (showAuthorizathed) {
    assetsAuthorised = yield call(api.getAssets, true)
    assetsAuthorised = yield putIsAuthorisedFlag(assetsAuthorised.data, true)
  }

  // success?
  if (assetsOwner && assetsAuthorised) {
    // finally, concat the two list and sort
    let assets = assetsOwner.concat(assetsAuthorised).sort((a, b) => (a.assetId < b.assetId ? -1 : a.assetId > b.assetId ? 1 : 0))

    if (order === 'inverse') {
      assets = assets.reverse()
    }

    // obtain all data for all assets
    yield put(MyAssetsActions.myAssetsSuccess(assets))
  } else if (!assetsOwner) {
    yield put(MyAssetsActions.myAssetsFailure(assetsOwner))
  } else if (!assetsAuthorised) {
    yield put(MyAssetsActions.myAssetsFailure(assetsAuthorised))
  }
}

function* putIsAuthorisedFlag(assets, isAuthorised) {
  // check if assetId is null
  assets.forEach((assetId, index) => {
    if (assetId === null || assetId === '') assets.splice(index, 1)
  })
  // second put isAuthorised flag
  assets.forEach((assetId, index) => {
    assets[index] = { assetId: assetId, isAuthorised: isAuthorised }
  })

  return assets
}

export function* loadAssetsAgain(api) {
  let assets = yield select(selectAssets)
  const index = yield select(selectIndex)
  const offset = yield select(selectOffset)
  const newOffset = yield select(selectChangeOffset)

  // calculate new index
  // ONLY TESTED WITH VALUES 10, 20, 30 IN FILTER
  const start = (index - 1) * offset
  const newEnd = start + newOffset
  const newIndex = yield Math.floor(newEnd / newOffset)
  let newStart = (newIndex - 1) * newOffset
  if (newStart < 0) newStart = 0

  yield loadAssets(api, assets.slice(newStart, newEnd))
  yield put(MyAssetsActions.myAssetsSetOffset(newOffset))
  yield put(MyAssetsActions.myAssetsSetIndex(newIndex))
}

function* loadAssets(api, assets) {
  let assetsLoaded = []
  // set assets loaded
  const response = yield all(assets.map((asset) => call(api.getAsset, asset.isAuthorised, asset.assetId)))
  // for each reponse  check if it is diferent of null
  response.forEach((asset, index) => {
    asset.data.isAuthorised = assets[index].isAuthorised
    assetsLoaded.push(asset.data)
  })

  // set list of asset in state
  yield put(MyAssetsActions.myAssetsSetAssetsLoaded(assetsLoaded))
}

export function* loadNextAssets(api) {
  const index = yield select(selectIndex)
  let assets = yield select(selectAssets)
  const offset = yield select(selectOffset)

  // calculate new index
  const start = index * offset
  const end = index * offset + offset
  yield loadAssets(api, assets.slice(start, end))
  yield put(MyAssetsActions.myAssetsSetIndex(index + 1))
}

export function* loadPreviousAssets(api) {
  let index = yield select(selectIndex)
  let assets = yield select(selectAssets)
  const offset = yield select(selectOffset)

  // calculate new index
  let start = (index - 1) * offset - offset
  let end = (index - 1) * offset
  yield loadAssets(api, assets.slice(start, end))
  yield put(MyAssetsActions.myAssetsSetIndex(index - 1))
}

// BUG cuando se busca, los botones anterior y posterior deberian hacer caso a la busqueda no a los assets completos.
export function* search(api) {
  let assets = yield select(selectAssets)
  const found = yield select(selectSearch)
  let assetsSearch = []
  // filter by search
  if (found === null || found === '') {
    yield loadAssets(api, assets)
  } else {
    yield assets.forEach((asset) => {
      if (asset.assetId.toLowerCase().includes(found.toLowerCase())) {
        assetsSearch.push(asset)
      }
    })
    yield loadAssets(api, assetsSearch)
  }
}

export function* changeOrder(api) {
  let assets = yield select(selectAssets)
  let assetsChange = [...assets]
  yield put(MyAssetsActions.myAssetsSuccess(assetsChange.reverse()))
  yield loadAssetsAgain(api)
}
