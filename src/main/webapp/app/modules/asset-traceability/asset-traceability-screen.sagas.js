import { call, put, select } from 'redux-saga/effects'
import AssetTraceabilityActions from './asset-traceability-screen.reducer'

export const selectIsAuthorised = (state) => state.assetTraceability.isAuthorised
export const selectAssetId = (state) => state.assetTraceability.assetId
export const selectTimestampInit = (state) => state.assetTraceability.timestampInit
export const selectTimestampEnd = (state) => state.assetTraceability.timestampEnd

export function* getAssetTraceability(api) {
  const isAuthorised = yield select(selectIsAuthorised)
  const assetId = yield select(selectAssetId)

  const response = yield call(api.getAssetTraceability, isAuthorised, assetId)
  // success?
  if (response.ok) {
    yield put(AssetTraceabilityActions.assetTraceabilitySuccess(response.data))
  } else {
    yield put(AssetTraceabilityActions.assetTraceabilityFailure(response.data))
  }
}

export function* getAssetRangeTraceability(api) {
  const isAuthorised = yield select(selectIsAuthorised)
  const assetId = yield select(selectAssetId)
  const timestampInit = yield select(selectTimestampInit)
  const timestampEnd = yield select(selectTimestampEnd)

  // FIXME ver como podemos pasar el body, ahora esta pasando {}
  const body = {
    init: timestampInit,
    end: timestampEnd,
  }

  console.log('BODY_> ', body)

  const response = yield call(api.getAssetRangeTraceability, isAuthorised, assetId, body)
  // success?
  if (response.ok) {
    yield put(AssetTraceabilityActions.assetTraceabilitySuccess(response.data))
  } else {
    yield put(AssetTraceabilityActions.assetTraceabilityFailure(response.data))
  }
}
