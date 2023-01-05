import React from 'react'
import Property from '../../property/property'
import { Select, TextField, Title1, IntegerField, DecimalField, DoubleField, Switch, Box } from '@telefonica/mistica'

// TODO fichero autogenado

function Ternero(props) {
  const { data } = props
  const { create, edit, canEdit, canView } = props

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
