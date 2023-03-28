import React from 'react'

import { TYPES } from '../../util/nodes-types'

import Botella from './botella/botella'
import Coche from './coche/coche'
import Ordenador from './ordenador/ordenador'
import Pantalon from './pantalon/pantalon'
import Ternero from './ternero/ternero'
import Romper from './romper/romper'
import Usar from './usar/usar'
import ROLE_ADMIN from './role_admin/role_admin'
import ROLE_USER from './role_user/role_user'
import SacrificarTernero from './sacrificarTernero/sacrificarTernero'
import Carne from './carne/carne'

import { permissionsBotella } from './botella/permissions'
import { permissionsCoche } from './coche/permissions'
import { permissionsOrdenador } from './ordenador/permissions'
import { permissionsPantalon } from './pantalon/permissions'
import { permissionsTernero } from './ternero/permissions'
import { permissionsRomper } from './romper/permissions'
import { permissionsUsar } from './usar/permissions'
import { permissionsROLE_ADMIN } from './role_admin/permissions'
import { permissionsROLE_USER } from './role_user/permissions'
import { permissionsSacrificarTernero } from './sacrificarTernero/permissions'
import { permissionsCarne } from './carne/permissions'

// TODO fichero autogenerado
export function process(data, edit_fields, create, type, rol) {
  switch (type) {
    case TYPES.BOTELLA:
      return <Botella data={data} edit={edit_fields} create={create} rol={rol} />
    case TYPES.COCHE:
      return <Coche data={data} edit={edit_fields} create={create} rol={rol} />
    case TYPES.ORDENADOR:
      return <Ordenador data={data} edit={edit_fields} create={create} rol={rol} />
    case TYPES.PANTALON:
      return <Pantalon data={data} edit={edit_fields} create={create} rol={rol} />
    case TYPES.TERNERO:
      return <Ternero data={data} edit={edit_fields} create={create} rol={rol} />
    case TYPES.ROMPER_PANTALON:
      return <Romper data={data} edit={edit_fields} create={create} rol={rol} />
    case TYPES.USAR:
      return <Usar data={data} edit={edit_fields} create={create} rol={rol} />
    case TYPES.ROLE_USER:
      return <ROLE_USER data={data} edit={edit_fields} create={create} rol={rol} />
    case TYPES.ROLE_ADMIN:
      return <ROLE_ADMIN data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.SACRIFICARTERNERO:
        return <SacrificarTernero data={data} edit={edit_fields} create={create} rol={rol} />
        case TYPES.CARNE:
          return <Carne data={data} edit={edit_fields} create={create} rol={rol} />
  }
}

export function getPermissions(type, rol) {
  let canView = []
  let canEdit = []
  switch (type) {
    case TYPES.BOTELLA:
      return permissionsBotella(rol)
    case TYPES.COCHE:
      return permissionsCoche(rol)
    case TYPES.ORDENADOR:
      return permissionsOrdenador(rol)
    case TYPES.PANTALON:
      return permissionsPantalon(rol)
    case TYPES.TERNERO:
      return permissionsTernero(rol)
    case TYPES.ROMPER_PANTALON:
      return permissionsRomper(rol)
    case TYPES.USAR:
      return permissionsUsar(rol)
    case TYPES.ROLE_ADMIN:
      return permissionsROLE_ADMIN(rol)
    case TYPES.ROLE_USER:
      return permissionsROLE_USER(rol)
      case TYPES.SACRIFICARTERNERO:
        return permissionsSacrificarTernero(rol)
        case TYPES.CARNE:
        return permissionsCarne(rol)
    default: 
    return { canView, canEdit }
  }
}
