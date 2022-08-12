import { StyleSheet } from 'react-native'

export default StyleSheet.create({
  container: {
    flex: 1,
    margin: 20,
  },
  btnGroup: {
    flexDirection: 'column',
  },
  btn: {
    flex: 1,
    backgroundColor: 'white',
    borderColor: 'grey',
    borderStyle: 'solid',
    borderWidth: 0.1,
    margin: 0.5,
  },
  btnFirst: {
    backgroundColor: 'blue',
    borderTopStartRadius: 5,
    borderTopEndRadius: 5,
  },

  btnLast: {
    borderBottomStartRadius: 5,
    borderBottomEndRadius: 5,
  },
  btnText: {
    textAlign: 'center',
    color: 'black',
    fontWeight: 'bold',
    paddingVertical: 16,
    fontSize: 14,
  },
})
