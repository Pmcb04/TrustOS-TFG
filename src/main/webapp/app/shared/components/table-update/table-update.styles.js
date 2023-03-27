import { StyleSheet } from 'react-native'

import { ApplicationStyles } from '../../themes'

export default StyleSheet.create({
  ...ApplicationStyles.screen,
  mainContainer: {
    padding: 16,
    paddingTop: 30,
  },
  row: {
    flex: 2,
    flexDirection: 'row',
  },
  rowData: {
    flex: 1,
    alignItems: 'center',
    padding: 5,
    borderStyle: 'solid',
    borderBottomWidth: 0.5,
  },
})
