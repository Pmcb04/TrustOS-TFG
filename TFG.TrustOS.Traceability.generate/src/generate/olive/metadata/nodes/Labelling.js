import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList, Checkbox } from '@telefonica/mistica'
import { permissionsLabelling } from '../permissions/Labelling'

function Labelling(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsLabelling(rol)
	

	useEffect(() => {
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('expirity_date')) && (
				<Property
				  title="Expirity date"
				  key={'property-expirity_date'}
				  value={data.expirity_date ? data.expirity_date.toString() : null}
				  edit={create ? true : canEdit.includes('expirity_date') ? edit : false}>
				  <DateTimeField
				   fullWidth name="expirity_date" key={'property-expirity_date'} defaultValue={data.expirity_date ? data.expirity_date.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default Labelling
