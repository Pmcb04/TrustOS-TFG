import React from 'react'
import { FlatList, View, TouchableWithoutFeedback } from 'react-native'
import Product from '../../themes/icons/product'
import Transaction from '../../themes/icons/transaction'
import styles from './asset-list.styles'
import Asset from '../asset/asset'

const WIDTH_IMAGE = 40
const HEIGHT_IMAGE = 40

// TODO cambiar por futura llamada a la api
const DATA = [
  {
    image: <Transaction width={WIDTH_IMAGE} height={HEIGHT_IMAGE} />,
    name: '1bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
    type: 'First Item',
    hash: '8ffbcf002e8ad0cf38be1b3c3f6c61a4a991c0b201c37fbdf8be09e33b083c86',
  },
  {
    image: <Product width={WIDTH_IMAGE} height={HEIGHT_IMAGE} />,
    name: '2bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
    type: 'Second Item',
    hash: '138f885fe5e85b85976ef30c49517de6b6d621ea4e1217ee6324744898c0ee89',
  },
  {
    image: <Transaction width={WIDTH_IMAGE} height={HEIGHT_IMAGE} />,
    name: '3bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
    type: 'Thirdth Item',
    hash: 'f9f70916546c55f188a518b5690e9fd5309ba15d255a9db8e14f24ebb6e493bb',
  },
  {
    image: <Product width={WIDTH_IMAGE} height={HEIGHT_IMAGE} />,
    name: '4bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
    type: 'Fourth Item',
    hash: 'b1d9f25b1bf78e25e443a6815b9763b7f7eda25d1dd06486ccfc2130b229dc93',
  },
  {
    image: <Product width={WIDTH_IMAGE} height={HEIGHT_IMAGE} />,
    name: '5bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
    type: 'Fiveth Item',
    hash: 'd73716812e22f390c7452aafa5f132933005845d59e76eb8028adc33dbb9594e',
  },
  {
    image: <Transaction width={WIDTH_IMAGE} height={HEIGHT_IMAGE} />,
    name: '6bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
    type: 'Sixth Item',
    hash: '202f19ca2e4184dc8ee7462b34a0176ff3ec1b93ab4342da4997817bc242424c',
  },
  {
    image: <Product width={WIDTH_IMAGE} height={HEIGHT_IMAGE} />,
    name: '7bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
    type: 'Seventh Item',
    hash: 'aa616da40fe12256eba68c1bb63994b7b6dbb79a91a80faaa8703bd5294a469f',
  },
  {
    image: <Product width={WIDTH_IMAGE} height={HEIGHT_IMAGE} />,
    name: '8bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
    type: 'Eighth Item',
    hash: 'ad741f17e93a1d9cee8e4d0e471023f2050724eb53095b3f1c42acd8c5279dc4',
  },
  {
    image: <Product width={WIDTH_IMAGE} height={HEIGHT_IMAGE} />,
    name: '9bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
    type: 'Nineth Item',
    hash: '0febda3c8818d9392e4f4ae5bc0f166e90d94ae693ec88993e610684ba948840',
  },
  {
    image: <Transaction width={WIDTH_IMAGE} height={HEIGHT_IMAGE} />,
    name: '10bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
    type: 'Tenth Item',
    hash: '13db68913f69080a32d5f683fcca2103d04a34d16294d0db9634aab4c3778d60',
  },
]

function AssetList({ navigation }) {
  return (
    <View style={styles.container}>
      <FlatList data={DATA} keyExtractor={(item) => item.hash} numColumns={3} renderItem={(item) => renderCategoryItem(item, navigation)} />
    </View>
  )
}

const renderCategoryItem = (itemData, navigation) => {
  return (
    <TouchableWithoutFeedback onPress={() => navigation.navigate('AssetDetails', { assetId: itemData.item.name })}>
      <View style={styles.item}>
        <Asset name={itemData.item.name} type={itemData.item.type} image={itemData.item.image} hash={itemData.item.hash} />
      </View>
    </TouchableWithoutFeedback>
  )
}

export default AssetList
