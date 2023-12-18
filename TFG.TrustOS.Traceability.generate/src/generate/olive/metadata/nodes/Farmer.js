import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList, Checkbox } from '@telefonica/mistica'
import { permissionsFarmer } from '../permissions/Farmer'

function Farmer(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsFarmer(rol)
	

	useEffect(() => {
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('name')) && (
				<Property
				  title="Name"
				  key={'property-name'}
				  value={data.name ? data.name.toString() : null}
				  edit={create ? true : canEdit.includes('name') ? edit : false}>
				  <TextField
				   fullWidth name="name" key={'property-name'} defaultValue={data.name ? data.name.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default Farmer
