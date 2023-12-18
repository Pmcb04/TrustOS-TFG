import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList, Checkbox } from '@telefonica/mistica'
import { permissionsOlive } from '../permissions/Olive'

function Olive(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsOlive(rol)
	

	useEffect(() => {
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('pick_up_date')) && (
				<Property
				  title="Pick_up_date"
				  key={'property-pick_up_date'}
				  value={data.pick_up_date ? data.pick_up_date.toString() : null}
				  edit={create ? true : canEdit.includes('pick_up_date') ? edit : false}>
				  <DateTimeField
				   fullWidth name="pick_up_date" key={'property-pick_up_date'} defaultValue={data.pick_up_date ? data.pick_up_date.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default Olive
