import { createReducer, createActions } from 'reduxsauce'
import Immutable from 'seamless-immutable'
/* ------------- Types and Action Creators ------------- */

const { Types, Creators } = createActions({
  assetActionReset: [],
  assetActionRequest: ['isAuthorised', 'assetId', 'index'],
  assetActionSuccess: ['assetList'],
  assetActionFailure: ['error'],
  assetActionCreate: ['newAsset'],
  assetActionCreateSuccess: [],
  assetActionCreateFailure: ['error'],
})

export const AssetActionTypes = Types
export default Creators

/* ------------- Initial State ------------- */

export const INITIAL_STATE = Immutable({
  fetching: false,
  error: null,
  assetList: []
})

/* ------------- Reducers ------------- */

// request to init load the asset
export const request = (state) =>
  state.merge({
    fetching: true,
    error: null,
  })

// state sucess request completed
export const success = (state, { assetList }) => 
    state.merge({
        fetching: false,
        error: null,
        assetList: assetList
    })
 

// state failure request error
export const failure = (state, { error }) =>
  state.merge({
    fetching: false,
    error,
    assetList: []
  })

// reset the asset reducer
export const reset = () => INITIAL_STATE

export const create = (state) => state

/* ------------- Hookup Reducers To Types ------------- */

export const reducer = createReducer(INITIAL_STATE, {
  [Types.ASSET_ACTION_REQUEST]: request,
  [Types.ASSET_ACTION_SUCCESS]: success,
  [Types.ASSET_ACTION_FAILURE]: failure,
  [Types.ASSET_ACTION_RESET]: reset,
  [Types.ASSET_ACTION_CREATE]: create,
  [Types.ASSET_ACTION_CREATE_SUCCESS]: create,
  [Types.ASSET_ACTION_CREATE_FAILURE]: failure,
})
