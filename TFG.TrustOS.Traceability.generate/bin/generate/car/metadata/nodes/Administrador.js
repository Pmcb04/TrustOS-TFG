import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList } from '@telefonica/mistica'
import { permissionsAdministrador } from '../permissions/Administrador'

function Administrador(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsAdministrador(rol)
	

	useEffect(() => {
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('company')) && (
				<Property
				  title="Company"
				  key={'property-company'}
				  value={data.company ? data.company.toString() : null}
				  edit={create ? true : canEdit.includes('company') ? edit : false}>
				  <TextField
				   fullWidth name="company" key={'property-company'} defaultValue={data.company ? data.company.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default Administrador
