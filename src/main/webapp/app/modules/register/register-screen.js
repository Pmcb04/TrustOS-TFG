import React, { useEffect } from 'react'
import { View } from 'react-native'
import { connect } from 'react-redux'
import { KeyboardAwareScrollView } from 'react-native-keyboard-aware-scroll-view'
import { useTranslation } from 'react-i18next'

import RegisterActions from './register.reducer'
import { useDidUpdateEffect } from '../../shared/util/use-did-update-effect'
import styles from './register-screen.styles'

import {
  Text5,
  TextField,
  PasswordField,
  Box,
  Stack,
  ButtonLayout,
  ButtonPrimary,
  Form,
  ThemeContext,
  EmailField,
  Select
} from '@telefonica/mistica'
import Metadata from '../../shared/components/metadata/metadata'

import { addRandomString } from '../../shared/util/asset-image-name'


function RegisterScreen(props) {
  const [error, setError] = React.useState('')
  const [success, setSuccess] = React.useState('')
  const [rolSelected, setRolSelected] = React.useState(null)
  
  const {roles} = props

  function create(metadata, type) {
    const assetId = addRandomString(type)
    console.log("assetID", assetId)
    const newAsset = {
      assetId: assetId,
      metadata: metadata,
      data: { type: type, assetBefore: null },
    }
    return newAsset
  }

  const onSubmit = (data) => {
    setSuccess('')
    setError('')
    if (data.password !== data.confirmPassword) {
      setError('Passwords do not match')
      return
    }

    let metadata = JSON.parse(JSON.stringify(data))
    delete metadata.rol
    delete metadata.password
    delete metadata.confirmPassword
    delete metadata.email 
    delete metadata.firstName
    delete metadata.lastName
    delete metadata.login
    delete metadata.imageUrl

    console.log("data", data)
    console.log("metadata", metadata)
    
    const assetUser = create(metadata, data.rol)
    if(!error){
      data.assetDTO = assetUser
      data.assetId = assetUser.assetId
      props.register(data)
    }
  }

  useDidUpdateEffect(() => {
    if (!props.fetching) {
      if (props.error) {
        setError(props.error)
      } else {
        setSuccess('User successfully registered')
      }
    }
  }, [props.fetching])

  useEffect(() => {
    setRolSelected(roles[0].name)
  }, [roles])

  // TODO internacionalizar
  const { t } = useTranslation() //i18n instance
  const { colors } = React.useContext(ThemeContext)

  return (
    <View style={[styles.container, { backgroundColor: colors.background }]}>
      <KeyboardAwareScrollView contentContainerStyle={styles.container} keyboardShouldPersistTaps="handled" keyboardDismissMode="on-drag">
        {!!error && <Text5 style={styles.errorText}>{error}</Text5>}
        {!!success && <Text5 style={styles.successText}>{success}</Text5>}

        <View style={styles.login}>
          <Form
            onSubmit={(formData) => {
              onSubmit(formData)
            }}>
            <Box padding={16}>
              <Stack space={16}>
                <TextField name="login" label={t('USERNAME')} placeholder={t('ENTER_USERNAME')} fullWidth />
                <TextField name="firstName" label={t('FIRST_NAME')} placeholder={t('ENTER_FIRST_NAME')} fullWidth />
                <TextField name="lastName" label={t('LAST_NAME')} placeholder={t('ENTER_LAST_NAME')} fullWidth />
                <EmailField name="email" label={t('EMAIL')} placeholder={t('ENTER_EMAIL')} fullWidth />
                <PasswordField name="password" label={t('PASSWORD')} placeholder={t('ENTER_PASSWORD')} fullWidth />
                <PasswordField name="confirmPassword" label={t('CONFIRM_PASSWORD')} placeholder={t('ENTER_CONFIRM_PASSWORD')} fullWidth />
                <TextField name="imageUrl" label={t('IMAGE_PROFILE')} placeholder={t('ENTER_IMAGE_PROFILE')} fullWidth optional />
                <Select
                  fullWidth
                  name={'rol'}
                  label={'Rol'}
                  key={'property-rol'}
                  onChangeValue={(value) => setRolSelected(value)}
                  value={rolSelected}
                  options={[...roles]
                    .map((rol) => (
                        { value: rol.name, text: rol.name }))}
                />
                {rolSelected && <Metadata type={rolSelected} create={true} register={true}/>}
                <ButtonLayout>
                  <ButtonPrimary fullWidth submit>
                    Send
                  </ButtonPrimary>
                </ButtonLayout>
              </Stack>
            </Box>
          </Form>
        </View>
      </KeyboardAwareScrollView>
    </View>
  )
}

const mapStateToProps = (state) => {
  return {
    fetching: state.register.fetching,
    error: state.register.error,
    roles : state.register.roles
  }
}

const mapDispatchToProps = (dispatch) => {
  return { 
    register: (account) => dispatch(RegisterActions.registerRequest(account)),
  }
}

export default connect(mapStateToProps, mapDispatchToProps)(RegisterScreen)
