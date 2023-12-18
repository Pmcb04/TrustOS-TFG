import React from 'react'

import { TYPES } from '../../util/nodes-types'

import Weiging from './nodes/Weiging'
import Dirty_oil from './nodes/Dirty_oil'
import Olive_paste from './nodes/Olive_paste'
import Sampling from './nodes/Sampling'
import Labelling from './nodes/Labelling'
import Olive_batch from './nodes/Olive_batch'
import Oil_bottle from './nodes/Oil_bottle'
import Farmer from './nodes/Farmer'
import Oil_mill from './nodes/Oil_mill'
import Packaging from './nodes/Packaging'
import Collect from './nodes/Collect'
import Olive from './nodes/Olive'
import Clean_oil from './nodes/Clean_oil'
import Machine from './nodes/Machine'
import Report from './nodes/Report'

import { permissionsWeiging } from './permissions/Weiging'
import { permissionsDirty_oil } from './permissions/Dirty_oil'
import { permissionsOlive_paste } from './permissions/Olive_paste'
import { permissionsSampling } from './permissions/Sampling'
import { permissionsLabelling } from './permissions/Labelling'
import { permissionsOlive_batch } from './permissions/Olive_batch'
import { permissionsOil_bottle } from './permissions/Oil_bottle'
import { permissionsFarmer } from './permissions/Farmer'
import { permissionsOil_mill } from './permissions/Oil_mill'
import { permissionsPackaging } from './permissions/Packaging'
import { permissionsCollect } from './permissions/Collect'
import { permissionsOlive } from './permissions/Olive'
import { permissionsClean_oil } from './permissions/Clean_oil'
import { permissionsMachine } from './permissions/Machine'
import { permissionsReport } from './permissions/Report'

export function process(data, edit_fields, create, type, rol) {
  switch (type) {
      case TYPES.WEIGING:
        return <Weiging data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.DIRTY_OIL:
        return <Dirty_oil data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.OLIVE_PASTE:
        return <Olive_paste data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.SAMPLING:
        return <Sampling data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.LABELLING:
        return <Labelling data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.OLIVE_BATCH:
        return <Olive_batch data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.OIL_BOTTLE:
        return <Oil_bottle data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.FARMER:
        return <Farmer data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.OIL_MILL:
        return <Oil_mill data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.PACKAGING:
        return <Packaging data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.COLLECT:
        return <Collect data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.OLIVE:
        return <Olive data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.CLEAN_OIL:
        return <Clean_oil data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.MACHINE:
        return <Machine data={data} edit={edit_fields} create={create} rol={rol} />
      case TYPES.REPORT:
        return <Report data={data} edit={edit_fields} create={create} rol={rol} />
  }
}

export function getPermissions(type, rol) {
  let canView = [] 
  let canEdit = [] 
  switch (type) {
	case TYPES.WEIGING:
        return permissionsWeiging(rol)
	case TYPES.DIRTY_OIL:
        return permissionsDirty_oil(rol)
	case TYPES.OLIVE_PASTE:
        return permissionsOlive_paste(rol)
	case TYPES.SAMPLING:
        return permissionsSampling(rol)
	case TYPES.LABELLING:
        return permissionsLabelling(rol)
	case TYPES.OLIVE_BATCH:
        return permissionsOlive_batch(rol)
	case TYPES.OIL_BOTTLE:
        return permissionsOil_bottle(rol)
	case TYPES.FARMER:
        return permissionsFarmer(rol)
	case TYPES.OIL_MILL:
        return permissionsOil_mill(rol)
	case TYPES.PACKAGING:
        return permissionsPackaging(rol)
	case TYPES.COLLECT:
        return permissionsCollect(rol)
	case TYPES.OLIVE:
        return permissionsOlive(rol)
	case TYPES.CLEAN_OIL:
        return permissionsClean_oil(rol)
	case TYPES.MACHINE:
        return permissionsMachine(rol)
	case TYPES.REPORT:
        return permissionsReport(rol)
	default: 
    return { canView, canEdit }
  }
}
