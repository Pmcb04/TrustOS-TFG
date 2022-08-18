import React from 'react'
import { useTranslation } from 'react-i18next'
import { View, Text, Pressable } from 'react-native'
import { styles } from './language-picker.styles'

const LanguagePicker = () => {
  const { t, i18n } = useTranslation() //i18n instance

  //array with all supported languages
  const languages = [
    { name: 'en', label: t('ENGLISH') },
    { name: 'es', label: t('SPAIN') },
  ]

  const LanguageItem = ({ name, label }) => (
    <Pressable
      onPress={() => {
        i18n.changeLanguage(name) //changes the app language
      }}>
      <Text>{label}</Text>
    </Pressable>
  )

  return (
    <View>
      <Text>{t('TITLE')}</Text>
      {languages.map((lang) => (
        <LanguageItem {...lang} key={lang.name} />
      ))}
      <Text>{i18n.language}</Text>
    </View>
  )
}

export default LanguagePicker
