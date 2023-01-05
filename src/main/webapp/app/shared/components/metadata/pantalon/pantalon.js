import React from 'react'
import Property from '../../property/property'
import { Select, TextField, Title1, IntegerField, DecimalField, DoubleField, Switch, Box } from '@telefonica/mistica'

// TODO fichero autogenado

function Pantalon(props) {
  const { data } = props
  const { create, edit, canEdit, canView } = props

  return (
    <Box>
      {(create || canView.includes('height')) && (
        <Property
          primaryKey="heigth"
          title="heigth"
          key={'property-height'}
          value={!create && data.height ? data.height.toString() : null}
          edit={create ? true : canEdit.includes('heigth') ? edit : false}>
          <TextField key={'color'} name="color" label="color" defaultValue={!create && data.height ? data.height.toString() : null} />
        </Property>
      )}
      {(create || canView.includes('width')) && (
        <Property
          title="width"
          primaryKey="width"
          key={'property-width'}
          value={!create && data.width ? data.width.toString() : null}
          edit={create ? true : canEdit.includes('width') ? edit : false}>
          <TextField key={'size'} name="size" label="size" defaultValue={!create && data.width ? data.width.toString() : null} />
        </Property>
      )}
    </Box>
  )
}

export default Pantalon
