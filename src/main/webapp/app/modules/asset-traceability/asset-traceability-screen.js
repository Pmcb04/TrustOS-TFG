import React, { useEffect, useState } from 'react'
import { View } from 'react-native'
import { useTranslation } from 'react-i18next'
import AssetTraceabilityActions from './asset-traceability-screen.reducer'
import { convertTimestampToLocalDate } from '../../shared/util/date-transforms'

import styles from './asset-traceability-screen.styles'
import { connect } from 'react-redux'
import { ThemeContext, Text10, Spinner, BoxedRowList, BoxedRow, useWindowHeight } from '@telefonica/mistica'

import Metadata from '../../shared/components/metadata/metadata'
import { ScrollView } from 'react-native-gesture-handler'

function AssetTraceabilityScreen(props) {
  const { colors } = React.useContext(ThemeContext)
  const { assetId, isAuthorised } = props.route.params
  const { getAssetTraceability, traceability, error, fetching, setTransactionSelect, transactionSelect } = props
  const height = useWindowHeight()
  const { t } = useTranslation() //i18n instance

  useEffect(() => {
    getAssetTraceability(isAuthorised, assetId)
  }, [getAssetTraceability, isAuthorised, assetId])

  return (
    <>
      {error && (
        <View style={[styles.loading, { backgroundColor: colors.background }]}>
          <View style={styles.loadingText}>
            <Text10>Asset with id {assetId} not found...</Text10>
          </View>
        </View>
      )}
      {fetching && !traceability && (
        <View style={[styles.loading, { backgroundColor: colors.background }]}>
          <View style={styles.loadingText}>
            <Text10>Loading...</Text10>
            <Spinner size={64} />
          </View>
        </View>
      )}
      {!error && !fetching && (
        <View style={[styles.container, styles.mainContainer, { backgroundColor: colors.background }]}>
          <View style={[styles.list, { height: height }]}>
            <ScrollView contentContainerStyle={styles.contentContainer}>
              <BoxedRowList>
                {traceability.transactions.map((transaction, index) => (
                  <BoxedRow
                    title={convertTimestampToLocalDate(transaction.timestamp)}
                    key={transaction.hash}
                    isInverse={transactionSelect === index}
                    onPress={() => setTransactionSelect(index)}
                  />
                ))}
              </BoxedRowList>
            </ScrollView>
          </View>
          <View style={styles.metadata}>
            <Metadata data={traceability.transactions[transactionSelect].metadata} />
          </View>
        </View>
      )}
    </>
  )
}

const mapStateToProps = (state) => {
  return {
    error: state.assetTraceability.error,
    fetching: state.assetTraceability.fetching,
    traceability: state.assetTraceability.traceability,
    transactionSelect: state.assetTraceability.transactionSelect,
  }
}
const mapDispatchToProps = (dispatch) => {
  return {
    getAssetTraceability: (isAuthorised, assetId) => dispatch(AssetTraceabilityActions.assetTraceabilityRequest(isAuthorised, assetId)),
    setTransactionSelect: (transactionSelect) =>
      dispatch(AssetTraceabilityActions.assetTraceabilitySetTransactionSelect(transactionSelect)),
  }
}
export default connect(mapStateToProps, mapDispatchToProps)(AssetTraceabilityScreen)
