import React from 'react'
import { Text, View } from 'react-native'
import styles from './asset.styles'

interface AssetProps {
  image: JSX.Element
  name: string
  type: string
  hash: string
}

function Asset({ image, name, type, hash }: AssetProps) {
  return (
    <View style={styles.mainContainer}>
      <View style={styles.properties}>
        <Text style={styles.name}>{name.substring(0, 20)}</Text>
        <Text style={styles.type}>{type}</Text>
        <Text style={styles.hash}>{hash.substring(0, 20)}</Text>
      </View>
      <View style={styles.image}>{image}</View>
    </View>
  )
}

export default Asset
