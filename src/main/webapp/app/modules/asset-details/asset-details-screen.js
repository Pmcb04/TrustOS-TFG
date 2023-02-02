import React, { useEffect } from 'react'
import { View } from 'react-native'
import { useTranslation } from 'react-i18next'

import styles from './asset-details-screen.styles'
import Asset from '../../shared/components/asset/asset'
import { connect } from 'react-redux'
import AssetDetailsActions from './asset-details-screen.reducer'
import { copyAssetMetadata } from './asset-details.utils'
import TableUpdate from '../../shared/components/table-update/table-update'
import Metadata from '../../shared/components/metadata/metadata'
import {
  ButtonPrimary,
  ButtonSecondary,
  ButtonDanger,
  IconIdCardRegular,
  IconEditPencilRegular,
  IconCloseRegular,
  IconTeamRegular,
  Form,
  Stack,
  ThemeContext,
  IconRouteRegular,
  Text10,
  Text6,
  Text3,
  Spinner,
  confirm,
  Callout,
  IconSuccess,
} from '@telefonica/mistica'
import { getPermissions } from '../../shared/components/metadata/metadata.utils'

function AssetDetailsScreen(props) {
  const { navigation } = props
  let { assetId, isAuthorised } = props.route.params
  const { editAsset, edit_fields, getAsset, asset, fetching, error, updateAsset, setSuccessUpdate, successUpdate, account } = props
  const { colors } = React.useContext(ThemeContext)
  const { t } = useTranslation() //i18n instance

  const { _, canEdit } = getPermissions(asset.data.type, account.authorities[0])

  useEffect(() => {
    getAsset(isAuthorised, assetId)
  }, [getAsset, isAuthorised, assetId])

  function update(newMetadata) {
    // copy new metadata
    const metadataUpdate = copyAssetMetadata(asset.metadata, newMetadata)

    // put metadata and prepare new asset
    let newAsset = { ...asset }
    newAsset.metadata = metadataUpdate

    // update the asset
    updateAsset(newAsset)

    // change to view mode
    editAsset()

    // to view message in screen
    setSuccessUpdate()
  }

  return (
    <>
      {error && (
        <View style={[styles.loading, { backgroundColor: colors.background }]}>
          <View style={styles.loadingText}>
            <Text10>Asset with id {assetId} not found...</Text10>
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
      {!error && !fetching && asset && (
        <View style={[styles.container, { backgroundColor: colors.background }]}>
          {successUpdate && (
            <Callout
              icon={<IconSuccess />}
              onClose={setSuccessUpdate}
              title={t('ASSET_UPDATE')}
              description={t('ASSET_WITH_ID_UPDATE', { assetId: assetId })}
              button={
                <ButtonPrimary small onPress={setSuccessUpdate}>
                  {t('ACCEPT')}
                </ButtonPrimary>
              }
            />
          )}
          <Form
            onSubmit={(formData) =>
              confirm({
                title: <Text6>{t('VALUES_UPDATE')}</Text6>,
                message: <TableUpdate data={formData} />,
                acceptText: <Text3 color="currentColor">{t('UPDATE')}</Text3>,
                cancelText: <Text3 color="currentColor">{t('CANCEL')}</Text3>,
                onAccept: () => update(formData),
              })
            }>
            <View style={[styles.container, styles.mainContainer]}>
              <View style={styles.metadata}>
                <Metadata data={asset.metadata} edit_fields={edit_fields} type={asset.data.type} canEdit={canEdit} />
              </View>
              <View style={styles.assetView}>
                <View style={styles.asset}>
                  <Asset name={assetId} type={asset.data.type} hash={asset.hash} authorizathed={isAuthorised} />
                </View>
                <Stack space={16}>
                  <View style={styles.buttons}>
                    {
                      // FIXME cambiar para que solo el propietario del asset lo pueda hacer (asset.owner === account.trustosID)
                    }
                    {canEdit.length > 0 &&
                      (edit_fields ? (
                        <ButtonDanger onPress={editAsset}>
                          <IconCloseRegular color="currentColor" />
                          {t('CANCEL')}
                        </ButtonDanger>
                      ) : (
                        <ButtonPrimary onPress={editAsset}>
                          <IconEditPencilRegular color="currentColor" />
                          {t('EDIT')}
                        </ButtonPrimary>
                      ))}
                    {
                      // FIXME cambiar para que solo el propietario del asset lo pueda hacer (asset.owner === account.trustosID)
                    }
                    <ButtonSecondary disabled={edit_fields} onPress={() => {}}>
                      <IconIdCardRegular color="currentColor" />
                      {t('TRANFER')}
                    </ButtonSecondary>
                    {
                      // FIXME cambiar para que solo el propietario del asset lo pueda hacer (asset.owner === account.trustosID)
                    }
                    <ButtonSecondary disabled={edit_fields} onPress={() => {}}>
                      <IconTeamRegular color="currentColor" />
                      {t('AUTHORISE')}
                    </ButtonSecondary>
                    <ButtonSecondary
                      disabled={edit_fields}
                      onPress={() => navigation.navigate('AssetTraceability', { assetId: assetId, isAuthorised: isAuthorised })}>
                      <IconRouteRegular color="currentColor" />
                      {t('TRACEABILITY')}
                    </ButtonSecondary>
                    {
                      // TODO poner dinamicamente por respuesta a llamada a la api de las transacciones del producto
                    }
                    {['Action 1', 'Action 2'].map((action) => (
                      <ButtonSecondary key={action} disabled={edit_fields} onPress={() => console.log(action)}>
                        {action}
                      </ButtonSecondary>
                    ))}
                  </View>
                </Stack>
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
    edit_fields: state.assetDetails.edit_fields,
    asset: state.assetDetails.asset,
    fetching: state.assetDetails.fetching,
    error: state.assetDetails.error,
    successUpdate: state.assetDetails.successUpdate,
    account: state.account.account,
  }
}
const mapDispatchToProps = (dispatch) => {
  return {
    editAsset: () => dispatch(AssetDetailsActions.assetDetailsEdit()),
    setSuccessUpdate: () => dispatch(AssetDetailsActions.assetDetailsSuccessUpdate()),
    getAsset: (isAuthorised, assetId) => dispatch(AssetDetailsActions.assetDetailsRequest(isAuthorised, assetId)),
    updateAsset: (newAsset) => dispatch(AssetDetailsActions.assetDetailsUpdate(newAsset)),
  }
}
export default connect(mapStateToProps, mapDispatchToProps)(AssetDetailsScreen)
