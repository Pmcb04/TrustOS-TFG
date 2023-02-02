import React from 'react'
import { Text } from 'react-native'
import { connect } from 'react-redux'
import { useTranslation } from 'react-i18next'

import { KeyboardAwareScrollView } from 'react-native-keyboard-aware-scroll-view'

import ChangePasswordActions from '../password/change-password.reducer'
import styles from './change-password-screen.styles'
import { useDidUpdateEffect } from '../../../shared/util/use-did-update-effect'
import { PasswordField, Stack, Title2, ButtonLayout, ButtonPrimary, Form } from '@telefonica/mistica'

function ChangePasswordScreen(props) {
  const [error, setError] = React.useState('')
  const [success, setSuccess] = React.useState('')

  const { t } = useTranslation() //i18n instance

  const onSubmit = (data) => {
    setSuccess('')
    setError('')
    if (data.newPassword !== data.confirmPassword) {
      setError('Passwords do not match')
      return
    }
    props.changePassword(data.currentPassword, data.newPassword)
  }

  useDidUpdateEffect(() => {
    if (!props.fetching) {
      if (props.error) {
        setError(props.error)
      } else {
        setSuccess('Password changed')
      }
    }
  }, [props.fetching])

  return (
    <KeyboardAwareScrollView
      contentContainerStyle={styles.container}
      testID="changePasswordScreen"
      keyboardShouldPersistTaps="handled"
      keyboardDismissMode="on-drag">
      <Form onSubmit={(formData) => onSubmit(formData)}>
        <Stack fullWidth space={16}>
          <Title2>{t('PASSWORD')}</Title2>
          <PasswordField fullWidth name="currentPassword" label={t('CURRENT_PASSWORD')} />
          <PasswordField fullWidth name="newPassword" label={t('NEW_PASSWORD')} />
          <PasswordField fullWidth name="confirmPassword" label={t('NEW_PASSWORD_CONFIRM')} />
          {!!error && <Text style={styles.errorText}>{error}</Text>}
          {!!success && <Text style={styles.successText}>{success}</Text>}
          <ButtonLayout align="full-width">
            <ButtonPrimary submit>{t('CHANGE')}</ButtonPrimary>
          </ButtonLayout>
        </Stack>
      </Form>
    </KeyboardAwareScrollView>
  )
}

const mapStateToProps = (state) => {
  return {
    fetching: state.changePassword.fetching,
    error: state.changePassword.error,
  }
}

const mapDispatchToProps = (dispatch) => {
  return {
    changePassword: (currentPassword, newPassword) => dispatch(ChangePasswordActions.changePasswordRequest(currentPassword, newPassword)),
  }
}

export default connect(mapStateToProps, mapDispatchToProps)(ChangePasswordScreen)
