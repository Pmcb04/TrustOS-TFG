import { createReducer, createActions } from 'reduxsauce'
import Immutable from 'seamless-immutable'

/* ------------- Types and Action Creators ------------- */

const { Types, Creators } = createActions({
  setRehydrationComplete: null,
  setLanguage: ['language'],
  setTheme: ['theme'],
})

export const AppStateTypes = Types
export default Creators

/* ------------- Initial State ------------- */

export const INITIAL_STATE = Immutable({
  rehydrationComplete: false,
  language: 'en',
  theme: 'auto',
})

/* ------------- Reducers ------------- */

// rehydration is complete
export const setRehydrationComplete = (state) => state.merge({ rehydrationComplete: true })

// set language in app state
export const setLanguage = (state, { language }) => state.merge({ language })

// set theme in app state
export const setTheme = (state, { theme }) => state.merge({ theme })

/* ------------- Hookup Reducers To Types ------------- */

export const reducer = createReducer(INITIAL_STATE, {
  [Types.SET_REHYDRATION_COMPLETE]: setRehydrationComplete,
  [Types.SET_LANGUAGE]: setLanguage,
  [Types.SET_THEME]: setTheme,
})
