import React, { useEffect } from 'react'
import { View } from 'react-native'
import { connect } from 'react-redux'
import { useTranslation } from 'react-i18next'

import AssetList from '../../shared/components/asset-list/asset-list'
import MyAssetsActions from './my-assets-screen.reducer'
import styles from './my-assets-screen.styles'
import MenuFilter from '../../shared/components/menu-filter/menu-filter'
import {
  SearchField,
  ButtonPrimary,
  ButtonLink,
  IconAddMoreRegular,
  ThemeContext,
  ButtonLayout,
  FixedFooterLayout,
} from '@telefonica/mistica'

const NUM_COLUMNS = 3

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
      <View style={styles.header}>
        <SearchField onChangeValue={search} fullWidth name="search" label={t('SEARCH')} />

        <ButtonPrimary onPress={() => {}}>
          <IconAddMoreRegular color="currentColor" />
          {t('CREATE')}
        </ButtonPrimary>
      </View>
      <View style={styles.content}>
        <View style={styles.list}>
          <AssetList navigation={navigation} data={assetsLoaded} numColums={NUM_COLUMNS} />
          <FixedFooterLayout>
            <ButtonLayout align="center">
              <ButtonLink small disabled={index === 1} onPress={previous}>
                {t('PREVIOUS')}
              </ButtonLink>
              <ButtonLink small disabled={index * offset >= numAssets} onPress={next}>
                {t('NEXT')}
              </ButtonLink>
            </ButtonLayout>
          </FixedFooterLayout>
        </View>
        <View style={styles.menu}>
          <MenuFilter />
        </View>
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
