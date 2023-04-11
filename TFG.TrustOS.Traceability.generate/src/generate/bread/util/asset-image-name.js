import React from 'react'
import { IconFolderRegular, IconBoxRegular, IconUserAccountRegular, IconFileErrorRegular } from '@telefonica/mistica'

import { TYPES } from './nodes-types'

const SIZE_ICONS = 50

export function getImage(type) {
  switch (type) {
    case TYPES.LEVADURA:
		return <IconBoxRegular size={SIZE_ICONS} />
    case TYPES.SEPARARMASA:
		return <IconFolderRegular size={SIZE_ICONS} />
    case TYPES.PROVEEDOR:
		return <IconUserAccountRegular size={SIZE_ICONS} />
    case TYPES.DINERO:
		return <IconBoxRegular size={SIZE_ICONS} />
    case TYPES.MASA:
		return <IconBoxRegular size={SIZE_ICONS} />
    case TYPES.PAN:
		return <IconBoxRegular size={SIZE_ICONS} />
    case TYPES.PANADERO:
		return <IconUserAccountRegular size={SIZE_ICONS} />
    case TYPES.VENDER:
		return <IconFolderRegular size={SIZE_ICONS} />
    case TYPES.ACEITE:
		return <IconBoxRegular size={SIZE_ICONS} />
    case TYPES.AZUCAR:
		return <IconBoxRegular size={SIZE_ICONS} />
    case TYPES.HARINA:
		return <IconBoxRegular size={SIZE_ICONS} />
    case TYPES.COCINAR:
		return <IconFolderRegular size={SIZE_ICONS} />
    case TYPES.REALIZARMASA:
		return <IconFolderRegular size={SIZE_ICONS} />
    case TYPES.SAL:
		return <IconBoxRegular size={SIZE_ICONS} />
    case TYPES.MASAMADRE:
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

