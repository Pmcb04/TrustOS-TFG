import { StyleSheet } from 'react-native'
import { ApplicationStyles } from '../../shared/themes'

export default StyleSheet.create({
  ...ApplicationStyles.screen,
  mainContainer: {
    padding: 30,
    flex: 3,
    flexDirection: 'row',
  },
  list: {
    flex: 1,
    padding: 5,
  },
  metadata: {
    flex: 2,
    padding: 5,
  },
  contentContainer: {
    padding: 10,
  },
})
