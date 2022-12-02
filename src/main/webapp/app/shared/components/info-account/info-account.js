import React from 'react'
import { View } from 'react-native'
import styles from './info-account.styles'
import { Avatar, Text4, Text6, Text8, Chip } from '@telefonica/mistica'

import { connect } from 'react-redux'

function InfoAccount(props) {
  const { account } = props
  const { small, big } = props

  return (
    <View style={[styles.mainContainer, big ? styles.containerHorizontal : null]}>
      {account && (
        <View style={styles.avatar}>
          <Avatar
            size={big ? 200 : 128}
            src={account.imageUrl}
            initials={account.firstName?.toString().substring(0, 1) || '' + account.lastName?.toString().substring(0, 1) || ''}
          />
        </View>
      )}

      {account && small && (
        <View style={styles.userData}>
          <Text4 medium>{account.firstName}</Text4>
          <Text4 medium>{account.lastName}</Text4>
          <Chip>{account.authorities[0]}</Chip>
        </View>
      )}
      {account && big && (
        <View style={styles.userDataHorizontal}>
          <Text8>{account.firstName}</Text8>
          <Text6>{account.lastName}</Text6>
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
