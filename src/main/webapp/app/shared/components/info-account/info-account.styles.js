import { StyleSheet } from 'react-native'
import { Fonts } from '../../themes'

export default StyleSheet.create({
  mainContainer: {
    padding: 20,
    alignItems: 'center',
    textAlign: 'center',
    fontFamily: Fonts.type.base,
  },
  containerHorizontal: {
    flexDirection: 'row',
    textAlign: 'start',
  },
  userData: {
    padding: 10,
  },
  userDataHorizontal: {
    padding: 30,
  },
})
