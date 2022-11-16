import React from 'react'
import { View } from 'react-native'

import { connect } from 'react-redux'
import { ThemeContext } from '@telefonica/mistica'

import styles from './account-screen.styles'

function AccountScreen(props) {
  const { colors } = React.useContext(ThemeContext)
  return <View style={[styles.container, { backgroundColor: colors.background }]}></View>
}

const mapStateToProps = (state) => ({ account: state.account.account })
const mapDispatchToProps = (dispatch) => ({})
export default connect(mapStateToProps, mapDispatchToProps)(AccountScreen)
