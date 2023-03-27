import React from 'react'
import Property from '../../property/property'
import { Select, TextField, Title1, IntegerField, DecimalField, DoubleField, Switch, Box } from '@telefonica/mistica'

import { permissionsCoche } from './permissions'

// TODO fichero autogenado
function Coche(props) {
  const { data, rol, create, edit } = props
  const { canView, canEdit } = permissionsCoche(rol)

  return (
    <Box>
      {(create || canView.includes('height')) && (
        <Property
          title="heigth"
          primaryKey="heigth"
          key={'property-height'}
          value={data.height ? data.height.toString() : null}
          edit={create ? true : canEdit.includes('heigth') ? edit : false}>
          <DecimalField fullWidth key={'heigth'} name="heigth" defaultValue={data.height ? data.height.toString() : null} />
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
      {(create || canView.includes('color')) && (
        <Property
          title="color"
          primaryKey="color"
          key={'property-color'}
          value={data.color ? data.color.toString() : null}
          edit={create ? true : canEdit.includes('color') ? edit : false}>
          <TextField fullWidth key={'color'} name="color" defaultValue={data.color ? data.color.toString() : null} />
        </Property>
      )}
      {(create || canView.includes('horsepower')) && (
        <Property
          title="horsepower"
          primaryKey="horsepower"
          key={'property-horsepower'}
          value={data.horsepower ? data.horsepower.toString() : null}
          edit={create ? true : canEdit.includes('horsepower') ? edit : false}>
          <IntegerField
            fullWidth
            key={'horsepower'}
            name="horsepower"
            defaultValue={data.horsepower ? data.horsepower.toString() : null}
          />
        </Property>
      )}
    </Box>
  )
}

export default Coche
