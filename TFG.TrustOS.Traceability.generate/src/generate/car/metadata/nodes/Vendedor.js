import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList } from '@telefonica/mistica'
import { permissionsVendedor } from '../permissions/Vendedor'

function Vendedor(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsVendedor(rol)
	

	useEffect(() => {
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('concesionario')) && (
				<Property
				  title="Concesionario"
				  key={'property-concesionario'}
				  value={data.concesionario ? data.concesionario.toString() : null}
				  edit={create ? true : canEdit.includes('concesionario') ? edit : false}>
				  <TextField
				   fullWidth name="concesionario" key={'property-concesionario'} defaultValue={data.concesionario ? data.concesionario.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default Vendedor
