import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList, Checkbox } from '@telefonica/mistica'
import { permissionsPackaging } from '../permissions/Packaging'

function Packaging(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsPackaging(rol)
	

	useEffect(() => {
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('date_packaging')) && (
				<Property
				  title="Date of packaging"
				  key={'property-date_packaging'}
				  value={data.date_packaging ? data.date_packaging.toString() : null}
				  edit={create ? true : canEdit.includes('date_packaging') ? edit : false}>
				  <TextField
				   fullWidth name="date_packaging" key={'property-date_packaging'} defaultValue={data.date_packaging ? data.date_packaging.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default Packaging
