import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList } from '@telefonica/mistica'
import { permissionsPintor } from '../permissions/Pintor'

function Pintor(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsPintor(rol)
	

	useEffect(() => {
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('estudio')) && (
				<Property
				  title="Estudio"
				  key={'property-estudio'}
				  value={data.estudio ? data.estudio.toString() : null}
				  edit={create ? true : canEdit.includes('estudio') ? edit : false}>
				  <TextField
				   fullWidth name="estudio" key={'property-estudio'} defaultValue={data.estudio ? data.estudio.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default Pintor
