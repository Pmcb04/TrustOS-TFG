import React from 'react'

import { TYPES } from '../../util/nodes-types'

import Botella from './botella/botella'
import Coche from './coche/coche'
import Ordenador from './ordenador/ordenador'
import Pantalon from './pantalon/pantalon'
import Ternero from './ternero/ternero'
import Romper from './romper/romper'

import { permissionsBotella } from './botella/permissions'
import { permissionsCoche } from './coche/permissions'
import { permissionsOrdenador } from './ordenador/permissions'
import { permissionsPantalon } from './pantalon/permissions'
import { permissionsTernero } from './ternero/permissions'
import { permissionsRomper } from './romper/permissions'

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
    case TYPES.ROMPER:
      return <Romper data={data} edit={edit_fields} create={create} rol={rol} />
  }
}

export function getPermissions(type, rol) {
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
    case TYPES.ROMPER:
      return permissionsRomper(rol)
  }
}
