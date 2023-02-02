import { createReducer, createActions } from 'reduxsauce'
import Immutable from 'seamless-immutable'
/* ------------- Types and Action Creators ------------- */

const { Types, Creators } = createActions({
  assetCreateRequest: ['newAsset'],
  assetCreateSuccess: ['assetId'],
  assetCreateFailure: ['error'],
})

export const AssetCreateTypes = Types
export default Creators

/* ------------- Initial State ------------- */

export const INITIAL_STATE = Immutable({
  fetching: false,
  error: null,
})

/* ------------- Reducers ------------- */

// request to init load the asset
export const request = (state) =>
  state.merge({
    fetching: true,
    error: null,
  })

// state sucess request completed
export const success = (state, { assetId }) =>
  state.merge({
    fetching: false,
    error: null,
    assetId,
  })

// state failure request error
export const failure = (state, { error }) =>
  state.merge({
    fetching: false,
    error,
    assetid: null,
  })

/* ------------- Hookup Reducers To Types ------------- */

export const reducer = createReducer(INITIAL_STATE, {
  [Types.ASSET_CREATE_REQUEST]: request,
  [Types.ASSET_CREATE_SUCCESS]: success,
  [Types.ASSET_CREATE_FAILURE]: failure,
})
