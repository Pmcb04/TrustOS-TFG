import React from 'react'
import { View } from 'react-native'
import { connect } from 'react-redux'
import AssetList from '../../shared/components/asset-list/asset-list'
import styles from './my-assets-screen.styles'
import { SearchField, ButtonPrimary, ButtonSecondary, IconAddMoreRegular, IconFunnelRegular } from '@telefonica/mistica'

function MyAssetsScreen({ navigation }) {
  return (
    <View style={[styles.container, styles.mainContainer]}>
      <View style={styles.search}>
        <View style={styles.searchField}>
          <SearchField fullWidth name="search" label="Search" />
        </View>
        <View style={styles.buttons}>
          <ButtonSecondary onPress={() => {}}>
            <IconAddMoreRegular color="currentColor" />
            Create
          </ButtonSecondary>
          <ButtonPrimary onPress={() => {}}>
            <IconFunnelRegular color="currentColor" /> Filter
          </ButtonPrimary>
        </View>
      </View>
      <View style={styles.list}>
        <AssetList navigation={navigation} />
      </View>
    </View>
  )
}

const mapStateToProps = (state) => ({ account: state.account.account })
const mapDispatchToProps = (dispatch) => ({})
export default connect(mapStateToProps, mapDispatchToProps)(MyAssetsScreen)
