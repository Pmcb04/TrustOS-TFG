import React, { useState, useEffect } from 'react'
import Property from '../../property/property'
import { Select, TextField, Title1, IntegerField, DecimalField, DoubleField, Switch, Box } from '@telefonica/mistica'

import { permissionsPantalon } from './permissions'

// TODO fichero autogenado

function Pantalon(props) {
  const { data, rol, create, edit } = props
  const { canView, canEdit } = permissionsPantalon(rol)

  const [color, setColor] = useState(data.color)
  const [width, setWidth] = useState(data.width)


  useEffect(() => {
    setColor(data.color)
    setWidth(data.width)
  }, [data])  
  

  return (
    <Box>
      {(create || canView.includes('color')) && (
        <Property
          title="Color"
          key={'property-color'}
          value={color ? color.toString() : null}
          edit={create ? true : canEdit.includes('color') ? edit : false}>
          <Select
            fullWidth
            name={'color'}
            key={'property-color'}
            onChangeValue={(value) => setColor(value)}
            value={color != null ? color.toString() : null}
            options={[
              { value: 'azul', text: 'azul' },
              { value: 'blanco', text: 'blanco' },
              { value: 'negro', text: 'negro' },
            ]}
          />
        </Property>
      )}
      {(create || canView.includes('width')) && (
        <Property
          title="width"
          primaryKey="width"
          key={'property-width'}
          onChangeValue={(value) => setWidth(value)}
          value={width != null ? width.toString() : null}
          edit={create ? true : canEdit.includes('width') ? edit : false}>
          <Select
            fullWidth
            name={'width'}
            key={'property-width'}
            onChangeValue={(value) => setWidth(value)}
            value={width ? width.toString() : null}
            options={[
              { value: 'XXS', text: 'XXS' },
              { value: 'XS', text: 'XS' },
              { value: 'S', text: 'S' },
              { value: 'M', text: 'M' },
              { value: 'L', text: 'L' },
              { value: 'XL', text: 'XL' },
              { value: 'XXL', text: 'XXL' },
            ]}
          />
        </Property>
      )}
    </Box>
  )
}

export default Pantalon
