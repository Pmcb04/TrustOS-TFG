import { createReducer, createActions } from 'reduxsauce'
import Immutable from 'seamless-immutable'
/* ------------- Types and Action Creators ------------- */

const { Types, Creators } = createActions({
  assetDetailsEdit: [],
  assetDetailsReset: [],
})

export const AssetTypes = Types
export default Creators

/* ------------- Initial State ------------- */

export const INITIAL_STATE = Immutable({
  disabled_fields: true,
})

/* ------------- Reducers ------------- */

// click in edit buttom in details asset page
export const edit = (state) => state.merge({ disabled_fields: !state.disabled_fields })

// reset the asset reducer
export const reset = () => INITIAL_STATE

/* ------------- Hookup Reducers To Types ------------- */

export const reducer = createReducer(INITIAL_STATE, {
  [Types.ASSET_DETAILS_EDIT]: edit,
  [Types.ASSET_DETAILS_RESET]: reset,
})

/* ------------- Selectors ------------- */
// Is the current user logged in?
export const isLoggedIn = (accountState) => accountState.account !== null

export const getLogin = (accountState) => (accountState.account !== null ? accountState.account.login : 'anonymoususer')
