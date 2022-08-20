import React from 'react'
import { View } from 'react-native'
import styles from './info-account.styles'
import { Avatar, Text4, Text1 } from '@telefonica/mistica'

function InfoAccount() {
  // TODO sustituir por parametro de account
  const name = 'Name1 Name2'
  const lastName = 'LastName1 LastName2'

  return (
    <View style={styles.mainContainer}>
      <View style={styles.avatar}>
        <Avatar size={128} src="https://i.imgur.com/nRBEMMV.png" initials={name.substring(0, 1) + lastName.substring(0, 1)} />
      </View>
      <View style={styles.userData}>
        <Text4 medium>{name}</Text4>
        <Text4 medium>{lastName}</Text4>
        <Text1>Rol</Text1>
      </View>
    </View>
  )
}
export default InfoAccount
