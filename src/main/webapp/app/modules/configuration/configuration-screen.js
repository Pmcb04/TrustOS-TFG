import React from 'react'
import { View } from 'react-native'
import LanguagePicker from '../../shared/components/language-picker/language-picker'
import { connect } from 'react-redux'

import styles from './configuration-screen.styles'

function ConfigurationScreen({ navigation }) {
  return (
    <View>
      <LanguagePicker />
    </View>
  )
}

const mapStateToProps = (state) => ({ account: state.account.account })
const mapDispatchToProps = (dispatch) => ({})
export default connect(mapStateToProps, mapDispatchToProps)(ConfigurationScreen)
