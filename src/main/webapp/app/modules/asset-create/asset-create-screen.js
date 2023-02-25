import React, {useEffect} from 'react'
import { View } from 'react-native'
import { useTranslation } from 'react-i18next'

import styles from './asset-create-screen.styles'
import { connect } from 'react-redux'
import Asset from '../../shared/components/asset/asset'
import AssetCreateActions from './asset-create-screen.reducer'
import MyAssetsActions from '../my-assets/my-assets-screen.reducer'

import { Form, ThemeContext, Text3, Text6, Text10, Spinner, confirm } from '@telefonica/mistica'
import Metadata from '../../shared/components/metadata/metadata'
import TableUpdate from '../../shared/components/table-update/table-update'
import { addRandomString } from '../../shared/util/asset-image-name'

function AssetCreateScreen(props) {
  let { type } = props.route.params
  const { fetching, name, error, products, createAsset, setSuccessCreated, getActions, actions } = props
  const { colors } = React.useContext(ThemeContext)
  const { t } = useTranslation() //i18n instance

  function metadataActions(){
    metadataActions = {}
    actions.map((action) => metadataActions[action.name.trim().replace(" ", "_")] = 0)
    return metadataActions
  }

  function create(metadata) {
    const assetId = addRandomString(type)
    // delete metadata.name
    metadata.actions = metadataActions()
    const newAsset = {
      assetId: assetId,
      metadata: metadata,
      data: { type: type, assetBefore: null },
    }
    createAsset(newAsset)
    setSuccessCreated() // activamos para que se muestre el mensaje de asset creado satisfactoriamente
    props.navigation.navigate(t('MY_ASSETS'), { assetId: assetId }) // vamos a la pantalla de la lista de assets
  }

  useEffect(() => {
      getActions(type)
  }, [type])

  return (
    <>
      {!products.some((product) => product.name === type) && (
        <View style={[styles.loading, { backgroundColor: colors.background }]}>
          <View style={styles.loadingText}>
            <Text10>You don't create the {type} asset type</Text10>
          </View>
        </View>
      )}
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
      {!error && products.some((product) => product.name === type) && (
        <View style={[styles.container, { backgroundColor: colors.background }]}>
          <Form
            onSubmit={(formData) => {
              confirm({
                title: <Text6>{t('VALUES_CREATE')}</Text6>,
                message: <TableUpdate dataBefore={{}} dataAfter={formData} />,
                acceptText: <Text3 color="currentColor">{t('CREATE')}</Text3>,
                cancelText: <Text3 color="currentColor">{t('CANCEL')}</Text3>,
                onAccept: () => create(formData),
              })
            }}>
            <View style={[styles.container, styles.mainContainer]}>
              <View style={styles.metadata}>
                <Metadata type={type} createWithButton={true} />
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
    products: state.myAssets.products,
    actions: state.assetCreate.actions
  }
}
const mapDispatchToProps = (dispatch) => {
  return {
    createAsset: (newAsset) => dispatch(AssetCreateActions.assetCreateRequest(newAsset)),
    setSuccessCreated: () => dispatch(MyAssetsActions.myAssetsSetSuccessCreated()),
    getActions: (assetType) => dispatch(AssetCreateActions.assetCreateActionRequest(assetType)),
  }
}
export default connect(mapStateToProps, mapDispatchToProps)(AssetCreateScreen)
