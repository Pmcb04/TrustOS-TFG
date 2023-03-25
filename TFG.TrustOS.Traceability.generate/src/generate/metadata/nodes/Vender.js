import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DoubleField, Switch, Box, RowList } from '@telefonica/mistica'
import { permissionsVender } from '../permissions/Vender'

function Vender(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsVender(rol)
	

	useEffect(() => {
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('fechaVendido')) && (
				<Property
				  title="FechaVendido"
				  key={'property-fechaVendido'}
				  value={data.fechaVendido ? data.fechaVendido.toString() : null}
				  edit={create ? true : canEdit.includes('fechaVendido') ? edit : false}>
				  <TextField
				   fullWidth name="fechaVendido" key={'property-fechaVendido'} defaultValue={data.fechaVendido ? data.fechaVendido.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default Vender
