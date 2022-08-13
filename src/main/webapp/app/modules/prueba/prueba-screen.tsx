import { StackScreenProps } from '@react-navigation/stack'
import React from 'react'
import { RootStackParamList } from '../../navigation/RootStackParamList'
import AssetList from '../../shared/components/asset-list/asset-list'

type PruebaScreenProps = StackScreenProps<RootStackParamList, 'AssetDetails'>

function PruebaScreen({ navigation }: PruebaScreenProps) {
  return <AssetList navigation={navigation} />
}

export default PruebaScreen
