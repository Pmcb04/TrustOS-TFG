import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList, Checkbox } from '@telefonica/mistica'
import { permissionsMaquina } from '../permissions/Maquina'

function Maquina(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsMaquina(rol)
	

	useEffect(() => {
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('serialNumber')) && (
				<Property
				  title="SerialNumber"
				  key={'property-serialNumber'}
				  value={data.serialNumber ? data.serialNumber.toString() : null}
				  edit={create ? true : canEdit.includes('serialNumber') ? edit : false}>
				  <TextField
				   fullWidth name="serialNumber" key={'property-serialNumber'} defaultValue={data.serialNumber ? data.serialNumber.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default Maquina
