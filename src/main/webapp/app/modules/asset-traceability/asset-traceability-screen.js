import React, { useEffect} from 'react'
import { Text, View } from 'react-native'
import { useTranslation } from 'react-i18next'
import AssetTraceabilityActions from './asset-traceability-screen.reducer'
import { convertLocalDateToTimestamp, convertTimestampToLocalDate } from '../../shared/util/date-transforms'
import Asset from '../../shared/components/asset/asset'
import styles from './asset-traceability-screen.styles'
import { connect } from 'react-redux'
import { getImage } from '../../shared/util/asset-image-name'
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
  ButtonPrimary,
  Form,
  useWindowWidth,
} from '@telefonica/mistica'

import Metadata from '../../shared/components/metadata/metadata'
import { ScrollView } from 'react-native-gesture-handler'
import Graph from './graph'

function AssetTraceabilityScreen(props) {
  const { colors } = React.useContext(ThemeContext)
  const { assetId, isAuthorised } = props.route.params
  const {
    getAssetTraceabilityAsset,
    getAssetRangeTraceabilityAsset,
    traceability,
    error,
    fetching,
    setTransactionSelect,
    transactionSelect,
    timestampInit,
    setTimestampInit,
    timestampEnd,
    setTimestampEnd,
    getAssetTraceabilityBefore,
    nodes,
    links,
    assetSelected,
    changeAssetSelected
  } = props
  const heightScreen = useWindowHeight()
  const widthScreen = useWindowWidth()
  const { t } = useTranslation() //i18n instance

  useEffect(() => {
    getAssetTraceabilityBefore(assetId) 
  }, [])

  useEffect(() => {
    getAssetTraceabilityAsset(isAuthorised, assetSelected)
  }, [assetSelected])

  return (
    <>
      {error && (
        <View style={[styles.loading, { backgroundColor: colors.background }]}>
          <View style={styles.loadingText}>
            <Text10>Asset with id {assetId} not found...</Text10>
          </View>
        </View>
      )}
      {fetching && !traceability && nodes.length < 1  && !assetSelected && (
        <View style={[styles.loading, { backgroundColor: colors.background }]}>
          <View style={styles.loadingText}>
            <Text10>Loading...</Text10>
            <Spinner size={64} />
          </View>
        </View>
      )}
      {!error && !fetching && nodes.length >= 1 && traceability && assetSelected && (
        <View style={[styles.container, styles.mainContainer, { backgroundColor: colors.background }]}>
          <View style={[styles.graphView, { borderColor: colors.border }]}>
            <Graph 
              nodes={nodes} 
              links={links} 
              width={widthScreen/2 - 15} 
              height={heightScreen - 15} 
              onClickNode={changeAssetSelected}
              nodeSelected={assetSelected}
            />
          </View>
          <View style={[styles.assetView]}>
            <View style={styles.asset}>
              <Asset
                name={assetSelected}
                type={traceability.data.type}
                final={traceability.transactions.length > 0 ? traceability.transactions[transactionSelect].metadata.final != null ? traceability.transactions[transactionSelect].metadata.final : true : null}
                timestamp={traceability.transactions.length > 0 ? traceability.transactions[transactionSelect].timestamp : null}
                hash={traceability.transactions.length > 0 ? traceability.transactions[transactionSelect].hash : null}
              />
            </View>
            {traceability.transactions.length > 0 && <View style={styles.metadata}>
              <Metadata
                type={traceability.data.type}
                data={traceability.transactions[transactionSelect].metadata}
              />
            </View>}

          </View>
          <View style={[styles.listTransactions]}>
            <View style={styles.date}>
              <Form onSubmit={() => getAssetRangeTraceabilityAsset(isAuthorised, assetId)}>
                <View style={styles.dateFilter}>
                  <DoubleField space={16} fullWidth>
                    <DateTimeField
                      name="init"
                      label={t('DATE_INIT')}
                      defaultValue={convertTimestampToLocalDate(timestampInit, true)}
                      onChangeValue={(value) => setTimestampInit(convertLocalDateToTimestamp(value))}
                      // min={traceability.transactions.length > 0 ? convertTimestampToLocalDate(traceability.transactions[0].timestamp, true): null}
                    />
                    <DateTimeField
                      name="end"
                      label={t('DATE_END')}
                      defaultValue={convertTimestampToLocalDate(timestampEnd, true)}
                      onChangeValue={(value) => setTimestampEnd(convertLocalDateToTimestamp(value))}
                      // max={traceability.transactions.length > 0 ? convertTimestampToLocalDate(traceability.transactions[traceability.transactions.length-1].timestamp, true) : null}
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
                          {traceability.data.type || 'Asset'}
                        </Tag>
                        <Text4 key={index + 'text'} regular>
                          {convertTimestampToLocalDate(transaction.timestamp, false)}
                        </Text4>
                      </Stack>
                    }
                  />
                </View>
              ))}
            </ScrollView>
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
    nodes : state.assetTraceability.nodes,
    links : state.assetTraceability.links,
    assetSelected : state.assetTraceability.assetId,
    timestampInit : state.assetTraceability.timestampInit,
    timestampEnd : state.assetTraceability.timestampEnd
  }
}
const mapDispatchToProps = (dispatch) => {
  return {
    getAssetTraceabilityAsset: (isAuthorised, assetId) => dispatch(AssetTraceabilityActions.assetTraceabilityRequest(isAuthorised, assetId)),
    getAssetRangeTraceabilityAsset: (isAuthorised, assetId) =>
      dispatch(AssetTraceabilityActions.assetTraceabilityRangeRequest(isAuthorised, assetId)),
    setTransactionSelect: (transactionSelect) =>
      dispatch(AssetTraceabilityActions.assetTraceabilitySetTransactionSelect(transactionSelect)),
    setTimestampInit: (timestampInit) => dispatch(AssetTraceabilityActions.assetTraceabilitySetTimestampInit(timestampInit)),
    setTimestampEnd: (timestampEnd) => dispatch(AssetTraceabilityActions.assetTraceabilitySetTimestampEnd(timestampEnd)),
    getAssetTraceabilityBefore: (assetId) => dispatch(AssetTraceabilityActions.assetTraceabilityRequestAssetBefore(assetId)),
    changeAssetSelected : (assetId, nodes) => dispatch(AssetTraceabilityActions.assetTraceabilityChangeAssetSelected(assetId, nodes))
  }
}
export default connect(mapStateToProps, mapDispatchToProps)(AssetTraceabilityScreen)
