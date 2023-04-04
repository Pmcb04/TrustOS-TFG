import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList } from '@telefonica/mistica'
import { permissionsMasaMadre } from '../permissions/MasaMadre'

function MasaMadre(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsMasaMadre(rol)
	

	useEffect(() => {
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('tiempoReposo')) && (
				<Property
				  title="TiempoReposo"
				  key={'property-tiempoReposo'}
				  value={data.tiempoReposo ? data.tiempoReposo.toString() : null}
				  edit={create ? true : canEdit.includes('tiempoReposo') ? edit : false}>
				  <DecimalField
				   fullWidth name="tiempoReposo" key={'property-tiempoReposo'} defaultValue={data.tiempoReposo ? data.tiempoReposo.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default MasaMadre
