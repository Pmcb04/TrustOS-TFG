import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList, Checkbox } from '@telefonica/mistica'
import { permissionsLevadura } from '../permissions/Levadura'

function Levadura(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsLevadura(rol)
	

	useEffect(() => {
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('marca')) && (
				<Property
				  title="Marca"
				  key={'property-marca'}
				  value={data.marca ? data.marca.toString() : null}
				  edit={create ? true : canEdit.includes('marca') ? edit : false}>
				  <TextField
				   fullWidth name="marca" key={'property-marca'} defaultValue={data.marca ? data.marca.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default Levadura
