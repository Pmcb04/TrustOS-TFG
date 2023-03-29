import React from 'react'
import { IconFolderRegular, IconBoxRegular } from '@telefonica/mistica'

import { TYPES } from './nodes-types'
import { NAMES } from './nodes-names'

const SIZE_ICONS = 50

export function getImage(type) {
  switch (type) {
    case TYPES.TERNERO:
      return <IconFolderRegular size={SIZE_ICONS} />
    case TYPES.BOTELLA:
      return <IconBoxRegular size={SIZE_ICONS} />
    case TYPES.PANTALON:
      return <IconBoxRegular size={SIZE_ICONS} />
    case TYPES.ROMPER:
      return <IconFolderRegular size={SIZE_ICONS} />
      case TYPES.SACRIFICARTERNERO:
        return <IconFolderRegular size={SIZE_ICONS} />
        case TYPES.CARNE:
          return <IconBoxRegular size={SIZE_ICONS} />
    default:
      return <IconBoxRegular size={SIZE_ICONS} />
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