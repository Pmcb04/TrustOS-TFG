import React from 'react'
import Property from '../../property/property'
import { Select, TextField, Title1, IntegerField, DecimalField, DoubleField, Switch, Box, RowList } from '@telefonica/mistica'

import { permissionsBotella } from './permissions'

// TODO fichero autogenado

function Botella(props) {
  const { data, rol, create, edit } = props
  const { canView, canEdit } = permissionsBotella(rol)

  return (
    <Box>
      {(create || canView.includes('heigth')) && (
        <Property
          title="heigth"
          primaryKey="heigth"
          key={'property-heigth'}
          value={!create && data.heigth ? data.heigth.toString() : null}
          edit={create ? true : canEdit.includes('heigth') ? edit : false}>
          <DecimalField key={'heigth'} name="heigth" label="heigth" defaultValue={!create && data.heigth ? data.heigth.toString() : null} />
        </Property>
      )}

      {(create || canView.includes('capacity')) && (
        <Property
          title="capacity"
          primaryKey="capacity"
          key={'property-capacity'}
          value={!create && data.capacity ? data.capacity.toString() : null}
          edit={create ? true : canEdit.includes('capacity') ? edit : false}>
          <DecimalField
            key={'capacity'}
            name="capacity"
            label="capacity"
            defaultValue={!create && data.capacity ? data.capacity.toString() : null}
          />
        </Property>
      )}
    </Box>
  )
}

export default Botella
