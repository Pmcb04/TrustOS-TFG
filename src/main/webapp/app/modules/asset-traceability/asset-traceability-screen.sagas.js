import { call, put, select, all } from 'redux-saga/effects'
import AssetTraceabilityActions from './asset-traceability-screen.reducer'

export const selectIsAuthorised = (state) => state.assetTraceability.isAuthorised
export const selectAssetId = (state) => state.assetTraceability.assetId
export const selectTimestampInit = (state) => state.assetTraceability.timestampInit
export const selectTimestampEnd = (state) => state.assetTraceability.timestampEnd


export function* getAssetTraceabilityBefore(api, action){

  const { assetId } = action

  let nodes = []
  let links = []

  const response = yield getAsset(api, assetId)
  nodes.push({id: response.assetId, color: "purple", type: response.data.type})
  yield put(AssetTraceabilityActions.assetTraceabilityRequest(false, response.assetId))

  const [newNodes, newLinks] = yield getAssetBefore(api, response, response.data.assetBefore, nodes, links)
  yield put(AssetTraceabilityActions.assetTraceabilitySuccessAssetBefore(newNodes, newLinks))
}

function* getAssetBefore(api, son, fathers, nodes, links){

  // add the firsts node to graph
  if(fathers){

    // get all asset before 
    const assetsFather = yield all(fathers.map(father => getAsset(api, father)))

    assetsFather.forEach((assetFather) => {
        // add the asset before to graph
        nodes.push({ id: assetFather.assetId, color: "blue", type: assetFather.data.type })
        // link the asset with the asset before
        links.push({ source: assetFather.assetId, target: son.assetId })                
    })

    // calculate the next asset before
    yield all(assetsFather.map((assetFather, index) => 
      assetFather.data.assetBefore ? getAssetBefore(api, assetFather, assetFather.data.assetBefore, nodes, links) : null                                  
    ))

  }
  return [nodes, links]

}


export function* exportTraceabilityComplete(api){

  const assetId = yield select(selectAssetId)

  let nodes = []
  let links = []

  const response = yield getAsset(api, assetId)
  nodes.push({node : response.data})

  const [newNodes, newLinks] = yield getTraceabilityComplete(api, response, response.data.assetBefore, nodes, links)
  download(JSON.stringify({nodes : newNodes, relations : newLinks}), "traceability_" + assetId +".json", "text")
}

// Function to download data to a file
function download(data, filename, type) {
  var file = new Blob([data], {type: type});
  if (window.navigator.msSaveOrOpenBlob) // IE10+
      window.navigator.msSaveOrOpenBlob(file, filename);
  else { // Others
      var a = document.createElement("a"),
              url = URL.createObjectURL(file);
      a.href = url;
      a.download = filename;
      document.body.appendChild(a);
      a.click();
      setTimeout(function() {
          document.body.removeChild(a);
          window.URL.revokeObjectURL(url);  
      }, 0); 
  }
}

function* getTraceabilityComplete(api, son, fathers, nodes, links){

  // add the firsts node to graph
  if(fathers){

    // get all asset before 
    const assetsFather = yield all(fathers.map(father => getAsset(api, father)))

    assetsFather.forEach((assetFather) => {
        // add the asset before to graph
        nodes.push({ node: assetFather })
        // link the asset with the asset before
        links.push({ son: assetFather.assetId, father: son.assetId })                
    })

    // calculate the next asset before
    yield all(assetsFather.map((assetFather, index) => 
      assetFather.data.assetBefore ? getTraceabilityComplete(api, assetFather, assetFather.data.assetBefore, nodes, links) : null                                  
    ))

  }
  return [nodes, links]

}

function* getAsset(api, assetId) {
  const isAuthorised = false

  const response = yield call(api.getAsset, isAuthorised, assetId)
  // success?
  if (response.ok) {
   return response.data
  } else {
    put(AssetTraceabilityActions.assetTraceabilityFailure(response.data))
  }
}

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

  const body = {
    init: timestampInit,
    end: timestampEnd,
  }

  const response = yield call(api.getAssetRangeTraceability, isAuthorised, assetId, body)
  
  // success?
  if (response.ok) {
    yield put(AssetTraceabilityActions.assetTraceabilitySuccess(response.data))
  } else {
    yield put(AssetTraceabilityActions.assetTraceabilityFailure(response.data))
  }
}
