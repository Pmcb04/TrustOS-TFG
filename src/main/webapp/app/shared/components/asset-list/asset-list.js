import React, { useEffect } from 'react'
import { FlatList, View, TouchableWithoutFeedback } from 'react-native'
import styles from './asset-list.styles'
import Asset from '../asset/asset'
import { IconFolderRegular, IconBoxRegular, Text7 } from '@telefonica/mistica'
import { ScrollView } from 'react-native-gesture-handler'
import { connect } from 'react-redux'
import AssetListActions from './asset-list.reducer'

const SIZE_ICONS = 32
const NUM_COLUMNS = 3
const IMAGES = {
  TRANSACTION: 'transaction',
  PRODUCT: 'product',
}

function AssetList(props) {
  const { navigation } = props
  const { assetsLoaded, next } = props

  useEffect(() => {
    next() // first load of list
  }, [next])

  console.log('assetsLoaded', assetsLoaded)

  const listEmpty = () => {
    return (
      <View style={styles.listEmpty}>
        <Text7 medium style={styles.item}>
          No assets found
        </Text7>
      </View>
    )
  }

  return (
    <View style={styles.container}>
      <ScrollView>
        <FlatList
          data={assetsLoaded}
          keyExtractor={(item) => item.hash}
          ListEmptyComponent={listEmpty}
          numColumns={NUM_COLUMNS}
          renderItem={(asset) => renderCategoryItem(asset, navigation)}
        />
      </ScrollView>
    </View>
  )
}

const renderCategoryItem = (itemData, navigation) => {
  return (
    <TouchableWithoutFeedback onPress={() => navigation.navigate('AssetDetails', { assetId: itemData.item.assetId })}>
      <View style={[styles.item, { flex: 1 / NUM_COLUMNS }]}>
        <Asset
          name={itemData.item.assetId}
          type={itemData.item.data.type}
          image={
            itemData.item.data.image === IMAGES.TRANSACTION ? <IconFolderRegular size={SIZE_ICONS} /> : <IconBoxRegular size={SIZE_ICONS} />
          }
          hash={itemData.item.hash}
        />
      </View>
    </TouchableWithoutFeedback>
  )
}

const mapStateToProps = (state) => {
  return {
    assetsLoaded: state.assetList.assetsLoaded,
  }
}
const mapDispatchToProps = (dispatch) => {
  return {
    init: () => dispatch(AssetListActions.assetListInit()),
    next: () => dispatch(AssetListActions.assetListLoadNextContent()),
  }
}
export default connect(mapStateToProps, mapDispatchToProps)(AssetList)
