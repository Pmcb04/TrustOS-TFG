import React, { useEffect, useState } from 'react'
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
  IconEditPencilRegular,
  IconCloseRegular,
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
  IconLockClosedRegular,
} from '@telefonica/mistica'
import { getPermissions } from '../../shared/components/metadata/metadata.utils'

function AssetDetailsScreen(props) {
  const { navigation } = props
  let { assetId, isAuthorised } = props.route.params
  const { editAsset, edit_fields, getAsset, asset, fetching, error, updateAsset, setSuccessUpdate, successUpdate, account, getActions, actions } = props
  const { colors } = React.useContext(ThemeContext)
  const { t } = useTranslation() //i18n instance
  const [canEdit, setCanEdit] = React.useState([])
  const [canView, setCanView] = React.useState([])

  useEffect(() => {
    getAsset(isAuthorised, assetId)
  }, [getAsset, isAuthorised, assetId])

  useEffect(() => {
    if(asset != null){
      getActions(asset.data.type)
      const permissions = getPermissions(asset.data.type, account.authorities[0])
      setCanView(permissions.canView)
      setCanEdit(permissions.canEdit)
    }
  }, [asset])


  function update(newMetadata) {
    
    // put metadata and prepare new asset
    let newAsset = { ...asset }
    newAsset.metadata = newMetadata 

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
            onSubmit={(formData) =>{
              const newMetadata = copyAssetMetadata(asset.metadata, formData)
              confirm({
                title: <Text6>{t('VALUES_UPDATE')}</Text6>,
                message: <TableUpdate dataBefore={asset.metadata} dataAfter={newMetadata} />,
                acceptText: <Text3 color="currentColor">{t('UPDATE')}</Text3>,
                cancelText: <Text3 color="currentColor">{t('CANCEL')}</Text3>,
                onAccept: () => update(newMetadata),
              })
            }
            }>
            <View style={[styles.container, styles.mainContainer]}>
              <View style={styles.metadata}>
                <Metadata data={asset.metadata} edit_fields={edit_fields} type={asset.data.type} canEdit={canEdit} />
              </View>
              <View style={styles.assetView}>
                <View style={styles.asset}>
                  <Asset name={assetId} type={asset.data.type} hash={asset.hash} timestamp={asset.datetime} final={asset.metadata.final != null ? asset.metadata.final : true}/>
                </View>
                <Stack space={16}>
                  <View style={styles.buttons}>
                    {
                    asset.metadata.final != null  && asset.metadata.final == false && canEdit && canEdit.length > 0 &&
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
                    <ButtonSecondary
                      disabled={edit_fields}
                      onPress={() => navigation.navigate('AssetTraceability', { assetId: assetId, isAuthorised: isAuthorised })}>
                      <IconRouteRegular color="currentColor" />
                      {t('TRACEABILITY')}
                    </ButtonSecondary>
                    {asset.metadata.final != null  && asset.metadata.final == false && actions.map((action) => ( 
                      ((action.repeat === -1 || 
                        (asset.metadata.actions ?  
                          asset.metadata.actions[action.name.trim().replace(" ", "_")] < action.repeat 
                          : false))
                          &&
                        (<ButtonSecondary 
                          key={action.name} 
                          disabled={edit_fields} 
                          onPress={() => navigation.navigate('AssetAction', { action: action.name, final: action.finalTransaction })}>
                          {action.finalTransaction && <IconLockClosedRegular color="currentColor" />}
                          {action.name}
                        </ButtonSecondary>)
                    )))}
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
    actions: state.assetDetails.actions,
    account: state.account.account,
  }
}
const mapDispatchToProps = (dispatch) => {
  return {
    editAsset: () => dispatch(AssetDetailsActions.assetDetailsEdit()),
    setSuccessUpdate: () => dispatch(AssetDetailsActions.assetDetailsSuccessUpdate()),
    getAsset: (isAuthorised, assetId) => dispatch(AssetDetailsActions.assetDetailsRequest(isAuthorised, assetId)),
    updateAsset: (newAsset) => dispatch(AssetDetailsActions.assetDetailsUpdate(newAsset)),
    getActions: (assetType) => dispatch(AssetDetailsActions.assetDetailsActionRequest(assetType)),
  }
}
export default connect(mapStateToProps, mapDispatchToProps)(AssetDetailsScreen)
