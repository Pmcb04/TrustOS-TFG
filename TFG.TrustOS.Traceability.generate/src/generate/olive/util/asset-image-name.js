import React from 'react'
import { IconFolderRegular, IconBoxRegular, IconUserAccountRegular, IconFileErrorRegular } from '@telefonica/mistica'

import { TYPES } from './nodes-types'

const SIZE_ICONS = 50

export function getImage(type) {
  switch (type) {
    case TYPES.WEIGING:
		return <IconFolderRegular size={SIZE_ICONS} />
    case TYPES.DIRTY_OIL:
		return <IconBoxRegular size={SIZE_ICONS} />
    case TYPES.OLIVE_PASTE:
		return <IconBoxRegular size={SIZE_ICONS} />
    case TYPES.SAMPLING:
		return <IconFolderRegular size={SIZE_ICONS} />
    case TYPES.LABELLING:
		return <IconFolderRegular size={SIZE_ICONS} />
    case TYPES.OLIVE_BATCH:
		return <IconBoxRegular size={SIZE_ICONS} />
    case TYPES.OIL_BOTTLE:
		return <IconBoxRegular size={SIZE_ICONS} />
    case TYPES.FARMER:
		return <IconUserAccountRegular size={SIZE_ICONS} />
    case TYPES.OIL_MILL:
		return <IconUserAccountRegular size={SIZE_ICONS} />
    case TYPES.PACKAGING:
		return <IconFolderRegular size={SIZE_ICONS} />
    case TYPES.COLLECT:
		return <IconFolderRegular size={SIZE_ICONS} />
    case TYPES.OLIVE:
		return <IconBoxRegular size={SIZE_ICONS} />
    case TYPES.CLEAN_OIL:
		return <IconBoxRegular size={SIZE_ICONS} />
    case TYPES.MACHINE:
		return <IconFolderRegular size={SIZE_ICONS} />
    case TYPES.REPORT:
		return <IconBoxRegular size={SIZE_ICONS} />
    default:
      return <IconFileErrorRegular size={SIZE_ICONS} />
  }
}


export function addRandomString(name) {
  return name + '@' + alphaNumberRandom(10)
}

function alphaNumberRandom(length) {
  let result = ''
  const characters = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789'
  const charactersLength = characters.length
  let counter = 0
  while (counter < length) {
    result += characters.charAt(Math.floor(Math.random() * charactersLength))
    counter += 1
  }
  return result
}

