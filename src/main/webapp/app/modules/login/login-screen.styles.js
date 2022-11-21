import { StyleSheet } from 'react-native'

import { ApplicationStyles } from '../../shared/themes'

export default StyleSheet.create({
  ...ApplicationStyles.screen,
  login: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
  },
})
