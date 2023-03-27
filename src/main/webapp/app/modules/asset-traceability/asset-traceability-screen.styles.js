import { StyleSheet } from 'react-native'
import { ApplicationStyles } from '../../shared/themes'

export default StyleSheet.create({
  ...ApplicationStyles.screen,
  mainContainer: {
    flex: 3,
    flexDirection: 'row',
  },
  graphView: {
    flex: 1.5,
    borderWidth: 0.5,
    borderStyle: 'solid',
    borderRadius: 10,
    margin: 15
  },
  assetView: {
    flex: 0.5,
    padding: 5,
  },
  listTransactions: {
    flex: 1,
    padding: 5,
  },
  date: {
    margin: 10,
  },
  asset: {
    padding: 10,
  },
  metadata: {
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
