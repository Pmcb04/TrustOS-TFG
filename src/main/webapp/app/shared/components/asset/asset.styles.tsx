import { StyleSheet } from 'react-native'

import { Colors, Fonts } from '../../themes/index'

export default StyleSheet.create({
  mainContainer: {
    flexDirection: 'column',
    borderRadius: 10,
    alignSelf: 'flex-start',
    padding: 5,
    minHeight: 170,
    minWidth: 250,
    flex: 1,
    backgroundColor: Colors.white,

    shadowColor: Colors.black,
    shadowOffset: {
      width: 0,
      height: 5,
    },
    shadowOpacity: 0.34,
    shadowRadius: 6.27,

    elevation: 10,

    margin: 40,
  },
  image: {
    alignSelf: 'center',
    opacity: 0.5,
  },
  properties: {
    flex: 0.5,
    position: 'absolute',
    bottom: 0,
    padding: 15,
  },
  name: {
    fontSize: Fonts.size.h1,
  },
  type: {
    fontSize: Fonts.size.regular,
  },
  hash: {
    fontSize: Fonts.size.small,
  },
})
