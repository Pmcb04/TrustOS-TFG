import React, { useState } from 'react'
import { SafeAreaView, TouchableOpacity, View, Text } from 'react-native'
import styles from './button-group.styles'

interface ButtonGroupProps {
  buttons: string[]
}

function ButtonGroup({ buttons }: ButtonGroupProps) {
  const [selection, setSelection] = useState(1)

  return (
    <SafeAreaView style={styles.container}>
      <View style={styles.btnGroup}>
        {buttons.map((buttonText, index) => (
          <TouchableOpacity
            style={[styles.btn, index === 0 ? styles.btnFirst : null, index === buttons.length - 1 ? styles.btnLast : null]}
            onPress={() => {
              setSelection(index)
            }}>
            <Text style={styles.btnText}>{buttonText}</Text>
          </TouchableOpacity>
        ))}
      </View>
    </SafeAreaView>
  )
}

export default ButtonGroup
