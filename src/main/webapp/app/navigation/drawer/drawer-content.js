import React from 'react'
import { DrawerItem, DrawerContentScrollView } from '@react-navigation/drawer'
import { connect } from 'react-redux'
import LoginActions from '../../modules/login/login.reducer'
import InfoAccount from '../../shared/components/info-account/info-account'
import ListOptions from '../../shared/components/list-options/list-options'

function DrawerContent(props) {
  const { loaded, account, logout, navigation } = props

  const logoutAndCloseDrawer = () => {
    logout()
    navigation.closeDrawer()
  }

  return !loaded ? null : (
    <DrawerContentScrollView {...props} testID="drawerContentScrollView">
      <InfoAccount />
      <ListOptions navigation={navigation} />
      {account && <DrawerItem label="Logout" onPress={logoutAndCloseDrawer} />}
    </DrawerContentScrollView>
  )
}

const mapStateToProps = (state) => {
  return {
    loaded: state.appState.rehydrationComplete,
    account: state.account.account,
  }
}

const mapDispatchToProps = (dispatch) => {
  return {
    logout: () => dispatch(LoginActions.logoutRequest()),
  }
}

export default connect(mapStateToProps, mapDispatchToProps)(DrawerContent)
