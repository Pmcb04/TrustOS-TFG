import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList } from '@telefonica/mistica'
import { permissionsProveedor } from '../permissions/Proveedor'

function Proveedor(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsProveedor(rol)
	

	useEffect(() => {
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('contacto')) && (
				<Property
				  title="Contacto"
				  key={'property-contacto'}
				  value={data.contacto ? data.contacto.toString() : null}
				  edit={create ? true : canEdit.includes('contacto') ? edit : false}>
				  <TextField
				   fullWidth name="contacto" key={'property-contacto'} defaultValue={data.contacto ? data.contacto.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default Proveedor
