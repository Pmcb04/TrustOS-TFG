import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList } from '@telefonica/mistica'
import { permissionsMecanico } from '../permissions/Mecanico'

function Mecanico(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsMecanico(rol)
	

	useEffect(() => {
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('taller')) && (
				<Property
				  title="Taller"
				  key={'property-taller'}
				  value={data.taller ? data.taller.toString() : null}
				  edit={create ? true : canEdit.includes('taller') ? edit : false}>
				  <TextField
				   fullWidth name="taller" key={'property-taller'} defaultValue={data.taller ? data.taller.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default Mecanico
