import React, { useState } from 'react'
import { View } from 'react-native'
import styles from './property-box.styles'
import { Title2, Divider, Box, Inline, IconButton, IconChevronDownRegular, IconChevronTopRegular } from '@telefonica/mistica'

function PropertyBox(props) {
  const { title, field, primaryKey } = props
  const [showMore, setShowMore] = useState(true) // TODO cambiar a redux?
  return (
    <Box key={primaryKey}>
      <Box key={primaryKey} padding={10}>
        <Inline key={primaryKey} space={8}>
          <Title2 key={primaryKey + 'title'}>{title}</Title2>
          {showMore ? (
            <IconButton key={primaryKey} onPress={() => setShowMore(false)}>
              <IconChevronTopRegular key={primaryKey} />
            </IconButton>
          ) : (
            <IconButton key={primaryKey} onPress={() => setShowMore(true)}>
              <IconChevronDownRegular key={primaryKey} />
            </IconButton>
          )}
        </Inline>
      </Box>
      <Divider key={primaryKey + 'divider1'} />
      {showMore && (
        <Box key={primaryKey + 'field'} padding={20}>
          {field}
        </Box>
      )}
      {!showMore && (
        <View style={styles.hiddenField} key={primaryKey + 'field'} padding={20}>
          {field}
        </View>
      )}
    </Box>
  )
}

export default PropertyBox
