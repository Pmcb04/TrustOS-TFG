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
          title="height"
          primaryKey="height"
          key={'property-height'}
          value={data.height ? data.height.toString() : null}
          edit={create ? true : canEdit.includes('height') ? edit : false}>
          <DecimalField fullWidth key={'height'} name="height" defaultValue={data.height ? data.height.toString() : null} />
        </Property>
      )}
      {(create || canView.includes('width')) && (
        <Property
          title="width"
          primaryKey="width"
          key={'property-width'}
          value={data.width ? data.width.toString() : null}
          edit={create ? true : canEdit.includes('width') ? edit : false}>
          <DecimalField fullWidth key={'width'} name="width" defaultValue={data.width ? data.width.toString() : null} />
        </Property>
      )}
    </Box>
  )
}

export default Ternero
