import React from 'react'
import { Text } from 'react-native'
import { connect } from 'react-redux'
import { useTranslation } from 'react-i18next'

import ListOptionsChips from '../../../shared/components/list-options-chips/list-options-chips'

import { KeyboardAwareScrollView } from 'react-native-keyboard-aware-scroll-view'

import AccountActions from '../../../shared/reducers/account.reducer'
import styles from './settings-screen.styles'
import { useDidUpdateEffect } from '../../../shared/util/use-did-update-effect'
import {
  TextField,
  EmailField,
  Stack,
  Title2,
  ButtonLayout,
  ButtonPrimary,
  Form,
  IconSunRegular,
  IconMoonRegular,
} from '@telefonica/mistica'

function SettingsScreen(props) {
  const { account, getAccount, updating, error, updateAccount } = props
  const { t, i18n } = useTranslation() //i18n instance

  // array with all types of modes themes
  const themes = [
    { value: 'light', icon: <IconSunRegular /> },
    { value: 'dark', icon: <IconMoonRegular /> },
  ]

  //array with all supported languages
  const languages = [
    { value: 'en', icon: t('ENGLISH') },
    { value: 'es', icon: t('SPAIN') },
  ]

  const [errorMessage, setErrorMessage] = React.useState('')
  const [successMessage, setSuccessMessage] = React.useState('')
  const [language, setLanguage] = React.useState(props.account.langKey)
  const [theme, setTheme] = React.useState(props.account.theme)

  React.useEffect(() => {
    setLanguage(props.account.langKey)
    setTheme(props.account.theme)
  }, [props.account.langKey, props.account.theme])

  const onSubmit = (data) => {
    setSuccessMessage('')
    setErrorMessage('')
    let dataUpdate = Object.assign({ ...account }, data)
    dataUpdate = Object.assign({ ...dataUpdate }, { langKey: language })
    dataUpdate = Object.assign({ ...dataUpdate }, { theme: theme })
    console.log(dataUpdate)
    updateAccount(dataUpdate)
    i18n.changeLanguage(language) //changes the app language
    // window.location.reload(true) // refress app
    // FIXME ver como podemos hacer que el nav container se cambie de idioma tambien
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
          <TextField name="imageUrl" label={t('IMAGE_PROFILE')} placeholder={t('ENTER_IMAGE_PROFILE')} fullWidth optional />
          {
            // funcion para añadir las propiedades propias de cada rol
          }
          <ListOptionsChips title={t('SELECT_LANGUAGE')} options={languages} defaultOption={language} callback={setLanguage} />
          <ListOptionsChips title={t('SELECT_THEME')} options={themes} defaultOption={theme} callback={setTheme} />
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
