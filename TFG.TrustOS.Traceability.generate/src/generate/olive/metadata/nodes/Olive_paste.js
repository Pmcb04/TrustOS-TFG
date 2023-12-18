import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList, Checkbox } from '@telefonica/mistica'
import { permissionsOlive_paste } from '../permissions/Olive_paste'

function Olive_paste(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsOlive_paste(rol)
	
	

	useEffect(() => {
		
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('humidity')) && (
				<Property
				  title="Humidity"
				  key={'property-humidity'}
				  value={data.humidity ? data.humidity.toString() : null}
				  edit={create ? true : canEdit.includes('humidity') ? edit : false}>
				  <TextField
				   fullWidth name="humidity" key={'property-humidity'} defaultValue={data.humidity ? data.humidity.toString() : null} />
				</Property>
			)}
			{(create || canView.includes('temperature')) && (
				<Property
				  title="Temperature"
				  key={'property-temperature'}
				  value={data.temperature ? data.temperature.toString() : null}
				  edit={create ? true : canEdit.includes('temperature') ? edit : false}>
				  <TextField
				   fullWidth name="temperature" key={'property-temperature'} defaultValue={data.temperature ? data.temperature.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default Olive_paste
