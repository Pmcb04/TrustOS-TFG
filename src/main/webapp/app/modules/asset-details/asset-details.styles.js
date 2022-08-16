import { StyleSheet } from 'react-native'
import { ApplicationStyles, Colors } from '../../shared/themes'

export default StyleSheet.create({
  ...ApplicationStyles.screen,
  mainContainer: {
    flex: 4,
    flexDirection: 'row',
    backgroundColor: 'white',
  },
  properties: {
    flex: 3,
    borderWidth: 0.5,
    borderStyle: 'solid',
    borderRadius: 10,
    margin: 15,
    padding: 30,
    backgroundColor: Colors.white,
  },
  assetView: {
    flex: 1,
    margin: 15,
  },
  asset: {},
  buttons: {
    marginTop: 20,
  },
  actions: {},
})
