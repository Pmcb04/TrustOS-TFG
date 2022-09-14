import { createReducer, createActions } from 'reduxsauce'
import Immutable from 'seamless-immutable'
/* ------------- Types and Action Creators ------------- */

const { Types, Creators } = createActions({
  assetDetailsEdit: [],
  assetDetailsReset: [],
  assetDetailsRequest: ['isAuthorised', 'assetId'],
  assetDetailsSuccess: ['asset'],
  assetDetailsFailure: ['error'],
})

export const AssetDetailsTypes = Types
export default Creators

/* ------------- Initial State ------------- */

export const INITIAL_STATE = Immutable({
  edit_fields: false,
  fetching: false,
  asset: null,
  error: null,
  assetId: null,
  isAuthorised: null,
})

/* ------------- Reducers ------------- */

// request to init load all assets
export const request = (state, { isAuthorised, assetId }) =>
  state.merge({
    fetching: true,
    error: null,
    asset: null,
    edit_fields: false,
    isAuthorised,
    assetId,
  })

// state sucess request completed
export const success = (state, { asset }) =>
  state.merge({
    fetching: false,
    error: null,
    asset,
  })

// state failure request error
export const failure = (state, { error }) =>
  state.merge({
    fetching: false,
    error,
    asset: null,
  })

// click in edit buttom in details asset page
export const edit = (state) => state.merge({ edit_fields: !state.edit_fields })

// reset the asset reducer
export const reset = () => INITIAL_STATE

/* ------------- Hookup Reducers To Types ------------- */

export const reducer = createReducer(INITIAL_STATE, {
  [Types.ASSET_DETAILS_REQUEST]: request,
  [Types.ASSET_DETAILS_SUCCESS]: success,
  [Types.ASSET_DETAILS_FAILURE]: failure,
  [Types.ASSET_DETAILS_EDIT]: edit,
  [Types.ASSET_DETAILS_RESET]: reset,
})
