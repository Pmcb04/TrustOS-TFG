import React from 'react'
import { DataCard, Tag } from '@telefonica/mistica'

function Asset({ image, name, type, hash }) {
  return <DataCard headline={<Tag type="active">{type}</Tag>} title={name.substring(0, 20)} subtitle={hash.substring(0, 20)} icon={image} />
}

export default Asset
