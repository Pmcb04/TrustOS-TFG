import React from 'react'
import Botella from './botella/botella'
import Coche from './coche/coche'
import Ordenador from './ordenador/ordenador'
import Pantalon from './pantalon/pantalon'
import Ternero from './ternero/ternero'

import { permissionsBotella } from './botella/permissions'
import { permissionsCoche } from './coche/permissions'
import { permissionsOrdenador } from './ordenador/permissions'
import { permissionsPantalon } from './pantalon/permissions'
import { permissionsTernero } from './ternero/permissions'

// TODO fichero autogenerado
export function process(data, edit_fields, create, type, rol) {
  switch (type) {
    case 'Botella':
      var { canView, canEdit } = permissionsBotella(rol)
      return <Botella data={data} canView={canView} canEdit={canEdit} edit={edit_fields} create={create} />
    case 'Coche':
      var { canView, canEdit } = permissionsBotella(rol)
      return <Coche data={data} canView={canView} canEdit={canEdit} edit={edit_fields} create={create} />
    case 'Ordenador':
      var { canView, canEdit } = permissionsBotella(rol)
      return <Ordenador data={data} canView={canView} canEdit={canEdit} edit={edit_fields} create={create} />
    case 'Pantalon':
      var { canView, canEdit } = permissionsBotella(rol)
      return <Pantalon data={data} canView={canView} canEdit={canEdit} edit={edit_fields} create={create} />
    case 'Ternero':
      var { canView, canEdit } = permissionsBotella(rol)
      return <Ternero data={data} canView={canView} canEdit={canEdit} edit={edit_fields} create={create} />
  }
}

// export function filterData(data, permissions) {
//   let newData = {}
//   console.log('permissions _> ', permissions)
//   Object.keys(data).map((key) => {
//     console.log('key_> ', key)
//     if (typeof data[key] === 'object' && !Array.isArray(data[key])) {
//       const newObject = filterData(data[key], permissions)
//       if (newObject != null) newData[key] = newObject
//     } else if (permissions.includes(key)) {
//       newData[key] = parseType(data[key])
//     }
//   })

//   return newData
// }

// function parseType(str) {
//   if (!isNaN(parseFloat(str))) {
//     return parseFloat(str)
//   }
//   if (!isNaN(parseInt(str, 10))) {
//     return parseInt(str, 10)
//   }

//   return str
// }
