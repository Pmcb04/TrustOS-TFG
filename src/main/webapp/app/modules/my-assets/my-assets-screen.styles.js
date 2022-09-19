import { StyleSheet } from 'react-native'

import { ApplicationStyles } from '../../shared/themes'

export default StyleSheet.create({
  ...ApplicationStyles.screen,
  mainContainer: {
    padding: 20,
  },
  header: {
    flexDirection: 'row',
  },
  searchField: {
    flex: 1,
    padding: 10,
  },
  headerButton: {
    margin: 10,
  },
  buttons: {
    flexDirection: 'row',
  },

  content: {
    flexDirection: 'row',
    flex: 4,
  },
  list: {
    flex: 3,
    margin: 20,
  },
  menu: {
    flex: 1,
    margin: 30,
  },
})
