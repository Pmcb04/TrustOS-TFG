import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DoubleField, Switch, Box, RowList } from '@telefonica/mistica'
import { permissionsCocinar } from '../permissions/Cocinar'

function Cocinar(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsCocinar(rol)
	

	useEffect(() => {
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('fechaCocinado')) && (
				<Property
				  title="FechaCocinado"
				  key={'property-fechaCocinado'}
				  value={data.fechaCocinado ? data.fechaCocinado.toString() : null}
				  edit={create ? true : canEdit.includes('fechaCocinado') ? edit : false}>
				  <DateTimeField
				   fullWidth name="fechaCocinado" key={'property-fechaCocinado'} defaultValue={data.fechaCocinado ? data.fechaCocinado.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default Cocinar
