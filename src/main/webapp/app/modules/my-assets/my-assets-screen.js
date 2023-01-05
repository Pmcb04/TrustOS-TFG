import React, { useEffect } from 'react'
import { View } from 'react-native'
import { connect } from 'react-redux'
import { useTranslation } from 'react-i18next'

import AssetList from '../../shared/components/asset-list/asset-list'
import MyAssetsActions from './my-assets-screen.reducer'
import styles from './my-assets-screen.styles'
import MenuFilter from '../../shared/components/menu-filter/menu-filter'

import { ScrollView } from 'react-native-gesture-handler'
import { IMAGES, setImage } from '../../shared/util/images-asset'

import {
  SearchField,
  ButtonLink,
  ThemeContext,
  ButtonLayout,
  FixedFooterLayout,
  ButtonPrimary,
  confirm,
  IconAddMoreRegular,
  RadioGroup,
  RowList,
  Row,
} from '@telefonica/mistica'
const NUM_COLUMNS = 3

function MyAssetsScreen(props) {
  const { t } = useTranslation() //i18n instance
  const { colors } = React.useContext(ThemeContext)
  const { navigation } = props
  const { next, previous, index, numAssets, offset, assetsLoaded, getAssets, search, getAssetsCreate, products } = props

  let typeCreateAssetSelected = products[0].name

  useEffect(() => {
    // if (numAssets === 0) getAssets()
    getAssetsCreate()
  }, [getAssets, numAssets, getAssetsCreate])

  return (
    <View style={[styles.container, styles.mainContainer, { backgroundColor: colors.background }]}>
      <View style={styles.header}>
        <SearchField onChangeValue={search} fullWidth name="search" label={t('SEARCH')} />

        <ButtonPrimary
          onPress={() =>
            confirm({
              message: (
                <View style={styles.container}>
                  <ScrollView>
                    <RadioGroup onChange={(value) => (typeCreateAssetSelected = value)} defaultValue={typeCreateAssetSelected}>
                      <RowList>
                        {products &&
                          products.map((type, i) => (
                            <Row key={i} asset={setImage(IMAGES.PRODUCT)} title={type.name} radioValue={type.name} value={type.name} />
                          ))}
                      </RowList>
                    </RadioGroup>
                  </ScrollView>
                </View>
              ),
              acceptText: t('CREATE'),
              cancelText: t('CANCEL'),
              onAccept: () => navigation.navigate('AssetCreate', { type: typeCreateAssetSelected }),
            })
          }>
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
  products: state.myAssets.products,
})
const mapDispatchToProps = (dispatch) => ({
  getAssets: () => dispatch(MyAssetsActions.myAssetsRequest()),
  next: () => dispatch(MyAssetsActions.myAssetsLoadNextContent()),
  previous: () => dispatch(MyAssetsActions.myAssetsLoadPreviousContent()),
  search: (search) => dispatch(MyAssetsActions.myAssetsSearch(search)),
  getAssetsCreate: () => dispatch(MyAssetsActions.myAssetsCreate()),
})
export default connect(mapStateToProps, mapDispatchToProps)(MyAssetsScreen)
