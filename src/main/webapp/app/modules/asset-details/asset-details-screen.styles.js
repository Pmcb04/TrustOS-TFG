import { StyleSheet } from 'react-native'
import { ApplicationStyles } from '../../shared/themes'

export default StyleSheet.create({
  ...ApplicationStyles.screen,
  mainContainer: {
    flex: 4,
    flexDirection: 'row',
  },
  loading: {
    alignContent: 'center',
    flex: 1,
  },
  loadingText: {
    alignSelf: 'center',
    alignItems: 'center',
  },
  property: {
    padding: 5,
  },
  titleProperty: {
    padding: 40,
  },
  propertyBox: {
    padding: 15,
  },
  properties: {
    borderWidth: 0.5,
    borderStyle: 'solid',
    borderRadius: 10,
    margin: 15,
    padding: 30,
  },
  metadata: {
    flex: 3,
  },
  assetView: {
    flex: 1,
    margin: 15,
  },

  asset: {},
  buttons: {
    marginTop: 20,
  },
  owner: {
    margin: 20,
  },
  actions: {
    alignItems: 'center',
  },
})
