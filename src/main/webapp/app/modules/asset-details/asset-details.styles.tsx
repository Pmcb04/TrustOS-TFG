import { StyleSheet } from 'react-native'

import { Colors } from '../../shared/themes'

export default StyleSheet.create({
  container: {
    flex: 3,
    flexDirection: 'row',
    backgroundColor: 'white',
  },
  properties: {
    flex: 2,

    marginHorizontal: 30,
    marginTop: 30,

    borderTopEndRadius: 10,
    borderTopStartRadius: 10,
    backgroundColor: Colors.white,
    shadowColor: Colors.black,
    shadowOffset: {
      width: 5,
      height: -4,
    },
    shadowOpacity: 0.4,
    shadowRadius: 8,

    elevation: 10,
  },
  assetView: {
    flex: 1,
    margin: 40,
  },
  buttonsActions: {
    margin: 20,
  },
  button: {
    alignItems: 'center',
    justifyContent: 'center',
    paddingVertical: 12,
    paddingHorizontal: 32,
    borderRadius: 4,
    elevation: 3,
    backgroundColor: 'black',
  },
  textButton: {
    fontSize: 16,
    lineHeight: 21,
    fontWeight: 'bold',
    letterSpacing: 0.25,
    color: 'white',
  },
})
