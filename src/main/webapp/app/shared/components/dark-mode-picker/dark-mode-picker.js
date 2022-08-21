import React from 'react'
import { useTranslation } from 'react-i18next'
import { connect } from 'react-redux'
import AppActions from '../../reducers/app-state.reducer'

import { styles } from './dark-mode-picker.styles'
import { DoubleField, Text3, Select } from '@telefonica/mistica'

const DarkModePicker = (props) => {
  const { theme, setTheme } = props
  const { t } = useTranslation() //i18n instance

  //array with all supported languages
  const themes = [
    { value: 'light', text: t('LIGHT') },
    { value: 'dark', text: t('DARK') },
    { value: 'auto', text: t('DEFAULT') },
  ]

  function changeTheme(value) {
    console.log(value)
    setTheme(value)
    // window.location.reload(true) // refress app
  }

  return (
    <DoubleField fullWidth>
      <Text3>{t('SELECT_THEME')}</Text3>
      <Select onChangeValue={changeTheme} value={theme} name="themes" label={t('THEME')} options={themes} />
    </DoubleField>
  )
}

const mapStateToProps = (state) => ({ theme: state.appState.theme })
const mapDispatchToProps = (dispatch) => {
  return {
    setTheme: (theme) => dispatch(AppActions.setTheme(theme)),
  }
}
export default connect(mapStateToProps, mapDispatchToProps)(DarkModePicker)
