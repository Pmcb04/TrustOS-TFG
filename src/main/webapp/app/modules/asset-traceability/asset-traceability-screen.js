import React from 'react'
import { View } from 'react-native'
import { useTranslation } from 'react-i18next'

import styles from './asset-traceability-screen.styles'
import { connect } from 'react-redux'
import { ThemeContext, Text7 } from '@telefonica/mistica'

function AssetTraceabilityScreen(props) {
  const { colors } = React.useContext(ThemeContext)
  const { assetId, isAuthorised } = props.route.params
  const { t } = useTranslation() //i18n instance

  return (
    <View style={[styles.container, { backgroundColor: colors.background }]}>
      <Text7>TRACEABILITY SCREEN</Text7>
      <Text7>ASSET {assetId}</Text7>
      <Text7>AUTHORISED {isAuthorised}</Text7>
    </View>
  )
}

const mapStateToProps = (state) => {
  return {}
}
const mapDispatchToProps = (dispatch) => {
  return {}
}
export default connect(mapStateToProps, mapDispatchToProps)(AssetTraceabilityScreen)
