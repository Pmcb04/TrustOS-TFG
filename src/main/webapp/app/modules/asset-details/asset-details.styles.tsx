import { StyleSheet } from 'react-native'

import { Colors } from '../../shared/themes'

export default StyleSheet.create({
  container: {
    flex: 4,
    flexDirection: 'row',
    backgroundColor: 'white',
  },
  properties: {
    flex: 3,

    padding: 30,
    margin: 15,

    borderColor: 'gray',
    borderWidth: 0.5,
    borderStyle: 'solid',

    borderRadius: 10,
    backgroundColor: Colors.white,

    elevation: 10,
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
