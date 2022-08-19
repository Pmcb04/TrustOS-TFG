import { StyleSheet } from 'react-native'

import { Colors, Fonts } from '../../themes/index'

export default StyleSheet.create({
  mainContainer: {
    flexDirection: 'row',
    borderRadius: 10,
    alignSelf: 'flex-start',
    padding: 15,
    minHeight: 170,
    minWidth: 250,
    backgroundColor: Colors.white,

    shadowColor: Colors.black,
    shadowOffset: {
      width: 0,
      height: 5,
    },
    shadowOpacity: 0.34,
    shadowRadius: 6.27,

    elevation: 10,
    flex: 2,
  },
  image: {
    opacity: 0.5,
    flex: 1,
  },
  properties: {
    padding: 10,
    flex: 1,
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
