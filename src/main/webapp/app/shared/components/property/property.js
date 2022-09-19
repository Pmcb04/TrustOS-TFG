import React from 'react'
import { Box, Title1, Text6 } from '@telefonica/mistica'

function Property(props) {
  const { primaryKey, edit, title, value } = props
  return (
    <Box key={primaryKey} padding={8}>
      {!edit ? (
        <>
          <Title1>{title}</Title1>
          <Text6>{value}</Text6>
        </>
      ) : (
        props.children
      )}
    </Box>
  )
}

export default Property
