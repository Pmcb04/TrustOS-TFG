import { select, call, put, all } from 'redux-saga/effects'
import MyAssetsActions, { AssetListTypes } from './my-assets-screen.reducer'

export const selectIndex = (state) => state.myAssets.index
export const selectOffset = (state) => state.myAssets.offset
export const selectAssets = (state) => state.myAssets.assets
export const selectSearch = (state) => state.myAssets.search
export const selectChangeOffset = (state) => state.myAssets.changeOffset
export const selectOrder = (state) => state.myAssets.order
export const selectAssetsLoaded = (state) => state.myAssets.assetsLoaded
export const selectShowOwner = (state) => state.myAssets.showOwner
export const selectShowAuthorizathed = (state) => state.myAssets.showAuthorizathed
export const selectShowStateClosed = (state) => state.myAssets.showStateClosed
export const selectShowStateOpen = (state) => state.myAssets.showStateOpen
export const selectAuthorities = (state) => state.account.account.authorities

export function* getAssets(api) {
  const showOwner = yield select(selectShowOwner)
  const showAuthorizathed = yield select(selectShowAuthorizathed)
  const order = yield select(selectOrder)
  

  yield getAssetCreate(api)
  const productsView = yield getAssetView(api)

  let assetsOwner = []
  let assetsAuthorised = []

  if (showOwner) {
    assetsOwner = yield call(api.getAssets, false)
    assetsOwner.data = assetsOwner.data.filter((assetId) => assetId !== 'Ternero#xcryscrq34' && productsView.some((product) => assetId.split("@", 1) == product.name ))
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

export function* getAssetCreate(api) {
  const authorities = yield select(selectAuthorities)
  const products = yield call(api.getAssetsCreate, authorities[0])
  if (products.ok) {
    yield put(MyAssetsActions.myAssetsCreateSuccess(products.data))
  } else {
    yield put(MyAssetsActions.myAssetsFailure(products.data))
  }
}

export function* getAssetView(api) {
  const authorities = yield select(selectAuthorities)
  const products = yield call(api.getAssetsView, authorities[0])
  if (products.ok) {
    return products.data
  } else {
    yield put(MyAssetsActions.myAssetsFailure(products.data))
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

  const showStateClosed = yield select(selectShowStateClosed)
  const showStateOpen = yield select(selectShowStateOpen)

  let assetsLoaded = []
  // set assets loaded

  const response = yield all(assets.map((asset) => call(api.getAsset, asset.isAuthorised, asset.assetId)))

  // for each reponse  check if it is diferent of null
  response.forEach((asset, index) => {
    if(asset.ok){
      asset.data.isAuthorised = assets[index].isAuthorised
      if(((showStateClosed && (asset.data.metadata.final == null || asset.data.metadata.final == true)))){
        assetsLoaded.push(asset.data)
      }
      if (((showStateOpen && asset.data.metadata.final == false))) {
        assetsLoaded.push(asset.data)
      }
    }

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
