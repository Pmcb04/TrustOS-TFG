import React from 'react'
import { Box, Title1, Text6, Stack } from '@telefonica/mistica'

function Property(props) {
  const { primaryKey, edit, title, value } = props
  return (
    <Box key={primaryKey} paddingBottom={16}>
      <Stack padding={16}>
        <Title1>{title}</Title1>
        {!edit ? ( // in mode view
          <Text6>{value}</Text6>
        ) : (
          // in mode edit o create
          props.children
        )}
      </Stack>
    </Box>
  )
}

export default Property
