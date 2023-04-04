import React from 'react'
import { IconFolderRegular, IconBoxRegular, IconUserAccountRegular, IconFileErrorRegular } from '@telefonica/mistica'

import { TYPES } from './nodes-types'

const SIZE_ICONS = 50

export function getImage(type) {
  switch (type) {
    case TYPES.MECANICO:
		return <IconUserAccountRegular size={SIZE_ICONS} />
    case TYPES.METAL:
		return <IconBoxRegular size={SIZE_ICONS} />
    case TYPES.COCHE:
		return <IconBoxRegular size={SIZE_ICONS} />
    case TYPES.MONTARRUEDAS:
		return <IconFolderRegular size={SIZE_ICONS} />
    case TYPES.MONTARCARROCERIA:
		return <IconFolderRegular size={SIZE_ICONS} />
    case TYPES.RUEDA:
		return <IconBoxRegular size={SIZE_ICONS} />
    case TYPES.MONTARBASE:
		return <IconFolderRegular size={SIZE_ICONS} />
    case TYPES.MONTARMOTOR:
		return <IconFolderRegular size={SIZE_ICONS} />
    case TYPES.VOLANTE:
		return <IconBoxRegular size={SIZE_ICONS} />
    case TYPES.COCHEFASE1:
		return <IconBoxRegular size={SIZE_ICONS} />
    case TYPES.BASE:
		return <IconBoxRegular size={SIZE_ICONS} />
    case TYPES.MONTARESQUELETO:
		return <IconFolderRegular size={SIZE_ICONS} />
    case TYPES.ADMINISTRADOR:
		return <IconUserAccountRegular size={SIZE_ICONS} />
    case TYPES.ESQUELETO:
		return <IconBoxRegular size={SIZE_ICONS} />
    case TYPES.VENDER:
		return <IconFolderRegular size={SIZE_ICONS} />
    case TYPES.MAQUINA:
		return <IconUserAccountRegular size={SIZE_ICONS} />
    case TYPES.PINTAR:
		return <IconFolderRegular size={SIZE_ICONS} />
    case TYPES.PINTOR:
		return <IconUserAccountRegular size={SIZE_ICONS} />
    case TYPES.OPERARIO:
		return <IconUserAccountRegular size={SIZE_ICONS} />
    case TYPES.MOTOR:
		return <IconBoxRegular size={SIZE_ICONS} />
    case TYPES.COCHEFASE2:
		return <IconBoxRegular size={SIZE_ICONS} />
    case TYPES.PLASTICO:
		return <IconBoxRegular size={SIZE_ICONS} />
    case TYPES.MONTARVOLANTE:
		return <IconFolderRegular size={SIZE_ICONS} />
    case TYPES.VENDEDOR:
		return <IconUserAccountRegular size={SIZE_ICONS} />
    case TYPES.COCHEFASE3:
		return <IconBoxRegular size={SIZE_ICONS} />
    case TYPES.CARROCERIA:
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

