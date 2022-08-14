import React from 'react'
import { View } from 'react-native'
import { connect } from 'react-redux'
import AssetList from '../../shared/components/asset-list/asset-list'
import styles from './prueba-screen.styles'

function PruebaScreen({ navigation }) {
  return (
    <View style={styles.container}>
      <AssetList navigation={navigation} />
    </View>
  )
}

const mapStateToProps = (state) => ({ account: state.account.account })
const mapDispatchToProps = (dispatch) => ({})
export default connect(mapStateToProps, mapDispatchToProps)(PruebaScreen)
