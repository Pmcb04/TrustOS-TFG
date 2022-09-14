import React from 'react'
import { View } from 'react-native'
import styles from './table-update.styles'
import { connect } from 'react-redux'
import { ScrollView } from 'react-native-gesture-handler'

import { Text3, ThemeContext, Inline, IconArrowLineRightLight } from '@telefonica/mistica'

function Row(props) {
  const { colors } = React.useContext(ThemeContext)
  const { field, before, after } = props
  return (
    <View style={styles.row}>
      <View style={[styles.rowData, { borderColor: colors.border }]}>
        <Text3 medium>{field}</Text3>
      </View>
      <View style={[styles.rowData, { borderColor: colors.border }]}>
        <Inline space={8}>
          <Text3 color={colors.error} decoration="line-through">
            {before}
          </Text3>
          <IconArrowLineRightLight size={16} />
          <Text3 color={colors.successHigh}>{after}</Text3>
        </Inline>
      </View>
    </View>
  )
}

function process(dataBefore, dataAfter) {
  return Object.keys(dataBefore).map((key) => {
    if (typeof dataBefore[key] === 'object' && !Array.isArray(dataBefore[key])) {
      return process(dataBefore[key], dataAfter)
    } else {
      return (
        dataBefore[key].toString() !== dataAfter[key].toString() && (
          <Row field={key} before={dataBefore[key].toString()} after={dataAfter[key].toString()} />
        )
      )
    }
  })
}

function TableUpdate(props) {
  const { colors } = React.useContext(ThemeContext)
  const { asset } = props
  const { data } = props

  return (
    <View style={[styles.container, styles.mainContainer]}>
      <View style={styles.row}>
        <View style={[styles.rowData, { borderColor: colors.border }]}>
          <Text3>Value</Text3>
        </View>
        <View style={[styles.rowData, { borderColor: colors.border }]}>Change</View>
      </View>
      {process(asset.metadata, data)}
    </View>
  )
}

const mapStateToProps = (state) => {
  return {
    asset: state.assetDetails.asset,
  }
}
const mapDispatchToProps = (dispatch) => {
  return {}
}
export default connect(mapStateToProps, mapDispatchToProps)(TableUpdate)
