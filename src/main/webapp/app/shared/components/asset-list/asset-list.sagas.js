import { call, put, all } from 'redux-saga/effects'
import AssetListActions from '../asset-list/asset-list.reducer'

export function* getAssets(api) {
  // make the call to the api

  // TODO mover a el reducer para que pueda coger el estado de algun filtro
  const isAuthorised = false
  // FIXME eliminar cuando tengamos el login resuelto
  const account = {
    id: 'did:vtn:trustid:0106a4d4a997ac85895ed20cbdaafe6a58c5bd8d7311b446d11502bfe9942311',
    password: 'KMv52hzgfQYW',
  }
  const token = yield call(api.loginTrustOS, account)
  yield call(api.setTrustOSToken, token.data.message)
  const response = yield call(api.getAssets, isAuthorised)

  // success?
  if (response.ok) {
    // obtain all data for all assets
    // FIXME ver como podemos hacer paginacion
    console.log(response.data)

    yield put(AssetListActions.assetListSuccess(response.data))
    console.log('RESPONSE OK')
  } else {
    yield put(AssetListActions.assetListFailure(response.data))
    console.log('RESPONSE NOT OK')
  }
}
