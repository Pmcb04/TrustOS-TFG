import React from 'react'
import { View } from 'react-native'
import Property from '../../property/property'
import { Select, TextField, Title1, IntegerField, DecimalField, DoubleField, Switch, Box } from '@telefonica/mistica'

import { permissionsRomper } from './permissions'

// TODO fichero autogenado

function Romper(props) {
  const { data, rol, create, edit } = props
  const { canView, canEdit } = permissionsRomper(rol)

  return (
    <Box>
      {(create || canView.includes('damage')) && (
        <Property
          title="damage"
          primaryKey="damage"
          key={'property-damage'}
          value={data.damage ? data.damage.toString() : null}
          edit={create ? true : canEdit.includes('damage') ? edit : false}>
          <DecimalField fullWidth key={'damage'} name="damage" defaultValue={data.damage ? data.damage.toString() : null} />
        </Property>
      )}
    </Box>
  )
}

export default Romper
