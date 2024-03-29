import { createReducer, createActions } from 'reduxsauce'
import Immutable from 'seamless-immutable'
/* ------------- Types and Action Creators ------------- */

const { Types, Creators } = createActions({
  myAssetsReset: [],
  myAssetsRequest: [],
  myAssetsSuccess: ['assets'],
  myAssetsFailure: ['error'],
  myAssetsLoadNextContent: [],
  myAssetsLoadPreviousContent: [],
  myAssetsSetOffset: ['offset'],
  myAssetsChangeOffset: ['changeOffset'],
  myAssetsSetIndex: ['index'],
  myAssetsSetOrder: ['order'],
  myAssetsSetShowOwner: ['showOwner'],
  myAssetsSetShowAuthorizathed: ['showAuthorizathed'],
  myAssetsSetShowStateClosed: ['showStateClosed'],
  myAssetsSetShowStateOpen: ['showStateOpen'],
  myAssetsSetAssetsLoaded: ['assetsLoaded'],
  myAssetsSearch: ['search'],
  myAssetsCreate: [],
  myAssetsCreateSuccess: ['products'],
  myAssetsSetSuccessCreated: [],
})

export const AssetListTypes = Types
export default Creators

/* ------------- Initial State ------------- */

export const INITIAL_STATE = Immutable({
  assets: null,
  numAssets: 0,
  assetsLoaded: null,
  fetching: false,
  error: null,
  index: 0,
  offset: 10,
  changeOffset: 10,
  search: '',
  order: 'natural',
  showOwner: true,
  showAuthorizathed: false,
  showStateOpen: true,
  showStateClosed: true,
  products: [],
  successCreate: false,
})

/* ------------- Reducers ------------- */

// request to init load all assets
export const request = (state) =>
  state.merge({
    fetching: true,
    error: null,
    assets: null,
    numAssets: 0,
    assetsLoaded: null,
    index: 0,
    search: null,
    products: [],
    successCreate: false,
  })

// state sucess request completed
export const success = (state, { assets }) =>
  state.merge({
    fetching: false,
    error: null,
    assets,
    index: 0, // TODO quitar cuando arreglemos el login
    numAssets: assets.length,
    successCreate: false,
  })

// state failure request error
export const failure = (state, { error }) =>
  state.merge({
    fetching: false,
    error,
    assets: null,
    products: [],
    successCreate: false,
  })

// load next offset asset list
export const loadNextContent = (state) => state

// load previous offset asset list
export const loadPreviousContent = (state) => state

// set assets loaded
export const setAssetsLoaded = (state, { assetsLoaded }) => state.merge({ assetsLoaded })

// set offset to state
export const setOffset = (state, { offset }) => state.merge({ offset })

// set index to state
export const setIndex = (state, { index }) => state.merge({ index })

// set changeOffset to state
export const setChangeOffset = (state, { changeOffset }) => state.merge({ changeOffset })

// search in assets
export const setSearch = (state, { search }) => state.merge({ search })

// get assets to create
export const setCreate = (state) => state

// search in assets
export const setCreateSuccess = (state, { products }) => state.merge({ products })

// set order to state
export const setOrder = (state, { order }) => state.merge({ order })

// set showOwner to state
export const setShowOwner = (state, { showOwner }) => state.merge({ showOwner })

// set showAuthorizathed to state
export const setShowAuthorizathed = (state, { showAuthorizathed }) => state.merge({ showAuthorizathed })

// set showStateClosed to state
export const setShowStateClosed = (state, { showStateClosed }) => state.merge({ showStateClosed })

// set showStateOpen to state
export const setShowStateOpen = (state, { showStateOpen }) => state.merge({ showStateOpen })


// set assetCreated to state
export const setSuccessCreate = (state) => state.merge({ successCreate: !state.successCreate })

// reset the asset reducer
export const reset = () => INITIAL_STATE

/* ------------- Hookup Reducers To Types ------------- */

export const reducer = createReducer(INITIAL_STATE, {
  [Types.MY_ASSETS_REQUEST]: request,
  [Types.MY_ASSETS_SUCCESS]: success,
  [Types.MY_ASSETS_FAILURE]: failure,
  [Types.MY_ASSETS_LOAD_NEXT_CONTENT]: loadNextContent,
  [Types.MY_ASSETS_LOAD_PREVIOUS_CONTENT]: loadPreviousContent,
  [Types.MY_ASSETS_SET_OFFSET]: setOffset,
  [Types.MY_ASSETS_CHANGE_OFFSET]: setChangeOffset,
  [Types.MY_ASSETS_SET_INDEX]: setIndex,
  [Types.MY_ASSETS_SET_ORDER]: setOrder,
  [Types.MY_ASSETS_SET_ASSETS_LOADED]: setAssetsLoaded,
  [Types.MY_ASSETS_RESET]: reset,
  [Types.MY_ASSETS_SEARCH]: setSearch,
  [Types.MY_ASSETS_CREATE]: setCreate,
  [Types.MY_ASSETS_CREATE_SUCCESS]: setCreateSuccess,
  [Types.MY_ASSETS_SET_SHOW_OWNER]: setShowOwner,
  [Types.MY_ASSETS_SET_SHOW_AUTHORIZATHED]: setShowAuthorizathed,
  [Types.MY_ASSETS_SET_SHOW_STATE_CLOSED]: setShowStateClosed,
  [Types.MY_ASSETS_SET_SHOW_STATE_OPEN]: setShowStateOpen,
  [Types.MY_ASSETS_SET_SUCCESS_CREATED]: setSuccessCreate,
})
