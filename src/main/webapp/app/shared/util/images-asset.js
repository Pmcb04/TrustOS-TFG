import React from 'react'
import { IconFolderRegular, IconBoxRegular } from '@telefonica/mistica'
export const IMAGES = {
  TRANSACTION: 'transaction',
  PRODUCT: 'product',
}
const SIZE_ICONS = 50

// TODO revisar si se necesita autogenerar tambien
export function setImage(image) {
  switch (image) {
    case IMAGES.TRANSACTION:
      return <IconFolderRegular size={SIZE_ICONS} />

    case IMAGES.PRODUCT:
      return <IconBoxRegular size={SIZE_ICONS} />

    default:
      return <IconBoxRegular size={SIZE_ICONS} />
  }
}
