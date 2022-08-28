import React from 'react'
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

// TODO cambiar por futura llamada a la api
const DATA = [
  {
    image: IMAGES.TRANSACTION,
    name: '1bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
    type: 'First Item',
    hash: '8ffbcf002e8ad0cf38be1b3c3f6c61a4a991c0b201c37fbdf8be09e33b083c86',
  },
  {
    image: IMAGES.PRODUCT,
    name: '2bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
    type: 'Second Item',
    hash: '138f885fe5e85b85976ef30c49517de6b6d621ea4e1217ee6324744898c0ee89',
  },
  {
    image: IMAGES.TRANSACTION,
    name: '3bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
    type: 'Thirdth Item',
    hash: 'f9f70916546c55f188a518b5690e9fd5309ba15d255a9db8e14f24ebb6e493bb',
  },
  {
    image: IMAGES.PRODUCT,
    name: '4bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
    type: 'Fourth Item',
    hash: 'b1d9f25b1bf78e25e443a6815b9763b7f7eda25d1dd06486ccfc2130b229dc93',
  },
  {
    image: IMAGES.PRODUCT,
    name: '5bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
    type: 'Fiveth Item',
    hash: 'd73716812e22f390c7452aafa5f132933005845d59e76eb8028adc33dbb9594e',
  },
  {
    image: IMAGES.TRANSACTION,
    name: '6bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
    type: 'Sixth Item',
    hash: '202f19ca2e4184dc8ee7462b34a0176ff3ec1b93ab4342da4997817bc242424c',
  },
  {
    image: IMAGES.PRODUCT,
    name: '7bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
    type: 'Seventh Item',
    hash: 'aa616da40fe12256eba68c1bb63994b7b6dbb79a91a80faaa8703bd5294a469f',
  },
  {
    image: IMAGES.PRODUCT,
    name: '8bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
    type: 'Eighth Item',
    hash: 'ad741f17e93a1d9cee8e4d0e471023f2050724eb53095b3f1c42acd8c5279dc4',
  },
  {
    image: IMAGES.PRODUCT,
    name: '9bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
    type: 'Nineth Item',
    hash: '0febda3c8818d9392e4f4ae5bc0f166e90d94ae693ec88993e610684ba948840',
  },
  {
    image: IMAGES.PRODUCT,
    name: '10bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
    type: 'Tenth Item',
    hash: '13db68913f69080a32d5f683fcca2103d04a34d16294d0db9634aab4c3778d60',
  },
  {
    image: IMAGES.TRANSACTION,
    name: '10bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
    type: 'Eleventh Item',
    hash: '13db68913f69080a32d5f683fcca2103d04a34d16294dbc39634aab4c3778d60',
  },
  {
    image: IMAGES.PRODUCT,
    name: '10bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
    type: 'Twelveth Item',
    hash: '13db68913fb4580a32d5f683fcca2103d04a34d16294d0db9634aab4c3778d60',
  },
  {
    image: IMAGES.TRANSACTION,
    name: '10bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
    type: 'Thirteenth Item',
    hash: '13db68913f69080a32d5f683fcca2103d04a34d16294d0db9634aaaac3778d60',
  },
  {
    image: IMAGES.TRANSACTION,
    name: '10bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
    type: 'Fourteenth Item',
    hash: '13db68913f69080a3ad5f683fcca2103d04a34d16294d0db9634aab4c3778d60',
  },
  {
    image: IMAGES.TRANSACTION,
    name: '10bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
    type: 'Fiveteenth Item',
    hash: '13db68913f69080a32d5f683fcca2103d04a34d16294d0db9634aab4c3778d60',
  },
  {
    image: IMAGES.PRODUCT,
    name: '10bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
    type: 'Sixteenth Item',
    hash: '13db68913f69080a32d5f683fcca2103d04a34d16294d0ab9634aab4c3778d60',
  },
  {
    image: IMAGES.TRANSACTION,
    name: '10bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
    type: 'Seventeenth Item',
    hash: '13db68913f69080a32dbf683fcca2103d04a34d16294d0db9634aab4c3778d60',
  },
  {
    image: IMAGES.TRANSACTION,
    name: '10bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
    type: 'Eighteenth Item',
    hash: '13db68913f69080a32d5f683fcca2103d04a34d16294d26b9634aab4c3778d60',
  },
  {
    image: IMAGES.TRANSACTION,
    name: '10bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
    type: 'Nineteenth Item',
    hash: '13db68913f69080a32d5f683fcca2103d04a34d16bb4d0db9634aab4c3778d60',
  },
  {
    image: IMAGES.PRODUCT,
    name: '10bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
    type: 'Twentieth Item',
    hash: '13db68913f69087732d5f683fcca2103d04a34d16294d0db9634aab4c3778d60',
  },
]

function AssetList(props) {
  const { navigation } = props
  const { assets, getAssets } = props

  React.useEffect(() => {
    console.log(getAssets())
  }, [getAssets])

  console.log(assets)

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
          data={DATA}
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
    <TouchableWithoutFeedback onPress={() => navigation.navigate('AssetDetails', { assetId: itemData.item.name })}>
      <View style={[styles.item, { flex: 1 / NUM_COLUMNS }]}>
        <Asset
          name={itemData.item.name}
          type={itemData.item.type}
          image={
            itemData.item.image === IMAGES.TRANSACTION ? <IconFolderRegular size={SIZE_ICONS} /> : <IconBoxRegular size={SIZE_ICONS} />
          }
          hash={itemData.item.hash}
        />
      </View>
    </TouchableWithoutFeedback>
  )
}

const mapStateToProps = (state) => {
  return {
    assets: state.assetList.assets,
  }
}
const mapDispatchToProps = (dispatch) => {
  return {
    getAssets: () => dispatch(AssetListActions.assetListRequest()),
  }
}
export default connect(mapStateToProps, mapDispatchToProps)(AssetList)
