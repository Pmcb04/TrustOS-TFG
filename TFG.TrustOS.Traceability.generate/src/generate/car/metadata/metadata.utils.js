import React from 'react'

import { TYPES } from '../../util/nodes-types'

import Mecanico from './nodes/Mecanico'
import Metal from './nodes/Metal'
import Coche from './nodes/Coche'
import MontarRuedas from './nodes/MontarRuedas'
import MontarCarroceria from './nodes/MontarCarroceria'
import Rueda from './nodes/Rueda'
import MontarBase from './nodes/MontarBase'
import MontarMotor from './nodes/MontarMotor'
import Volante from './nodes/Volante'
import CocheFase1 from './nodes/CocheFase1'
import Base from './nodes/Base'
import MontarEsqueleto from './nodes/MontarEsqueleto'
import Administrador from './nodes/Administrador'
import Esqueleto from './nodes/Esqueleto'
import Vender from './nodes/Vender'
import Maquina from './nodes/Maquina'
import Pintar from './nodes/Pintar'
import Pintor from './nodes/Pintor'
import Operario from './nodes/Operario'
import Motor from './nodes/Motor'
import CocheFase2 from './nodes/CocheFase2'
import Plastico from './nodes/Plastico'
import MontarVolante from './nodes/MontarVolante'
import Vendedor from './nodes/Vendedor'
import CocheFase3 from './nodes/CocheFase3'
import Carroceria from './nodes/Carroceria'

import { permissionsMecanico } from './permissions/Mecanico'
import { permissionsMetal } from './permissions/Metal'
import { permissionsCoche } from './permissions/Coche'
import { permissionsMontarRuedas } from './permissions/MontarRuedas'
import { permissionsMontarCarroceria } from './permissions/MontarCarroceria'
import { permissionsRueda } from './permissions/Rueda'
import { permissionsMontarBase } from './permissions/MontarBase'
import { permissionsMontarMotor } from './permissions/MontarMotor'
import { permissionsVolante } from './permissions/Volante'
import { permissionsCocheFase1 } from './permissions/CocheFase1'
import { permissionsBase } from './permissions/Base'
import { permissionsMontarEsqueleto } from './permissions/MontarEsqueleto'
import { permissionsAdministrador } from './permissions/Administrador'
import { permissionsEsqueleto } from './permissions/Esqueleto'
import { permissionsVender } from './permissions/Vender'
import { permissionsMaquina } from './permissions/Maquina'
import { permissionsPintar } from './permissions/Pintar'
import { permissionsPintor } from './permissions/Pintor'
import { permissionsOperario } from './permissions/Operario'
import { permissionsMotor } from './permissions/Motor'
import { permissionsCocheFase2 } from './permissions/CocheFase2'
import { permissionsPlastico } from './permissions/Plastico'
import { permissionsMontarVolante } from './permissions/MontarVolante'
import { permissionsVendedor } from './permissions/Vendedor'
import { permissionsCocheFase3 } from './permissions/CocheFase3'
import { permissionsCarroceria } from './permissions/Carroceria'

export function process(data, edit_fields, create, type, rol) {
  switch (type) {
      case TYPES.MECANICO:
        return <Mecanico data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.METAL:
        return <Metal data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.COCHE:
        return <Coche data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.MONTARRUEDAS:
        return <MontarRuedas data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.MONTARCARROCERIA:
        return <MontarCarroceria data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.RUEDA:
        return <Rueda data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.MONTARBASE:
        return <MontarBase data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.MONTARMOTOR:
        return <MontarMotor data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.VOLANTE:
        return <Volante data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.COCHEFASE1:
        return <CocheFase1 data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.BASE:
        return <Base data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.MONTARESQUELETO:
        return <MontarEsqueleto data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.ADMINISTRADOR:
        return <Administrador data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.ESQUELETO:
        return <Esqueleto data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.VENDER:
        return <Vender data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.MAQUINA:
        return <Maquina data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.PINTAR:
        return <Pintar data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.PINTOR:
        return <Pintor data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.OPERARIO:
        return <Operario data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.MOTOR:
        return <Motor data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.COCHEFASE2:
        return <CocheFase2 data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.PLASTICO:
        return <Plastico data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.MONTARVOLANTE:
        return <MontarVolante data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.VENDEDOR:
        return <Vendedor data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.COCHEFASE3:
        return <CocheFase3 data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.CARROCERIA:
        return <Carroceria data={data} edit={edit_fields} create={create} rol={rol} />
  }
}

export function getPermissions(type, rol) {
  let canView = [] 
  let canEdit = [] 
  switch (type) {
	case TYPES.MECANICO:
        return permissionsMecanico(rol)
	case TYPES.METAL:
        return permissionsMetal(rol)
	case TYPES.COCHE:
        return permissionsCoche(rol)
	case TYPES.MONTARRUEDAS:
        return permissionsMontarRuedas(rol)
	case TYPES.MONTARCARROCERIA:
        return permissionsMontarCarroceria(rol)
	case TYPES.RUEDA:
        return permissionsRueda(rol)
	case TYPES.MONTARBASE:
        return permissionsMontarBase(rol)
	case TYPES.MONTARMOTOR:
        return permissionsMontarMotor(rol)
	case TYPES.VOLANTE:
        return permissionsVolante(rol)
	case TYPES.COCHEFASE1:
        return permissionsCocheFase1(rol)
	case TYPES.BASE:
        return permissionsBase(rol)
	case TYPES.MONTARESQUELETO:
        return permissionsMontarEsqueleto(rol)
	case TYPES.ADMINISTRADOR:
        return permissionsAdministrador(rol)
	case TYPES.ESQUELETO:
        return permissionsEsqueleto(rol)
	case TYPES.VENDER:
        return permissionsVender(rol)
	case TYPES.MAQUINA:
        return permissionsMaquina(rol)
	case TYPES.PINTAR:
        return permissionsPintar(rol)
	case TYPES.PINTOR:
        return permissionsPintor(rol)
	case TYPES.OPERARIO:
        return permissionsOperario(rol)
	case TYPES.MOTOR:
        return permissionsMotor(rol)
	case TYPES.COCHEFASE2:
        return permissionsCocheFase2(rol)
	case TYPES.PLASTICO:
        return permissionsPlastico(rol)
	case TYPES.MONTARVOLANTE:
        return permissionsMontarVolante(rol)
	case TYPES.VENDEDOR:
        return permissionsVendedor(rol)
	case TYPES.COCHEFASE3:
        return permissionsCocheFase3(rol)
	case TYPES.CARROCERIA:
        return permissionsCarroceria(rol)
	default: 
    return { canView, canEdit }
  }
}
