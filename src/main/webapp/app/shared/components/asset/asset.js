import React from 'react'
import { DataCard, Tag, IconFolderRegular, IconBoxRegular, Text4, Text1, ThemeContext } from '@telefonica/mistica'

const IMAGES = {
  TRANSACTION: 'transaction',
  PRODUCT: 'product',
}
const SIZE_ICONS = 50

function setImage(image) {
  switch (image) {
    case IMAGES.TRANSACTION:
      return <IconFolderRegular size={SIZE_ICONS} />

    case IMAGES.PRODUCT:
      return <IconBoxRegular size={SIZE_ICONS} />

    default:
      return <IconBoxRegular size={SIZE_ICONS} />
  }
}

function Asset(props) {
  const { colors } = React.useContext(ThemeContext)
  const { image, name, type, hash } = props
  return (
    <DataCard
      headline={<Tag type="active">{type ? type : 'Asset'}</Tag>}
      title={<Text4 color={colors.textPrimary}>{name.substring(0, 30)}</Text4>}
      subtitle={
        <Text1 color={colors.textSecondary} light>
          {hash.substring(0, 30)}
        </Text1>
      }
      icon={setImage(image)}
    />
  )
}

export default Asset
