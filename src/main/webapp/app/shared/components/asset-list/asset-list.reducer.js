import { createReducer, createActions } from 'reduxsauce'
import Immutable from 'seamless-immutable'
/* ------------- Types and Action Creators ------------- */

const { Types, Creators } = createActions({
  assetListReset: [],
  assetListRequest: [],
  assetListSuccess: ['assets'],
  assetListFailure: ['error'],
})

export const AssetListTypes = Types
export default Creators

/* ------------- Initial State ------------- */

export const INITIAL_STATE = Immutable({
  assets: null,
  fetching: false,
  error: null,
})

/* ------------- Reducers ------------- */

export const request = (state) => state.merge({ fetching: true, error: null, assets: null })

export const success = (state, { assets }) => state.merge({ fetching: false, error: null, assets })

export const failure = (state, { error }) => state.merge({ fetching: false, error, assets: null })

// reset the asset reducer
export const reset = () => INITIAL_STATE

/* ------------- Hookup Reducers To Types ------------- */

export const reducer = createReducer(INITIAL_STATE, {
  [Types.ASSET_LIST_REQUEST]: request,
  [Types.ASSET_LIST_SUCCESS]: success,
  [Types.ASSET_LIST_FAILURE]: failure,
  [Types.ASSET_LIST_RESET]: reset,
})
