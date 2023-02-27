import React from 'react'
import { View } from 'react-native'
import Property from '../../property/property'
import { Select, TextField, Title1, IntegerField, DecimalField, DoubleField, Switch, Box } from '@telefonica/mistica'

import { permissionsUsar } from './permissions'

// TODO fichero autogenado

function Usar(props) {
  const { data, rol, create, edit } = props
  const { canView, canEdit } = permissionsUsar(rol)

  return (
    <Box>
      {(create || canView.includes('time')) && (
        <Property
          title="time"
          primaryKey="time"
          key={'property-time'}
          value={data.time ? data.time.toString() : null}
          edit={create ? true : canEdit.includes('time') ? edit : false}>
          <DecimalField fullWidth key={'time'} name="time" defaultValue={data.time ? data.time.toString() : null} />
        </Property>
      )}
    </Box>
  )
}

export default Usar
