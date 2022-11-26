import React from 'react'
import { View } from 'react-native'
import styles from './list-options.styles'
import { drawerScreens } from '../../../navigation/drawer/drawer-screens'
import { connect } from 'react-redux'

import { Stack, Title1, NegativeBox, RowList, Row } from '@telefonica/mistica'

function ListOptions(props) {
  const { navigation, account } = props
  const isAuthed = account !== null

  const getScreens = () => {
    const categories = []
    drawerScreens.map((c, index) => {
      const category = c.settings.map((setting) => {
        if (setting.auth === null || setting.auth === undefined) {
          return setting
        } else if (setting.auth === isAuthed) {
          return setting
        }
        return null
      })
      categories.push(category)
    })
    console.log(categories)
    return categories
  }

  return (
    <View style={styles.mainContainer}>
      <Stack space={32}>
        {getScreens().map((category) => (
          <Stack key={category.title} space={8}>
            <Title1>{category.title}</Title1>
            <NegativeBox>
              <RowList>
                {category
                  .filter((setting) => setting !== null)
                  .map((setting, index) => (
                    <Row
                      key={setting.index}
                      title={setting.title}
                      asset={setting.icon}
                      onPress={() => navigation.navigate(setting.title)}
                    />
                  ))}
              </RowList>
            </NegativeBox>
          </Stack>
        ))}
      </Stack>
    </View>
  )
}
const mapStateToProps = (state) => {
  return {
    account: state.account.account,
  }
}

const mapDispatchToProps = (dispatch) => {
  return {}
}

export default connect(mapStateToProps, mapDispatchToProps)(ListOptions)
