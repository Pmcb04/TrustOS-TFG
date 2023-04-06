import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList, Checkbox } from '@telefonica/mistica'
import { permissionsMasa } from '../permissions/Masa'

function Masa(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsMasa(rol)
	

	useEffect(() => {
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('gramos')) && (
				<Property
				  title="Gramos"
				  key={'property-gramos'}
				  value={data.gramos ? data.gramos.toString() : null}
				  edit={create ? true : canEdit.includes('gramos') ? edit : false}>
				  <TextField
				   fullWidth name="gramos" key={'property-gramos'} defaultValue={data.gramos ? data.gramos.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default Masa
