import React from 'react'
import Property from '../../property/property'
import { Select, TextField, Title1, IntegerField, DecimalField, DoubleField, Switch, Box, RowList } from '@telefonica/mistica'

// TODO fichero autogenado

function Botella(props) {
  const { data } = props
  const { create, edit, canEdit, canView } = props
  // TODO probar si data no contiene una propiedad que esta puesta aqui abajo si se muestra o no.
  // si no se muestra en metadata.utils filtraremos la data dependiendo del rol

  return (
    <Box>
      {(create || canView.includes('height')) && (
        <Property
          title="heigth"
          primaryKey="heigth"
          key={'property-height'}
          value={!create && data.height ? data.height.toString() : null}
          edit={create ? true : canEdit.includes('heigth') ? edit : false}>
          <DecimalField key={'heigth'} name="heigth" label="heigth" defaultValue={!create && data.height ? data.height.toString() : null} />
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
