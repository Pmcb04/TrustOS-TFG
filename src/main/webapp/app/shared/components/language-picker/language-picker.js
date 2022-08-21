import React from 'react'
import { useTranslation } from 'react-i18next'
import { connect } from 'react-redux'
import AppActions from '../../reducers/app-state.reducer'

import { styles } from './language-picker.styles'
import { DoubleField, Text3, Select } from '@telefonica/mistica'

const LanguagePicker = (props) => {
  const { language, setLanguage } = props
  const { t, i18n } = useTranslation() //i18n instance

  //array with all supported languages
  const languages = [
    { value: 'en', text: t('ENGLISH') },
    { value: 'es', text: t('SPAIN') },
  ]

  function changeLanguage(name) {
    console.log(name)
    i18n.changeLanguage(name) //changes the app language
    setLanguage(name)
    window.location.reload(true) // refress app
  }

  return (
    <DoubleField fullWidth>
      <Text3>{t('SELECT_LANGUAGE')}</Text3>
      <Select onChangeValue={changeLanguage} name="languages" label={t('LANGUAGE')} value={language} options={languages} />
    </DoubleField>
  )
}

const mapStateToProps = (state) => ({ language: state.appState.language })
const mapDispatchToProps = (dispatch) => {
  return {
    setLanguage: (language) => dispatch(AppActions.setLanguage(language)),
  }
}
export default connect(mapStateToProps, mapDispatchToProps)(LanguagePicker)
