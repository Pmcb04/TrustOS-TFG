import { createReducer, createActions } from 'reduxsauce'
import Immutable from 'seamless-immutable'
/* ------------- Types and Action Creators ------------- */

const { Types, Creators } = createActions({
  assetListReset: [],
  assetListInit: [],
  assetListRequest: [],
  assetListSuccess: ['assets'],
  assetListFailure: ['error'],
  assetListLoadNextContent: [],
  assetListLoadPreviousContent: [],
  assetListSetOffset: ['offset'],
  assetListSetIndex: ['index'],
  assetListSetAssetsLoaded: ['assetsLoaded'],
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
  offset: 0,
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
  })

// state sucess request completed
export const success = (state, { assets }) =>
  state.merge({
    fetching: false,
    error: null,
    assets,
    numAssets: assets.length,
  })

// state failure request error
export const failure = (state, { error }) =>
  state.merge({
    fetching: false,
    error,
    assets: null,
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

// reset the asset reducer
export const reset = () => INITIAL_STATE

// init asset list
export const init = (state) => state

/* ------------- Hookup Reducers To Types ------------- */

export const reducer = createReducer(INITIAL_STATE, {
  [Types.ASSET_LIST_REQUEST]: request,
  [Types.ASSET_LIST_SUCCESS]: success,
  [Types.ASSET_LIST_FAILURE]: failure,
  [Types.ASSET_LIST_LOAD_NEXT_CONTENT]: loadNextContent,
  [Types.ASSET_LIST_LOAD_PREVIOUS_CONTENT]: loadPreviousContent,
  [Types.ASSET_LIST_SET_OFFSET]: setOffset,
  [Types.ASSET_LIST_SET_INDEX]: setIndex,
  [Types.ASSET_LIST_SET_ASSETS_LOADED]: setAssetsLoaded,
  [Types.ASSET_LIST_RESET]: reset,
  [Types.ASSET_LIST_INIT]: init,
})
