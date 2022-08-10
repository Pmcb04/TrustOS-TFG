import React from 'react'
import { View, Text } from 'react-native'
import styles from './asset.styles'

interface Asset {
  image: JSX.Element
  name: string
  type: string
  hash: string
}

function Asset({ image, name, type, hash }: Asset) {
  return (
    <View style={styles.mainContainer}>
      <View style={styles.image}>{image}</View>
      <View style={styles.properties}>
        <Text style={styles.name}>{name}</Text>
        <Text style={styles.type}>{type}</Text>
        <Text style={styles.hash}>{hash}</Text>
      </View>
    </View>
  )
}

export default Asset
