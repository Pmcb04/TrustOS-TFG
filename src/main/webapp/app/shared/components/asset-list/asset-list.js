import React from 'react'
import { FlatList, View, TouchableWithoutFeedback } from 'react-native'
import styles from './asset-list.styles'
import Asset from '../asset/asset'
import { Text7 } from '@telefonica/mistica'
import { ScrollView } from 'react-native-gesture-handler'

function AssetList(props) {
  const { navigation } = props
  const { data, numColums } = props

  const listEmpty = () => {
    return (
      <View style={styles.listEmpty}>
        <Text7 medium style={styles.item}>
          No assets found
        </Text7>
      </View>
    )
  }

  const renderCategoryItem = (itemData) => {
    return (
      <TouchableWithoutFeedback
        onPress={() => navigation.navigate('AssetDetails', { assetId: itemData.item.assetId, isAuthorised: itemData.item.isAuthorised })}>
        <View style={[styles.item, { flex: 1 / numColums }]}>
          <Asset
            name={itemData.item.assetId}
            type={itemData.item.data.type}
            image={itemData.item.data.image}
            hash={itemData.item.hash}
            authorizathed={itemData.item.isAuthorised}
          />
        </View>
      </TouchableWithoutFeedback>
    )
  }

  return (
    <View style={styles.container}>
      <ScrollView>
        <FlatList
          data={data}
          keyExtractor={(item) => item.hash}
          ListEmptyComponent={listEmpty}
          numColumns={numColums}
          renderItem={(asset) => renderCategoryItem(asset)}
        />
      </ScrollView>
    </View>
  )
}

export default AssetList
