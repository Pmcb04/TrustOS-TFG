import React from 'react'
import { View } from 'react-native'
import styles from './info-account.styles'
import { Avatar, Text4, Chip } from '@telefonica/mistica'

import { connect } from 'react-redux'

function InfoAccount(props) {
  const { account } = props

  return (
    <View style={styles.mainContainer}>
      {account && (
        <View style={styles.avatar}>
          <Avatar
            size={128}
            src={account.imageUrl}
            initials={account.firstName?.toString().substring(0, 1) || '' + account.lastName?.toString().substring(0, 1) || ''}
          />
        </View>
      )}
      {account && (
        <View style={styles.userData}>
          <Text4 medium>{account.firstName}</Text4>
          <Text4 medium>{account.lastName}</Text4>
          <Chip>{account.authorities[0]}</Chip>
        </View>
      )}
    </View>
  )
}

const mapStateToProps = (state) => {
  return {
    account: state.account.account,
  }
}

const mapDispatchToProps = (dispatch) => {
  return {}
}

export default connect(mapStateToProps, mapDispatchToProps)(InfoAccount)
