import React from 'react'
import { View } from 'react-native'
import { useTranslation } from 'react-i18next'

import styles from './asset-create-screen.styles'
import { connect } from 'react-redux'
import Asset from '../../shared/components/asset/asset'

import { Form, ThemeContext, Text3, Text6, Text10, Spinner, confirm } from '@telefonica/mistica'
import Metadata from '../../shared/components/metadata/metadata'
import TableUpdate from '../../shared/components/table-update/table-update'

function AssetCreateScreen(props) {
  let { type } = props.route.params
  const { fetching, error, name } = props
  const { colors } = React.useContext(ThemeContext)
  const { t } = useTranslation() //i18n instance

  function addName(data) {
    data.name = name + '#' + (Math.random() + 1).toString(36).substring(2)
    return data
  }

  function create(data) {
    console.log('ASSET_ID -> ', data.name)
    delete data.name
    console.log('METADATA _> ', data)
    console.log('DATA _> ', { type: type })
  }

  return (
    <>
      {error && (
        <View style={[styles.loading, { backgroundColor: colors.background }]}>
          <View style={styles.loadingText}>
            <Text10>Asset with id not found...</Text10>
          </View>
        </View>
      )}
      {fetching && (
        <View style={[styles.loading, { backgroundColor: colors.background }]}>
          <View style={styles.loadingText}>
            <Text10>Loading...</Text10>
            <Spinner size={64} />
          </View>
        </View>
      )}
      {!error && !fetching && (
        <View style={[styles.container, { backgroundColor: colors.background }]}>
          {
            // TODO hacer en el submit el create asset
          }
          <Form
            onSubmit={(formData) => {
              let newAsset = addName(formData)
              console.log(newAsset)
              confirm({
                title: <Text6>{t('VALUES_UPDATE')}</Text6>,
                message: <TableUpdate dataBefore={{}} dataAfter={newAsset} />,
                acceptText: <Text3 color="currentColor">{t('CREATE')}</Text3>,
                cancelText: <Text3 color="currentColor">{t('CANCEL')}</Text3>,
                onAccept: () => create(newAsset),
              })
            }}>
            <View style={[styles.container, styles.mainContainer]}>
              <View style={styles.metadata}>
                <Metadata type={type} data={{ height: 663445, capacity: 234234 }} create={true} />
              </View>
              <View style={styles.assetView}>
                <View style={styles.asset}>
                  <Asset name={name} type={type} authorizathed={false} />
                </View>
              </View>
            </View>
          </Form>
        </View>
      )}
    </>
  )
}

const mapStateToProps = (state) => {
  return {
    fetching: state.assetCreate.fetching,
    error: state.assetCreate.error,
    name: state.assetCreate.name,
  }
}
const mapDispatchToProps = (dispatch) => {
  return {}
}
export default connect(mapStateToProps, mapDispatchToProps)(AssetCreateScreen)
