import React from 'react'
import Property from '../../property/property'
import { Select, TextField, Title1, IntegerField, DecimalField, DoubleField, Switch, Box, RowList, DateField } from '@telefonica/mistica'

import { permissionsCarne } from './permissions'

// TODO fichero autogenado

function Carne(props) {
  const { data, rol, create, edit } = props
  const { canView, canEdit } = permissionsCarne(rol)

  return (
    <Box>
      {(create || canView.includes('fechaCaducidad')) && (
        <Property
          title="fechaCaducidad"
          primaryKey="fechaCaducidad"
          key={'property-fechaCaducidad'}
          value={data.fechaCaducidad ? data.fechaCaducidad.toString() : null}
          edit={create ? true : canEdit.includes('fechaCaducidad') ? edit : false}>
          <DateField fullWidth key={'fechaCaducidad'} name="fechaCaducidad" defaultValue={data.fechaCaducidad ? data.fechaCaducidad.toString() : null} />
        </Property>
      )}
    </Box>
  )
}

export default Carne
