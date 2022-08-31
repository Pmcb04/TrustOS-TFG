import React, { useEffect } from 'react'
import { View } from 'react-native'
import { connect } from 'react-redux'
import { useTranslation } from 'react-i18next'

import AssetList from '../../shared/components/asset-list/asset-list'
import MyAssetsActions from './my-assets-screen.reducer'
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

const NUM_COLUMNS = 3

// FIXME cuando se recarga la pagina el state assets se encuentra vacio
function MyAssetsScreen(props) {
  const { t } = useTranslation() //i18n instance
  const { colors } = React.useContext(ThemeContext)
  const { navigation } = props
  const { next, previous, index, numAssets, offset, assetsLoaded, getAssets, search } = props

  useEffect(() => {
    if (numAssets === 0) getAssets()
  }, [getAssets, numAssets])

  return (
    <View style={[styles.container, styles.mainContainer, { backgroundColor: colors.background }]}>
      <View style={styles.search}>
        <View style={styles.searchField}>
          <SearchField onChangeValue={search} fullWidth name="search" label={t('SEARCH')} />
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
        <AssetList navigation={navigation} data={assetsLoaded} numColums={NUM_COLUMNS} />
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
  index: state.myAssets.index,
  numAssets: state.myAssets.numAssets,
  offset: state.myAssets.offset,
  assetsLoaded: state.myAssets.assetsLoaded,
})
const mapDispatchToProps = (dispatch) => ({
  getAssets: () => dispatch(MyAssetsActions.myAssetsRequest()),
  next: () => dispatch(MyAssetsActions.myAssetsLoadNextContent()),
  previous: () => dispatch(MyAssetsActions.myAssetsLoadPreviousContent()),
  search: (search) => dispatch(MyAssetsActions.myAssetsSearch(search)),
})
export default connect(mapStateToProps, mapDispatchToProps)(MyAssetsScreen)
