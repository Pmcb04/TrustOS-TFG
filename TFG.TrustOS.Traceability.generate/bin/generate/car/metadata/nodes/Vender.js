import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList } from '@telefonica/mistica'
import { permissionsVender } from '../permissions/Vender'

function Vender(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsVender(rol)
	

	useEffect(() => {
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('fechaVenta')) && (
				<Property
				  title="FechaVenta"
				  key={'property-fechaVenta'}
				  value={data.fechaVenta ? data.fechaVenta.toString() : null}
				  edit={create ? true : canEdit.includes('fechaVenta') ? edit : false}>
				  <TextField
				   fullWidth name="fechaVenta" key={'property-fechaVenta'} defaultValue={data.fechaVenta ? data.fechaVenta.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default Vender
