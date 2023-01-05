import React from 'react'
import { View } from 'react-native'
import styles from './table-update.styles'
import { connect } from 'react-redux'
import { useTranslation } from 'react-i18next'

import { Text3, ThemeContext, Inline, IconArrowLineRightLight } from '@telefonica/mistica'

function Row(props) {
  const { colors } = React.useContext(ThemeContext)
  const { field, before, after } = props
  return (
    <View key={field + 'value'} style={styles.row}>
      <View key={field} style={[styles.rowData, { borderColor: colors.border }]}>
        <Text3 key={field} medium>
          {field}
        </Text3>
      </View>
      <View key={field + 'change'} style={[styles.rowData, { borderColor: colors.border }]}>
        <Inline key={field} space={8}>
          {before && (
            <>
              <Text3 key={before} color={colors.error} decoration="line-through">
                {before}
              </Text3>
              <IconArrowLineRightLight key={'arrow'} size={16} />
            </>
          )}

          <Text3 key={after} color={colors.successHigh}>
            {after}
          </Text3>
        </Inline>
      </View>
    </View>
  )
}

function process(dataBefore, dataAfter) {
  if (!Object.keys(dataBefore).length) {
    // dataBefore empty
    return Object.keys(dataAfter).map((key) => {
      if (typeof dataAfter[key] === 'object' && !Array.isArray(dataAfter[key])) {
        return process(dataAfter[key], dataAfter)
      } else {
        return <Row key={key} field={key} after={dataAfter[key].toString()} />
      }
    })
  }

  // dataBefore not empty
  return Object.keys(dataBefore).map((key) => {
    if (dataBefore[key] != null && typeof dataBefore[key] === 'object' && !Array.isArray(dataBefore[key])) {
      return process(dataBefore[key], dataAfter)
    } else {
      console.log('KEY _> ', key, 'condition _> ', dataBefore[key].toString() !== dataAfter[key].toString())
      return (
        dataBefore[key].toString() !== dataAfter[key].toString() && (
          <Row key={key} field={key} before={dataBefore[key].toString()} after={dataAfter[key].toString()} />
        )
      )
    }
  })
}

function TableUpdate(props) {
  const { colors } = React.useContext(ThemeContext)
  const { dataBefore, dataAfter } = props
  const { t } = useTranslation() //i18n instance

  return (
    <View style={[styles.container, styles.mainContainer]}>
      <View style={styles.row}>
        <View style={[styles.rowData, { borderColor: colors.border }]}>
          <Text3>{t('ATTRIBUTE')}</Text3>
        </View>
        <View style={[styles.rowData, { borderColor: colors.border }]}>
          <Text3>{t('VALUE')}</Text3>
        </View>
      </View>
      {process(dataBefore, dataAfter)}
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
