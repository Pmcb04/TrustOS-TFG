import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList, Checkbox } from '@telefonica/mistica'
import { permissionsOil_mill } from '../permissions/Oil_mill'

function Oil_mill(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsOil_mill(rol)
	
	

	useEffect(() => {
		
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('ubication')) && (
				<Property
				  title="Ubication"
				  key={'property-ubication'}
				  value={data.ubication ? data.ubication.toString() : null}
				  edit={create ? true : canEdit.includes('ubication') ? edit : false}>
				  <TextField
				   fullWidth name="ubication" key={'property-ubication'} defaultValue={data.ubication ? data.ubication.toString() : null} />
				</Property>
			)}
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

export default Oil_mill
