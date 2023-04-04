import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList } from '@telefonica/mistica'
import { permissionsPanadero } from '../permissions/Panadero'

function Panadero(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsPanadero(rol)
	

	useEffect(() => {
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('direccion')) && (
				<Property
				  title="Direccion"
				  key={'property-direccion'}
				  value={data.direccion ? data.direccion.toString() : null}
				  edit={create ? true : canEdit.includes('direccion') ? edit : false}>
				  <TextField
				   fullWidth name="direccion" key={'property-direccion'} defaultValue={data.direccion ? data.direccion.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default Panadero
