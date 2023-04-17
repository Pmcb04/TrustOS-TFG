import React from 'react'

import { TYPES } from '../../util/nodes-types'

import Harina from './nodes/Harina'
import SepararMasa from './nodes/SepararMasa'
import Panadero from './nodes/Panadero'
import Cocinar from './nodes/Cocinar'
import Pan from './nodes/Pan'
import Vender from './nodes/Vender'
import Dinero from './nodes/Dinero'
import Aceite from './nodes/Aceite'
import Masa from './nodes/Masa'
import Levadura from './nodes/Levadura'
import Azucar from './nodes/Azucar'
import Sal from './nodes/Sal'
import RealizarMasa from './nodes/RealizarMasa'
import Proveedor from './nodes/Proveedor'
import MasaMadre from './nodes/MasaMadre'

import { permissionsHarina } from './permissions/Harina'
import { permissionsSepararMasa } from './permissions/SepararMasa'
import { permissionsPanadero } from './permissions/Panadero'
import { permissionsCocinar } from './permissions/Cocinar'
import { permissionsPan } from './permissions/Pan'
import { permissionsVender } from './permissions/Vender'
import { permissionsDinero } from './permissions/Dinero'
import { permissionsAceite } from './permissions/Aceite'
import { permissionsMasa } from './permissions/Masa'
import { permissionsLevadura } from './permissions/Levadura'
import { permissionsAzucar } from './permissions/Azucar'
import { permissionsSal } from './permissions/Sal'
import { permissionsRealizarMasa } from './permissions/RealizarMasa'
import { permissionsProveedor } from './permissions/Proveedor'
import { permissionsMasaMadre } from './permissions/MasaMadre'

export function process(data, edit_fields, create, type, rol) {
  switch (type) {
      case TYPES.HARINA:
        return <Harina data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.SEPARARMASA:
        return <SepararMasa data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.PANADERO:
        return <Panadero data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.COCINAR:
        return <Cocinar data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.PAN:
        return <Pan data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.VENDER:
        return <Vender data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.DINERO:
        return <Dinero data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.ACEITE:
        return <Aceite data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.MASA:
        return <Masa data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.LEVADURA:
        return <Levadura data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.AZUCAR:
        return <Azucar data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.SAL:
        return <Sal data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.REALIZARMASA:
        return <RealizarMasa data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.PROVEEDOR:
        return <Proveedor data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.MASAMADRE:
        return <MasaMadre data={data} edit={edit_fields} create={create} rol={rol} />
  }
}

export function getPermissions(type, rol) {
  let canView = [] 
  let canEdit = [] 
  switch (type) {
	case TYPES.HARINA:
        return permissionsHarina(rol)
	case TYPES.SEPARARMASA:
        return permissionsSepararMasa(rol)
	case TYPES.PANADERO:
        return permissionsPanadero(rol)
	case TYPES.COCINAR:
        return permissionsCocinar(rol)
	case TYPES.PAN:
        return permissionsPan(rol)
	case TYPES.VENDER:
        return permissionsVender(rol)
	case TYPES.DINERO:
        return permissionsDinero(rol)
	case TYPES.ACEITE:
        return permissionsAceite(rol)
	case TYPES.MASA:
        return permissionsMasa(rol)
	case TYPES.LEVADURA:
        return permissionsLevadura(rol)
	case TYPES.AZUCAR:
        return permissionsAzucar(rol)
	case TYPES.SAL:
        return permissionsSal(rol)
	case TYPES.REALIZARMASA:
        return permissionsRealizarMasa(rol)
	case TYPES.PROVEEDOR:
        return permissionsProveedor(rol)
	case TYPES.MASAMADRE:
        return permissionsMasaMadre(rol)
	default: 
    return { canView, canEdit }
  }
}
