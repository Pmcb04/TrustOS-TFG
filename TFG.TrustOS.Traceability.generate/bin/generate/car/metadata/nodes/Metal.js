import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList } from '@telefonica/mistica'
import { permissionsMetal } from '../permissions/Metal'

function Metal(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsMetal(rol)
	

	useEffect(() => {
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('fechaCompra')) && (
				<Property
				  title="FechaCompra"
				  key={'property-fechaCompra'}
				  value={data.fechaCompra ? data.fechaCompra.toString() : null}
				  edit={create ? true : canEdit.includes('fechaCompra') ? edit : false}>
				  <TextField
				   fullWidth name="fechaCompra" key={'property-fechaCompra'} defaultValue={data.fechaCompra ? data.fechaCompra.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default Metal
