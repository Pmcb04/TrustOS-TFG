import { createReducer, createActions } from 'reduxsauce'
import Immutable from 'seamless-immutable'
/* ------------- Types and Action Creators ------------- */

const { Types, Creators } = createActions({
  registerRequest: ['user'],
  registerSuccess: [],
  registerFailure: ['error'],
  registerRequestRoles : [],
  registerSuccessRoles : ['roles'],
})

export const RegisterTypes = Types
export default Creators

/* ------------- Initial State ------------- */

export const INITIAL_STATE = Immutable({
  error: null,
  fetching: false,
  roles : []
})

/* ------------- Reducers ------------- */

// we're attempting to register
export const request = (state) => state.merge({ fetching: true })

// we've successfully registered
export const success = (state) => state.merge({ fetching: false, error: null })

// we've had a problem registering
export const failure = (state, { error }) => state.merge({ fetching: false, error })


export const requestRoles = (state) => state.merge({ fetching: true, roles: [] })

export const successRoles = (state, {roles}) => state.merge({ fetching: false, error: null, roles })

/* ------------- Hookup Reducers To Types ------------- */

export const reducer = createReducer(INITIAL_STATE, {
  [Types.REGISTER_REQUEST]: request,
  [Types.REGISTER_SUCCESS]: success,
  [Types.REGISTER_FAILURE]: failure,
  [Types.REGISTER_REQUEST_ROLES]: requestRoles,
  [Types.REGISTER_SUCCESS_ROLES]: successRoles,
})

/* ------------- Selectors ------------- */
