import { createReducer, createActions } from 'reduxsauce'
import Immutable from 'seamless-immutable'
/* ------------- Types and Action Creators ------------- */

const { Types, Creators } = createActions({
  assetCreateRequest: [],
  assetCreateSuccess: [],
  assetCreateFailure: ['error'],
  assetCreateSetName: ['name'],
})

export const AssetCreateTypes = Types
export default Creators

/* ------------- Initial State ------------- */

export const INITIAL_STATE = Immutable({
  fetching: false,
  error: null,
  name: '',
})

/* ------------- Reducers ------------- */

// request to init load the asset
export const request = (state) =>
  state.merge({
    fetching: true,
    error: null,
    name: '',
  })

// state sucess request completed
export const success = (state) =>
  state.merge({
    fetching: false,
    error: null,
    name: '',
  })

// state failure request error
export const failure = (state, { error }) =>
  state.merge({
    fetching: false,
    error,
    name: '',
  })

// set name of the asset to create
export const setName = (state, { name }) => state.merge({ name })

/* ------------- Hookup Reducers To Types ------------- */

export const reducer = createReducer(INITIAL_STATE, {
  [Types.ASSET_CREATE_REQUEST]: request,
  [Types.ASSET_CREATE_SUCCESS]: success,
  [Types.ASSET_CREATE_FAILURE]: failure,
  [Types.ASSET_CREATE_SET_NAME]: setName,
})
