import React from 'react'
import { View } from 'react-native'
import Asset from '../../shared/components/asset/asset'
import Product from '../../shared/themes/icons/product'
import Transaction from '../../shared/themes/icons/transaction'

function PruebaScreen() {
  return (
    <View>
      <Asset image={<Product width={250} height={170} />} name={'Prueba'} type={'Tipo'} hash={'kjekijdsfjsd'} />
      <Asset image={<Transaction width={250} height={170} />} name={'Prueba'} type={'Tipo'} hash={'kjekijdsfjsd'} />
    </View>
  )
}

export default PruebaScreen
