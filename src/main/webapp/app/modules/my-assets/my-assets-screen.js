import React from 'react'
import { View } from 'react-native'
import { connect } from 'react-redux'
import { useTranslation } from 'react-i18next'

import AssetList from '../../shared/components/asset-list/asset-list'
import AssetListActions from '../../shared/components/asset-list/asset-list.reducer'
import styles from './my-assets-screen.styles'
import {
  SearchField,
  ButtonPrimary,
  ButtonSecondary,
  IconAddMoreRegular,
  IconFunnelRegular,
  ThemeContext,
  ButtonLayout,
} from '@telefonica/mistica'

// FIXME cuando se recarga la pagina el state assets se encuentra vacio
function MyAssetsScreen(props) {
  const { t } = useTranslation() //i18n instance
  const { colors } = React.useContext(ThemeContext)
  const { navigation } = props
  const { next, previous, index, numAssets, offset } = props

  return (
    <View style={[styles.container, styles.mainContainer, { backgroundColor: colors.background }]}>
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
        {offset < numAssets ? (
          <ButtonLayout align="center">
            <ButtonPrimary small disabled={index === offset} onPress={previous}>
              previous
            </ButtonPrimary>
            <ButtonPrimary small disabled={index >= numAssets} onPress={next}>
              next
            </ButtonPrimary>
          </ButtonLayout>
        ) : null}
      </View>
    </View>
  )
}

const mapStateToProps = (state) => ({
  index: state.assetList.index,
  numAssets: state.assetList.numAssets,
  offset: state.assetList.offset,
  assets: state.assetList.assets,
})
const mapDispatchToProps = (dispatch) => ({
  next: () => dispatch(AssetListActions.assetListLoadNextContent()),
  previous: () => dispatch(AssetListActions.assetListLoadPreviousContent()),
})
export default connect(mapStateToProps, mapDispatchToProps)(MyAssetsScreen)
