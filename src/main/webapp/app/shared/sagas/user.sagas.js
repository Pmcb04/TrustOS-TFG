import { call, put } from 'redux-saga/effects'
import UserActions from '../reducers/user.reducer'
import { callApi } from './call-api.saga'

function* getUser(api, action) {
  const { userId } = action
  // make the call to the api
  const apiCall = call(api.getUser, userId)
  const response = yield call(callApi, apiCall)

  // success?
  if (response.ok) {
    yield put(UserActions.userSuccess(response.data))
  } else {
    yield put(UserActions.userFailure(response.data))
  }
}

function* getAllUsers(api, action) {
  const { options } = action
  // make the call to the api
  const apiCall = call(api.getAllUsers, options)
  const response = yield call(callApi, apiCall)

  // success?
  if (response.ok) {
    yield put(UserActions.userAllSuccess(response.data))
  } else {
    yield put(UserActions.userAllFailure(response.data))
  }
}

function* updateUser(api, action) {
  const { user } = action
  // make the call to the api
  const idIsNotNull = !(user.id === null || user.id === undefined)
  const apiCall = call(idIsNotNull ? api.updateUser : api.createUser, user)
  const response = yield call(callApi, apiCall)

  // success?
  if (response.ok) {
    yield put(UserActions.userUpdateSuccess(response.data))
  } else {
    yield put(UserActions.userUpdateFailure(response.data))
  }
}

function* deleteUser(api, action) {
  const { userId } = action
  // make the call to the api
  const apiCall = call(api.deleteUser, userId)
  const response = yield call(callApi, apiCall)

  // success?
  if (response.ok) {
    yield put(UserActions.userDeleteSuccess())
  } else {
    yield put(UserActions.userDeleteFailure(response.data))
  }
}

export default {
  getUser,
  getAllUsers,
  deleteUser,
  updateUser,
}
