import React from 'react'
import Property from '../../property/property'
import { Select, TextField, Title1, IntegerField, DecimalField, DoubleField, Switch, Box, RowList, DateField } from '@telefonica/mistica'

import { permissionsSacrificarTernero } from './permissions'

// TODO fichero autogenado

function SacrificarTernero(props) {
  const { data, rol, create, edit } = props
  const { canView, canEdit } = permissionsSacrificarTernero(rol)

  return (
    <Box>
      {(create || canView.includes('fechaSacrificio')) && (
        <Property
          title="fechaSacrificio"
          primaryKey="fechaSacrificio"
          key={'property-fechaSacrificio'}
          value={data.fechaSacrificio ? data.fechaSacrificio.toString() : null}
          edit={create ? true : canEdit.includes('fechaSacrificio') ? edit : false}>
          <DateField fullWidth key={'fechaSacrificio'} name="fechaSacrificio" defaultValue={data.fechaSacrificio ? data.fechaSacrificio.toString() : null} />
        </Property>
      )}
    </Box>
  )
}

export default SacrificarTernero
