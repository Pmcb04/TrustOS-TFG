import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DoubleField, Switch, Box, RowList } from '@telefonica/mistica'
import { permissionsRealizarMasa } from '../permissions/RealizarMasa'

function RealizarMasa(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsRealizarMasa(rol)
	

	useEffect(() => {
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('fechaAmasado')) && (
				<Property
				  title="FechaAmasado"
				  key={'property-fechaAmasado'}
				  value={data.fechaAmasado ? data.fechaAmasado.toString() : null}
				  edit={create ? true : canEdit.includes('fechaAmasado') ? edit : false}>
				  <DateTimeField
				   fullWidth name="fechaAmasado" key={'property-fechaAmasado'} defaultValue={data.fechaAmasado ? data.fechaAmasado.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default RealizarMasa
