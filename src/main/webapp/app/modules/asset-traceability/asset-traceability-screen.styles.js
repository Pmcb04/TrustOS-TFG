import { StyleSheet } from 'react-native'
import { ApplicationStyles } from '../../shared/themes'

export default StyleSheet.create({
  ...ApplicationStyles.screen,
  mainContainer: {
    padding: 30,
    flex: 3,
    flexDirection: 'row',
  },
  listView: {
    flex: 1,
    padding: 5,
  },
  list: {
    padding: 5,
  },
  date: {
    margin: 10,
  },
  assetView: {
    flex: 2,
    padding: 5,
  },
  asset: {
    padding: 10,
  },
  metadata: {
    padding: 10,
  },
  contentContainer: {
    padding: 10,
  },
  transaction: {
    padding: 5,
  },
  dateFilter: {
    padding: 5,
  },
  buttonFilter: {
    padding: 5,
  },
})
