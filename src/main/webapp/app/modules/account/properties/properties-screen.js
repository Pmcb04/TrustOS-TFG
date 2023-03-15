import React from 'react'
import { Text,View } from 'react-native'
import { connect } from 'react-redux'
import { useTranslation } from 'react-i18next'

import AccountActions from '../../../shared/reducers/account.reducer'
import styles from './properties-screen.styles'
import { useDidUpdateEffect } from '../../../shared/util/use-did-update-effect'
import {
  Stack,
  Title2,
  ButtonLayout,
  ButtonPrimary,
  ButtonSecondary,
  Form,
} from '@telefonica/mistica'
import Metadata from '../../../shared/components/metadata/metadata'

function PropertiesScreen(props) {
  const { updating, error, account, asset, getAsset, updateAsset, navigation } = props
  const { t, i18n } = useTranslation() //i18n instance

  const [errorMessage, setErrorMessage] = React.useState('')
  const [successMessage, setSuccessMessage] = React.useState('')


  React.useEffect(() => {
    getAsset(false, account.assetId)
  }, [account])

  const onSubmit = (metadata) => {
    setSuccessMessage('')
    setErrorMessage('')
    updateAsset(metadata)
  }

  useDidUpdateEffect(() => {
    if (!updating) {
      if (error) {
        setErrorMessage(error)
      } else {
        setSuccessMessage('Properties updated')
      }
    }
  }, [props.updating])



  return (
    <View
      style={styles.container}>
      <Form onSubmit={onSubmit}>
        <Stack fullWidth space={16}>
          <Title2>{t('PROPERTIES')}</Title2>
          { asset && <Metadata data={asset.metadata} editWithoutButton={true} type={asset.data.type} />}          
          <ButtonLayout align="full-width">
            <ButtonPrimary submit>{t('SAVE')}</ButtonPrimary>
            {asset && <ButtonSecondary onPress={() =>navigation.navigate('AssetDetails', { assetId: asset.assetId, isAuthorised: false })}>{t('DETAILS')}</ButtonSecondary>}
          </ButtonLayout>
          {!!errorMessage && <Text style={styles.errorText}>{errorMessage}</Text>}
          {!!successMessage && <Text style={styles.successText}>{successMessage}</Text>}
        </Stack>
      </Form>
    </View>
  )
}

const mapStateToProps = (state) => {
  return {
    account: state.account.account,
    updating: state.account.updating,
    error: state.account.error,
    asset : state.account.asset
  }
}

const mapDispatchToProps = (dispatch) => {
  return {
    getAsset: (isAuthorised, assetId) => dispatch(AccountActions.accountAssetRequest(isAuthorised, assetId)),
    updateAsset: (metadata) => dispatch(AccountActions.accountAssetUpdate(metadata)),
  }
}

export default connect(mapStateToProps, mapDispatchToProps)(PropertiesScreen)
