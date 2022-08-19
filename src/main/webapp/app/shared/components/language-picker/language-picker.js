import React from 'react'
import { useTranslation } from 'react-i18next'
import { styles } from './language-picker.styles'
import { DoubleField, Text3, Select } from '@telefonica/mistica'

const LanguagePicker = () => {
  const { t, i18n } = useTranslation() //i18n instance

  //array with all supported languages
  const languages = [
    { value: 'en', text: t('ENGLISH') },
    { value: 'es', text: t('SPAIN') },
  ]

  function changeLanguage(name) {
    i18n.changeLanguage(name) //changes the app language
    window.location.reload(true) // refress app
  }

  return (
    <DoubleField fullWidth>
      <Text3>{t('SELECT_LANGUAGE')}</Text3>
      <Select onChangeValue={changeLanguage} name="languages" label={t('LANGUAGE')} value={i18n.language} options={languages} />
    </DoubleField>
  )
}

export default LanguagePicker
