import { StyleSheet } from 'react-native'

import { ApplicationStyles } from '../../shared/themes'

export default StyleSheet.create({
  ...ApplicationStyles.screen,
  mainContainer: {},
  search: {
    flexDirection: 'row',
  },
  searchField: {
    flex: 1,
    padding: 10,
  },
  buttons: {
    flexDirection: 'row',
    padding: 10,
  },
  list: {},
})
