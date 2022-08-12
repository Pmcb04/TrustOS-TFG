import { StackScreenProps } from '@react-navigation/stack'
import React from 'react'
import { View } from 'react-native'
import { RootStackParamList } from '../../navigation/RootStackParamList'
import AssetList from '../../shared/components/asset-list/asset-list'

type PruebaScreenProps = StackScreenProps<RootStackParamList, 'AssetDetails'>

function PruebaScreen({ navigation }: PruebaScreenProps) {
  return (
    <View>
      <AssetList navigation={navigation} />
    </View>
  )
}

export default PruebaScreen
