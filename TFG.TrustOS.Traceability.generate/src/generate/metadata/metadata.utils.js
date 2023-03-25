import React from 'react'

import { TYPES } from '../../util/nodes-types'

import Levadura from './nodes/Levadura'
import MasaMadre from './nodes/MasaMadre'
import Proveedor from './nodes/Proveedor'
import Harina from './nodes/Harina'
import Aceite from './nodes/Aceite'
import Dinero from './nodes/Dinero'
import Sal from './nodes/Sal'
import Vender from './nodes/Vender'
import Panadero from './nodes/Panadero'
import SepararMasa from './nodes/SepararMasa'
import RealizarMasa from './nodes/RealizarMasa'
import Azucar from './nodes/Azucar'
import Masa from './nodes/Masa'
import Pan from './nodes/Pan'
import Cocinar from './nodes/Cocinar'

import { permissionsLevadura } from './permissions/Levadura'
import { permissionsMasaMadre } from './permissions/MasaMadre'
import { permissionsProveedor } from './permissions/Proveedor'
import { permissionsHarina } from './permissions/Harina'
import { permissionsAceite } from './permissions/Aceite'
import { permissionsDinero } from './permissions/Dinero'
import { permissionsSal } from './permissions/Sal'
import { permissionsVender } from './permissions/Vender'
import { permissionsPanadero } from './permissions/Panadero'
import { permissionsSepararMasa } from './permissions/SepararMasa'
import { permissionsRealizarMasa } from './permissions/RealizarMasa'
import { permissionsAzucar } from './permissions/Azucar'
import { permissionsMasa } from './permissions/Masa'
import { permissionsPan } from './permissions/Pan'
import { permissionsCocinar } from './permissions/Cocinar'

export function process(data, edit_fields, create, type, rol) {
  switch (type) {
      case TYPES.LEVADURA:
        return <Levadura data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.MASAMADRE:
        return <MasaMadre data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.PROVEEDOR:
        return <Proveedor data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.HARINA:
        return <Harina data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.ACEITE:
        return <Aceite data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.DINERO:
        return <Dinero data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.SAL:
        return <Sal data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.VENDER:
        return <Vender data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.PANADERO:
        return <Panadero data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.SEPARARMASA:
        return <SepararMasa data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.REALIZARMASA:
        return <RealizarMasa data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.AZUCAR:
        return <Azucar data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.MASA:
        return <Masa data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.PAN:
        return <Pan data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.COCINAR:
        return <Cocinar data={data} edit={edit_fields} create={create} rol={rol} />
  }
}

export function getPermissions(type, rol) {
  switch (type) {
	case TYPES.LEVADURA:
        return permissionsLevadura(rol)
	case TYPES.MASAMADRE:
        return permissionsMasaMadre(rol)
	case TYPES.PROVEEDOR:
        return permissionsProveedor(rol)
	case TYPES.HARINA:
        return permissionsHarina(rol)
	case TYPES.ACEITE:
        return permissionsAceite(rol)
	case TYPES.DINERO:
        return permissionsDinero(rol)
	case TYPES.SAL:
        return permissionsSal(rol)
	case TYPES.VENDER:
        return permissionsVender(rol)
	case TYPES.PANADERO:
        return permissionsPanadero(rol)
	case TYPES.SEPARARMASA:
        return permissionsSepararMasa(rol)
	case TYPES.REALIZARMASA:
        return permissionsRealizarMasa(rol)
	case TYPES.AZUCAR:
        return permissionsAzucar(rol)
	case TYPES.MASA:
        return permissionsMasa(rol)
	case TYPES.PAN:
        return permissionsPan(rol)
	case TYPES.COCINAR:
        return permissionsCocinar(rol)
  }
}
