import { StyleSheet } from 'react-native'

import { ApplicationStyles } from '../../shared/themes'

export default StyleSheet.create({
  ...ApplicationStyles.screen,
  table: {
    flex: 2,
    flexDirection: 'row',
    padding: 20
  },
  column: {
    flex: 1,
    padding: 10,
  },
  row: {
    textAlign: 'center',
    margin: 40,
  },
  borderTable: {
    borderWidth: 0.5,
    borderStyle: 'solid',
    borderRadius: 10,
    padding: 30,
  },
  tablesSteps: {
    padding: 20,
  },
  titleTable: {
    textAlign: 'center',
    padding: 10
  }
})
