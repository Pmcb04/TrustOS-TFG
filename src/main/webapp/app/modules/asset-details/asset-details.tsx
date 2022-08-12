import { StackScreenProps } from '@react-navigation/stack'
import React from 'react'
import { View } from 'react-native'
import { RootStackParamList } from '../../navigation/RootStackParamList'
import Asset from '../../shared/components/asset/asset'
import ButtonGroup from '../../shared/components/button-group/button-group'
import Product from '../../shared/themes/icons/product'
import styles from './asset-details.styles'

// TODO cambiar por futura llamada a la api
const DATA = {
  image: <Product width={170} height={170} />,
  name: 'bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
  type: 'Fourth Item',
  hash: 'b1d9f25b1bf78e25e443a6815b9763b7f7eda25d1dd06486ccfc2130b229dc93',
}

type AssetDetailsProps = StackScreenProps<RootStackParamList, 'AssetDetails'>

function AssetDetails({ route }: AssetDetailsProps) {
  const { assetId } = route.params
  const buttons = ['Edit', 'Transfer', 'Action 1']

  return (
    <View style={styles.container}>
      <View style={styles.properties} />
      <View style={styles.assetView}>
        <Asset image={DATA.image} name={assetId} hash={DATA.hash} type={DATA.type} />
        <ButtonGroup buttons={buttons}></ButtonGroup>
      </View>
    </View>
  )
}

export default AssetDetails
