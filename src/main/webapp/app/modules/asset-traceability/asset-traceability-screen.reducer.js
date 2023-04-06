import { createReducer, createActions } from 'reduxsauce'
import Immutable from 'seamless-immutable'
import { convertLocalDateToTimestamp } from '../../shared/util/date-transforms'

/* ------------- Types and Action Creators ------------- */

const { Types, Creators } = createActions({
  assetTraceabilityRequest: ['isAuthorised', 'assetId'],
  assetTraceabilityRangeRequest: ['isAuthorised', 'assetId'],
  assetTraceabilitySuccess: ['traceability'],
  assetTraceabilityFailure: ['error'],
  assetTraceabilitySetTransactionSelect: ['transactionSelect'],
  assetTraceabilitySetTimestampInit: ['timestampInit'],
  assetTraceabilitySetTimestampEnd: ['timestampEnd'],
  assetTraceabilityRequestAssetBefore: ['assetId'],
  assetTraceabilitySuccessAssetBefore: ['nodes', 'links'],
  assetTraceabilityChangeAssetSelected: ['assetId', 'nodes'],
  assetTraceabilityExport: ['assetId'],
})

export const AssetTraceabilityTypes = Types
export default Creators

/* ------------- Initial State ------------- */

export const INITIAL_STATE = Immutable({
  fetching: false,
  traceability: null,
  error: null,
  assetId: null,
  isAuthorised: null,
  transactionSelect: 0,
  timestampInit: 0,
  timestampEnd: convertLocalDateToTimestamp(new Date()),
  nodes : [],
  links : []
})

/* ------------- Reducers ------------- */

// request to init load the asset
export const request = (state, { isAuthorised, assetId }) =>
  state.merge({
    fetching: true,
    error: null,
    traceability: null,
    transactionSelect: 0,
    isAuthorised,
    assetId,
  })

// state sucess request completed
export const success = (state, { traceability }) =>
  state.merge({
    fetching: false,
    error: null,
    traceability,
  })

// state failure request error
export const failure = (state, { error }) =>
  state.merge({
    fetching: false,
    error,
    traceability: null,
  })

// set transactionSelect
export const setTransactionSelect = (state, { transactionSelect }) =>
  state.merge({
    transactionSelect,
  })

// set timestampInit
export const setTimestampInit = (state, { timestampInit }) =>
  state.merge({
    timestampInit,
  })

// set timestampEnd
export const setTimestampEnd = (state, { timestampEnd }) =>
  state.merge({
    timestampEnd,
  })


// request to init load the asset
export const requestAssetBefore = (state, { assetId }) =>
  state.merge({
    fetching: true,
    error: null,
    assetId,
    nodes: [],
    links: []
  })

// state sucess request completed
export const successAssetBefore = (state, { nodes, links }) =>
  state.merge({
    fetching: false,
    error: null,
    nodes, 
    links,
  })

export const changeSelected = (state, { assetId, nodes }) =>
  state.merge({
    fetching: false,
    error: null,
    assetId,
    nodes, 
})

export const exportTraceability = (state) => state

/* ------------- Hookup Reducers To Types ------------- */

export const reducer = createReducer(INITIAL_STATE, {
  [Types.ASSET_TRACEABILITY_REQUEST]: request,
  [Types.ASSET_TRACEABILITY_RANGE_REQUEST]: request,
  [Types.ASSET_TRACEABILITY_SUCCESS]: success,
  [Types.ASSET_TRACEABILITY_FAILURE]: failure,
  [Types.ASSET_TRACEABILITY_SET_TRANSACTION_SELECT]: setTransactionSelect,
  [Types.ASSET_TRACEABILITY_SET_TIMESTAMP_INIT]: setTimestampInit,
  [Types.ASSET_TRACEABILITY_SET_TIMESTAMP_END]: setTimestampEnd,
  [Types.ASSET_TRACEABILITY_REQUEST_ASSET_BEFORE]: requestAssetBefore,
  [Types.ASSET_TRACEABILITY_SUCCESS_ASSET_BEFORE]: successAssetBefore,
  [Types.ASSET_TRACEABILITY_CHANGE_ASSET_SELECTED]: changeSelected,
  [Types.ASSET_TRACEABILITY_EXPORT]: exportTraceability,
})
