import React from 'react'
import { View } from 'react-native'
import Property from '../../property/property'
import { Select, TextField, Title1, IntegerField, DecimalField, DoubleField, Switch, Box } from '@telefonica/mistica'

import { permissionsTernero } from './permissions'

// TODO fichero autogenado

function Ternero(props) {
  const { data, rol, create, edit } = props
  const { canView, canEdit } = permissionsTernero(rol)

  return (
    <Box>
      {(create || canView.includes('height')) && (
        <Property
          title="heigth"
          primaryKey="heigth"
          key={'property-height'}
          value={!create && data.heigth ? data.heigth.toString() : null}
          edit={create ? true : canEdit.includes('heigth') ? edit : false}>
          <DecimalField key={'heigth'} name="heigth" label="heigth" defaultValue={!create && data.heigth ? data.heigth.toString() : null} />
        </Property>
      )}
      {(create || canView.includes('width')) && (
        <Property
          title="width"
          primaryKey="width"
          key={'property-width'}
          value={!create && data.width ? data.width.toString() : null}
          edit={create ? true : canEdit.includes('width') ? edit : false}>
          <DecimalField key={'width'} name="width" label="width" defaultValue={!create && data.width ? data.width.toString() : null} />
        </Property>
      )}
    </Box>
  )
}

export default Ternero
