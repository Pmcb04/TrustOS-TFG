import React from 'react'
import Property from '../../property/property'
import { Select, TextField, Title1, IntegerField, DecimalField, DoubleField, Switch, Box } from '@telefonica/mistica'

import { permissionsOrdenador } from './permissions'

// TODO fichero autogenado
function Ordenador(props) {
  const { data, rol, create, edit } = props
  const { canView, canEdit } = permissionsOrdenador(rol)

  return (
    <Box>
      {(create || canView.includes('company')) && (
        <Property
          primaryKey="company"
          title="company"
          key={'property-company'}
          value={!create && data.company ? data.company.toString() : null}
          edit={create ? true : canEdit.includes('company') ? edit : false}>
          <TextField
            key={'company'}
            name="company"
            label="company"
            defaultValue={!create && data.company ? data.company.toString() : null}
          />
        </Property>
      )}
      {(create || canView.includes('ram')) && (
        <Property
          title="ram"
          primaryKey="ram"
          key={'property-ram'}
          value={!create && data.ram ? data.ram.toString() : null}
          edit={create ? true : canEdit.includes('ram') ? edit : false}>
          <IntegerField key={'ram'} name="ram" label="ram" defaultValue={!create && data.ram ? data.ram.toString() : null} />
        </Property>
      )}
      {(create || canView.includes('rom')) && (
        <Property
          title="rom"
          primaryKey="rom"
          key={'property-rom'}
          value={!create && data.rom ? data.rom.toString() : null}
          edit={create ? true : canEdit.includes('rom') ? edit : false}>
          <IntegerField key={'rom'} name="rom" label="rom" defaultValue={!create && data.rom ? data.rom.toString() : null} />
        </Property>
      )}
      {(create || canView.includes('processor')) && (
        <Property
          title="processor"
          primaryKey="processor"
          key={'property-processor'}
          value={!create && data.processor ? data.processor.toString() : null}
          edit={create ? true : canEdit.includes('processor') ? edit : false}>
          <TextField
            key={'processor'}
            name="processor"
            label="processor"
            defaultValue={!create && data.processor ? data.processor.toString() : null}
          />
        </Property>
      )}
    </Box>
  )
}

export default Ordenador
