import React from 'react'
import { View } from 'react-native'

import { connect } from 'react-redux'
import { Stack, ThemeContext } from '@telefonica/mistica'

import styles from './configuration-screen.styles'
import LanguagePicker from '../../shared/components/language-picker/language-picker'
import DarkModePicker from '../../shared/components/dark-mode-picker/dark-mode-picker'

function ConfigurationScreen(props) {
  const { colors } = React.useContext(ThemeContext)
  return (
    <View style={[styles.container, styles.mainContainer, { backgroundColor: colors.backgroundContainer }]}>
      <Stack space={16}>
        <LanguagePicker />
        <DarkModePicker />
      </Stack>
    </View>
  )
}

const mapStateToProps = (state) => ({ account: state.account.account })
const mapDispatchToProps = (dispatch) => ({})
export default connect(mapStateToProps, mapDispatchToProps)(ConfigurationScreen)
