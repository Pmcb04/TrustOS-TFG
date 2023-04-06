import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList, Checkbox } from '@telefonica/mistica'
import { permissionsVolante } from '../permissions/Volante'

function Volante(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsVolante(rol)
	

	useEffect(() => {
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('diametro')) && (
				<Property
				  title="Diametro"
				  key={'property-diametro'}
				  value={data.diametro ? data.diametro.toString() : null}
				  edit={create ? true : canEdit.includes('diametro') ? edit : false}>
				  <DecimalField
				   fullWidth name="diametro" key={'property-diametro'} defaultValue={data.diametro ? data.diametro.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default Volante
