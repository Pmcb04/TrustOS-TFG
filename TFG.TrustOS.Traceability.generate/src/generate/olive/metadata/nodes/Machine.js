import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList, Checkbox } from '@telefonica/mistica'
import { permissionsMachine } from '../permissions/Machine'

function Machine(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsMachine(rol)
	

	useEffect(() => {
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('date_exec')) && (
				<Property
				  title="Date executed"
				  key={'property-date_exec'}
				  value={data.date_exec ? data.date_exec.toString() : null}
				  edit={create ? true : canEdit.includes('date_exec') ? edit : false}>
				  <DateTimeField
				   fullWidth name="date_exec" key={'property-date_exec'} defaultValue={data.date_exec ? data.date_exec.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default Machine
