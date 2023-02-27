import { createReducer, createActions } from 'reduxsauce'
import Immutable from 'seamless-immutable'
/* ------------- Types and Action Creators ------------- */

const { Types, Creators } = createActions({
  assetActionReset: [],
  assetActionRequest: ['isAuthorised', 'assetId', 'index'],
  assetActionSuccess: ['assetList'],
  assetActionFailure: ['error'],
  assetActionCreate: ['newAsset'],
  assetActionCreateFailure: ['error'],
  assetActionUpdate: ['asset'],
  assetActionUpdateFailure: ['error'],
  assetActionActionRequest: ['assets'],
  assetActionActionSuccess: ['actionsList'],
  assetActionActionFailure: ['error'],
})

export const AssetActionTypes = Types
export default Creators

/* ------------- Initial State ------------- */

export const INITIAL_STATE = Immutable({
  fetching: false,
  error: null,
  assetList: [],
  actionsList: [],
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
    assetList: [],
    actionsList : []
  })

// reset the asset reducer
export const reset = () => INITIAL_STATE

export const create = (state) => state

export const update = (state) => state

export const actionSuccess = (state, { actionsList }) =>
  state.merge({
    fetching: false,
    error: null,
    actionsList: actionsList
  })

/* ------------- Hookup Reducers To Types ------------- */

export const reducer = createReducer(INITIAL_STATE, {
  [Types.ASSET_ACTION_REQUEST]: request,
  [Types.ASSET_ACTION_SUCCESS]: success,
  [Types.ASSET_ACTION_FAILURE]: failure,
  [Types.ASSET_ACTION_RESET]: reset,
  [Types.ASSET_ACTION_CREATE]: create,
  [Types.ASSET_ACTION_CREATE_FAILURE]: failure,
  [Types.ASSET_ACTION_UPDATE]: update,
  [Types.ASSET_ACTION_UPDATE_FAILURE]: failure,
  [Types.ASSET_ACTION_ACTION_REQUEST]: request,
  [Types.ASSET_ACTION_ACTION_SUCCESS]: actionSuccess,
  [Types.ASSET_ACTION_ACTION_FAILURE]: failure,
})
