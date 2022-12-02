import React from 'react'
import { View } from 'react-native'

import { connect } from 'react-redux'
import { useTranslation } from 'react-i18next'

import { Stack, ThemeContext } from '@telefonica/mistica'

import styles from './configuration-screen.styles'
import ListOptionsChips from '../../../shared/components/list-options-chips/list-options-chips'

import { IconMoonRegular, IconSunRegular } from '@telefonica/mistica'

// array with all types of modes themes
const themes = [
  { value: 'light', icon: <IconSunRegular /> },
  { value: 'dark', icon: <IconMoonRegular /> },
]

//array with all supported languages
const languages = [
  { value: 'en', icon: 'INGLES' },
  { value: 'es', icon: 'ESPAÑA' },
]

function ConfigurationScreen(props) {
  const { colors } = React.useContext(ThemeContext)
  const { t, i18n } = useTranslation() //i18n instance

  // function changeTheme(value) {
  //   console.log(value)
  //   setTheme(value)
  //   // window.location.reload(true) // refress app
  // }

  // function changeLanguage(name) {
  //   console.log(name)
  //   i18n.changeLanguage(name) //changes the app language
  //   // setLanguage(name)
  //   window.location.reload(true) // refress app
  // }

  function imprimir(value) {
    console.log(value) // TODO obtiene OK el valor de las opciones; ahora hay que cambiar para actualizar el usuario y recargar la pagina (falta almacenar los valores en la base de datos)
  }

  return (
    <View style={[styles.container, styles.mainContainer, { backgroundColor: colors.backgroundContainer }]}>
      <Stack space={16}>
        <ListOptionsChips title={t('SELECT_LANGUAGE')} options={languages} defaultOption={languages[0].value} callback={imprimir} />
        <ListOptionsChips title={t('SELECT_THEME')} options={themes} defaultOption={themes[0].value} callback={imprimir} />
      </Stack>
    </View>
  )
}

const mapStateToProps = (state) => ({ account: state.account.account })
const mapDispatchToProps = (dispatch) => ({})
export default connect(mapStateToProps, mapDispatchToProps)(ConfigurationScreen)
