import { call, put, select } from 'redux-saga/effects'
import AssetTraceabilityActions from './asset-traceability-screen.reducer'

export const selectIsAuthorised = (state) => state.assetDetails.isAuthorised
export const selectAssetId = (state) => state.assetDetails.assetId

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
