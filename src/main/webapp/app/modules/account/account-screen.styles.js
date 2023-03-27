import { StyleSheet } from 'react-native'

import { ApplicationStyles } from '../../shared/themes'

export default StyleSheet.create({
  ...ApplicationStyles.screen,
  properties: {
    borderWidth: 0.5,
    borderStyle: 'solid',
    borderRadius: 10,
    margin: 15,
    padding: 30,
  },
  user: {
    margin: 10,
    padding: 10,
    borderRadius: 10,
  },
  buttonLogout: {
    margin: 60,
  },
  dataUser: {
    padding: 20,
  },
  dataUserRow: {
    padding: 10,
  },
})
