import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList, Checkbox } from '@telefonica/mistica'
import { permissionsPan } from '../permissions/Pan'

function Pan(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsPan(rol)
	

	useEffect(() => {
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('nombre')) && (
				<Property
				  title="Nombre"
				  key={'property-nombre'}
				  value={data.nombre ? data.nombre.toString() : null}
				  edit={create ? true : canEdit.includes('nombre') ? edit : false}>
				  <TextField
				   fullWidth name="nombre" key={'property-nombre'} defaultValue={data.nombre ? data.nombre.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default Pan
