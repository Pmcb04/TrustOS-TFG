import React from 'react'
import { Text } from 'react-native'
import { connect } from 'react-redux'
import { useTranslation } from 'react-i18next'

import { KeyboardAwareScrollView } from 'react-native-keyboard-aware-scroll-view'

import AccountActions from '../../../shared/reducers/account.reducer'
import styles from './settings-screen.styles'
import { useDidUpdateEffect } from '../../../shared/util/use-did-update-effect'
import { TextField, EmailField, Stack, Title2, ButtonLayout, ButtonPrimary, Form } from '@telefonica/mistica'

function SettingsScreen(props) {
  const [errorMessage, setErrorMessage] = React.useState('')
  const [successMessage, setSuccessMessage] = React.useState('')

  const { account, getAccount, updating, error, updateAccount } = props

  const { t } = useTranslation() //i18n instance

  const onSubmit = (data) => {
    setSuccessMessage('')
    setErrorMessage('')
    updateAccount(Object.assign({ ...account }, data))
  }

  useDidUpdateEffect(() => {
    if (!updating) {
      if (error) {
        setErrorMessage(error)
      } else {
        getAccount()
        setSuccessMessage('Settings updated')
      }
    }
  }, [props.updating])

  return (
    <KeyboardAwareScrollView
      contentContainerStyle={styles.container}
      testID="settingsScreen"
      keyboardShouldPersistTaps="handled"
      keyboardDismissMode="on-drag">
      <Form onSubmit={onSubmit} initialValues={props.account}>
        <Stack fullWidth space={16}>
          <Title2>{t('PROPERTIES')}</Title2>
          <TextField name="firstName" label={t('FIRST_NAME')} placeholder={t('ENTER_FIRST_NAME')} fullWidth />
          <TextField name="lastName" label={t('LAST_NAME')} placeholder={t('ENTER_LAST_NAME')} fullWidth />
          <EmailField name="email" label={t('EMAIL')} placeholder={t('ENTER_EMAIL')} fullWidth />
          <TextField name="imageUrl" label={t('IMAGE_PROFILE')} placeholder={t('ENTER_IMAGE_PROFILE')} fullWidth />
          <ButtonLayout align="full-width">
            <ButtonPrimary submit>{t('SAVE')}</ButtonPrimary>
          </ButtonLayout>
          {!!errorMessage && <Text style={styles.errorText}>{errorMessage}</Text>}
          {!!successMessage && <Text style={styles.successText}>{successMessage}</Text>}
        </Stack>
      </Form>
    </KeyboardAwareScrollView>
  )
}

const mapStateToProps = (state) => {
  return {
    account: state.account.account,
    updating: state.account.updating,
    error: state.account.error,
  }
}

const mapDispatchToProps = (dispatch) => {
  return {
    updateAccount: (account) => dispatch(AccountActions.accountUpdateRequest(account)),
    getAccount: () => dispatch(AccountActions.accountRequest()),
  }
}

export default connect(mapStateToProps, mapDispatchToProps)(SettingsScreen)
