import React, { useEffect } from 'react'
import { View } from 'react-native'
import { useTranslation } from 'react-i18next'

import styles from './asset-details-screen.styles'
import Asset from '../../shared/components/asset/asset'
import { connect } from 'react-redux'
import AssetDetailsActions from './asset-details-screen.reducer'
import { process } from './asset-details.utils'
import TableUpdate from '../../shared/components/table-update/table-update'
import {
  ButtonPrimary,
  ButtonSecondary,
  ButtonDanger,
  IconIdCardRegular,
  IconEditPencilRegular,
  IconCloseRegular,
  Form,
  Stack,
  ThemeContext,
  IconRouteRegular,
  Text10,
  Text6,
  Text3,
  Box,
  Spinner,
  confirm,
  FadeIn,
} from '@telefonica/mistica'

function AssetDetailsScreen(props) {
  const { navigation } = props
  let { assetId, isAuthorised } = props.route.params
  const { editAsset, edit_fields, getAsset, asset, fetching, error } = props
  const { colors } = React.useContext(ThemeContext)
  const { t } = useTranslation() //i18n instance

  // change isAuthorised to boolean type
  isAuthorised = isAuthorised === 'true'

  useEffect(() => {
    getAsset(isAuthorised, assetId)
  }, [getAsset, isAuthorised, assetId])

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
      {!error && !fetching && (
        <View style={[styles.container, { backgroundColor: colors.background }]}>
          <Form
            onSubmit={(formData) =>
              confirm({
                title: <Text6>{t('VALUES_UPDATE')}</Text6>,
                message: <TableUpdate data={formData} />,
                acceptText: <Text3 color="currentColor">{t('UPDATE')}</Text3>,
                cancelText: <Text3 color="currentColor">{t('CANCEL')}</Text3>,
              })
            }>
            <View style={[styles.mainContainer]}>
              <View style={[styles.container, styles.metadata, styles.properties, { borderColor: colors.border }]}>
                <Box padding={16}>
                  <FadeIn delay="0.25s">
                    <Stack fullWidth space={16}>
                      {process(asset.metadata, edit_fields)}
                    </Stack>
                  </FadeIn>
                  {edit_fields ? <ButtonPrimary submit>{t('UPDATE')}</ButtonPrimary> : null}
                </Box>
              </View>

              <View style={styles.assetView}>
                <View style={styles.asset}>
                  <Asset name={assetId} image={asset.data.image} type={asset.data.type} hash={asset.hash} authorizathed={isAuthorised} />
                </View>
                <Stack space={16}>
                  <View style={styles.buttons}>
                    {edit_fields ? (
                      <ButtonDanger onPress={editAsset}>
                        <IconCloseRegular color="currentColor" />
                        {t('CANCEL')}
                      </ButtonDanger>
                    ) : (
                      <ButtonPrimary onPress={editAsset}>
                        <IconEditPencilRegular color="currentColor" />
                        {t('EDIT')}
                      </ButtonPrimary>
                    )}

                    <ButtonSecondary disabled={edit_fields} onPress={() => {}}>
                      <IconIdCardRegular color="currentColor" />
                      {t('TRANFER')}
                    </ButtonSecondary>
                    <ButtonSecondary
                      disabled={edit_fields}
                      onPress={() => navigation.navigate('AssetTraceability', { assetId: assetId, isAuthorised: isAuthorised })}>
                      <IconRouteRegular color="currentColor" />
                      {t('TRACEABILITY')}
                    </ButtonSecondary>
                    <ButtonSecondary disabled={edit_fields} onPress={() => {}}>
                      Action 1
                    </ButtonSecondary>
                    <ButtonSecondary disabled={edit_fields} onPress={() => {}}>
                      Action 2
                    </ButtonSecondary>
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
  }
}
const mapDispatchToProps = (dispatch) => {
  return {
    editAsset: () => dispatch(AssetDetailsActions.assetDetailsEdit()),
    getAsset: (isAuthorised, assetId) => dispatch(AssetDetailsActions.assetDetailsRequest(isAuthorised, assetId)),
  }
}
export default connect(mapStateToProps, mapDispatchToProps)(AssetDetailsScreen)
