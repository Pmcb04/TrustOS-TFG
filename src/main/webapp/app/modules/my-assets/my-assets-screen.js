import React from 'react'
import { View } from 'react-native'
import { connect } from 'react-redux'
import { useTranslation } from 'react-i18next'

import AssetList from '../../shared/components/asset-list/asset-list'
import styles from './my-assets-screen.styles'
import { SearchField, ButtonPrimary, ButtonSecondary, IconAddMoreRegular, IconFunnelRegular } from '@telefonica/mistica'

function MyAssetsScreen({ navigation }) {
  const { t } = useTranslation() //i18n instance
  return (
    <View style={[styles.container, styles.mainContainer]}>
      <View style={styles.search}>
        <View style={styles.searchField}>
          <SearchField fullWidth name="search" label={t('SEARCH')} />
        </View>
        <View style={styles.buttons}>
          <ButtonSecondary onPress={() => {}}>
            <IconAddMoreRegular color="currentColor" />
            {t('CREATE')}
          </ButtonSecondary>
          <ButtonPrimary onPress={() => {}}>
            <IconFunnelRegular color="currentColor" />
            {t('FILTER')}
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
