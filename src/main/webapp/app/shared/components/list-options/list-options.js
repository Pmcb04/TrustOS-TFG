import React from 'react'
import { View } from 'react-native'
import styles from './list-options.styles'
import { drawerScreens } from '../../../navigation/drawer/drawer-screens'

import { Stack, Title1, NegativeBox, RowList, Row } from '@telefonica/mistica'

function ListOptions(props) {
  const { navigation } = props

  return (
    <View style={styles.mainContainer}>
      <Stack space={32}>
        {drawerScreens.map((category) => (
          <Stack key={category.categoryName} space={8}>
            <Title1>{category.categoryName}</Title1>
            <NegativeBox>
              <RowList>
                {category.settings.map((setting) => (
                  <Row key={setting.title} title={setting.title} asset={setting.icon} onPress={() => navigation.navigate(setting.title)} />
                ))}
              </RowList>
            </NegativeBox>
          </Stack>
        ))}
      </Stack>
    </View>
  )
}
export default ListOptions
