import React from 'react'
import { DataCard, Tag } from '@telefonica/mistica'

function Asset(props) {
  const { image, name, type, hash } = props
  return <DataCard headline={<Tag type="active">{type}</Tag>} title={name} subtitle={hash} icon={image} />
}

export default Asset
