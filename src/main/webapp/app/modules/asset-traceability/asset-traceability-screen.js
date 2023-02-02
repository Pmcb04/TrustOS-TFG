import React, { useEffect } from 'react'
import { View } from 'react-native'
import { useTranslation } from 'react-i18next'
import AssetTraceabilityActions from './asset-traceability-screen.reducer'
import { convertLocalDateToTimestamp, convertTimestampToLocalDate } from '../../shared/util/date-transforms'
import Asset from '../../shared/components/asset/asset'
import styles from './asset-traceability-screen.styles'
import { connect } from 'react-redux'
import {
  ThemeContext,
  Text10,
  Spinner,
  Stack,
  Text4,
  useWindowHeight,
  SnapCard,
  DateTimeField,
  DoubleField,
  Tag,
  Divider,
  ButtonPrimary,
  Form,
} from '@telefonica/mistica'

import Metadata from '../../shared/components/metadata/metadata'
import { ScrollView } from 'react-native-gesture-handler'

function AssetTraceabilityScreen(props) {
  const { colors } = React.useContext(ThemeContext)
  const { assetId, isAuthorised } = props.route.params
  const {
    getAssetTraceability,
    getAssetRangeTraceability,
    traceability,
    error,
    fetching,
    setTransactionSelect,
    transactionSelect,
    setTimestampInit,
    setTimestampEnd,
  } = props
  const heightScreen = useWindowHeight()
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
      {!error && !fetching && traceability && (
        <View style={[styles.container, styles.mainContainer, { backgroundColor: colors.background }]}>
          <View style={styles.listView}>
            <View style={styles.date}>
              <Form onSubmit={() => getAssetRangeTraceability(isAuthorised, assetId)}>
                <View style={styles.dateFilter}>
                  <DoubleField space={16} fullWidth>
                    <DateTimeField
                      name="init"
                      label={t('DATE_INIT')}
                      onChangeValue={(value) => setTimestampInit(convertLocalDateToTimestamp(value))}
                    />
                    <DateTimeField
                      name="end"
                      label={t('DATE_END')}
                      onChangeValue={(value) => setTimestampEnd(convertLocalDateToTimestamp(value))}
                    />
                  </DoubleField>
                </View>

                <View style={styles.buttonFilter}>
                  <ButtonPrimary fullWidth submit>
                    {t('FILTER')}
                  </ButtonPrimary>
                </View>
              </Form>
            </View>
            <Divider />
            <View style={[styles.list, { height: heightScreen }]}>
              <ScrollView>
                {traceability.transactions.map((transaction, index) => (
                  <View key={index + 'view'} style={styles.transaction}>
                    <SnapCard
                      key={transaction.hash}
                      title={t('TRANSACTION_NUMBER', { number: traceability.transactions.length - index })}
                      isInverse={transactionSelect === index}
                      onPress={() => setTransactionSelect(index)}
                      extra={
                        <Stack key={index + 'stack'} space={4}>
                          <Tag key={index + 'tag'} type="active">
                            {'Asset'}
                          </Tag>
                          <Text4 key={index + 'text'} regular>
                            {convertTimestampToLocalDate(transaction.timestamp)}
                          </Text4>
                        </Stack>
                      }
                    />
                  </View>
                ))}
              </ScrollView>
            </View>
          </View>
          <View style={styles.assetView}>
            <View style={styles.asset}>
              <Asset
                name={assetId}
                type={traceability.data.type}
                hash={traceability.transactions[transactionSelect].hash}
                authorizathed={isAuthorised}
              />
            </View>
            <View style={styles.metadata}>
              <Metadata
                data={traceability.transactions[transactionSelect].metadata}
                type={traceability.data.type}
              />
            </View>
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
    getAssetRangeTraceability: (isAuthorised, assetId) =>
      dispatch(AssetTraceabilityActions.assetTraceabilityRangeRequest(isAuthorised, assetId)),
    setTransactionSelect: (transactionSelect) =>
      dispatch(AssetTraceabilityActions.assetTraceabilitySetTransactionSelect(transactionSelect)),
    setTimestampInit: (timestampInit) => dispatch(AssetTraceabilityActions.assetTraceabilitySetTimestampInit(timestampInit)),
    setTimestampEnd: (timestampEnd) => dispatch(AssetTraceabilityActions.assetTraceabilitySetTimestampEnd(timestampEnd)),
  }
}
export default connect(mapStateToProps, mapDispatchToProps)(AssetTraceabilityScreen)
