import React, { useState } from 'react'
import { View } from 'react-native'
import styles from './property-box.styles'
import { Title2, Divider, Box, Inline, IconButton, IconChevronDownRegular, IconChevronTopRegular } from '@telefonica/mistica'

function PropertyBox(props) {
  const { title } = props
  const [showMore, setShowMore] = useState(true)
  return (
    <Box key={title}>
      <Box key={title} padding={10}>
        <Inline key={title} space={8}>
          <Title2 key={title + 'title'}>{title}</Title2>
          {showMore ? (
            <IconButton key={title} onPress={() => setShowMore(false)}>
              <IconChevronTopRegular key={title} />
            </IconButton>
          ) : (
            <IconButton key={title} onPress={() => setShowMore(true)}>
              <IconChevronDownRegular key={title} />
            </IconButton>
          )}
        </Inline>
      </Box>
      <Divider key={title + 'divider1'} />
      {showMore && (
        <Box key={title + 'field'} padding={20}>
          {props.children}
        </Box>
      )}
      {!showMore && (
        <View style={styles.hiddenField} key={title + 'field'} padding={20}>
          {props.children}
        </View>
      )}
    </Box>
  )
}

export default PropertyBox
