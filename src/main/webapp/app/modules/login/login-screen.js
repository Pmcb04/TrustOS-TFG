import React from 'react'
import { View } from 'react-native'
import { KeyboardAwareScrollView } from 'react-native-keyboard-aware-scroll-view'
import { connect } from 'react-redux'
import { useTranslation } from 'react-i18next'

import LoginActions from './login.reducer'
import { useDidUpdateEffect } from '../../shared/util/use-did-update-effect'
import styles from './login-screen.styles'

import { Text5, TextField, PasswordField, Box, Stack, ButtonLayout, ButtonPrimary, Form, ThemeContext } from '@telefonica/mistica'

function LoginScreen(props) {
  const { account, navigation, fetching, loginError, attemptLogin } = props
  // setup error state for displaying error messages
  const [error, setError] = React.useState('')

  // if the user is already logged in, send them home
  React.useEffect(() => {
    if (account !== null) {
      navigation.navigate('Home')
    }
  }, [account, navigation])

  // skip the first render but check for API responses and show error if not fetching
  useDidUpdateEffect(() => {
    if (!fetching && loginError) {
      setError(loginError)
    }
  }, [fetching])

  // submit handler
  const onSubmit = (data) => {
    setError('')
    attemptLogin(data.login, data.password)
  }
  // TODO internacionalizar
  const { t } = useTranslation() //i18n instance
  const { colors } = React.useContext(ThemeContext)

  return (
    <View style={[styles.container, styles.mainContainer, { backgroundColor: colors.background }]}>
      <KeyboardAwareScrollView
        contentContainerStyle={styles.container}
        testID="loginScreen"
        keyboardShouldPersistTaps="handled"
        keyboardDismissMode="on-drag">
        {!!error && <Text5 style={styles.errorText}>{error}</Text5>}
        <View style={styles.login}>
          <Form
            onSubmit={(formData) => {
              onSubmit(formData)
            }}>
            <Box padding={16}>
              <Stack space={16}>
                <TextField name="login" label="Username/Email" fullWidth />
                <PasswordField name="password" label="Password" fullWidth />
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
    account: state.account.account,
    fetching: state.login.fetching,
    loginError: state.login.error,
  }
}

const mapDispatchToProps = (dispatch) => {
  return {
    attemptLogin: (username, password) => dispatch(LoginActions.loginRequest(username, password)),
  }
}

export default connect(mapStateToProps, mapDispatchToProps)(LoginScreen)
