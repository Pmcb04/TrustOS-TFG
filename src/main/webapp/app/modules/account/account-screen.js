import React from 'react'
import { View } from 'react-native'
import { useTranslation } from 'react-i18next'
import { connect } from 'react-redux'
import LoginActions from '../login/login.reducer'
import { ButtonDanger, ThemeContext, Title1, Text4, ThemeVariant } from '@telefonica/mistica'

import styles from './account-screen.styles'
import InfoAccount from '../../shared/components/info-account/info-account'
import { ScrollView } from 'react-native-gesture-handler'
import ChangePasswordScreen from './password/change-password-screen'
import SettingsScreen from './settings/settings-screen'
import ConfigurationScreen from './configuration/configuration-screen'

function AccountScreen(props) {
  const { colors } = React.useContext(ThemeContext)
  const { t } = useTranslation() //i18n instance
  const { logout, account } = props

  // TODO sustituir por parametro de account
  const fakeAccount = {
    idTrustos: 'did:vtn:trustid:0106a4d4a997ac85895ed20cbdaafe6a58c5bd8d7311b446d11502bfe9942311',
    hash: '04f8996da763b7a969b1028ee3007569eaf3a635486ddab211d512c85b9df8fb',
  }

  return (
    <ScrollView>
      <View style={[styles.container, { backgroundColor: colors.background }]}>
        <ThemeVariant isInverse>
          <View style={[styles.user, { backgroundColor: colors.backgroundBrand }]}>
            <InfoAccount big />

            <View style={styles.dataUser}>
              <View style={styles.dataUserRow}>
                <Title1>{t('EMAIL')}</Title1>
                <Text4>{account.email}</Text4>
              </View>
              <View style={styles.dataUserRow}>
                <Title1>{t('USER_TRUSTOS')}</Title1>
                <Text4>{fakeAccount.idTrustos}</Text4>
              </View>
              <View style={styles.dataUserRow}>
                <Title1>{t('USER_HASH')}</Title1>
                <Text4>{fakeAccount.hash}</Text4>
              </View>
            </View>

            <View style={styles.buttonLogout}>
              <ButtonDanger onPress={logout}>{t('CLOSE_SESSION')}</ButtonDanger>
            </View>
          </View>
        </ThemeVariant>

        <View style={[styles.properties, { borderColor: colors.border }]}>
          <ChangePasswordScreen />
        </View>

        <View style={[styles.properties, { borderColor: colors.border }]}>
          <SettingsScreen />
        </View>

        <View style={[styles.properties, { borderColor: colors.border }]}>
          <ConfigurationScreen />
        </View>
      </View>
    </ScrollView>
  )
}

const mapStateToProps = (state) => ({ account: state.account.account })
const mapDispatchToProps = (dispatch) => ({
  logout: () => dispatch(LoginActions.logoutRequest()),
})
export default connect(mapStateToProps, mapDispatchToProps)(AccountScreen)
