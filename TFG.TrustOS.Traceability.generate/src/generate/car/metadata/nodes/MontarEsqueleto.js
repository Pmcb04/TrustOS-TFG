import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList, Checkbox } from '@telefonica/mistica'
import { permissionsMontarEsqueleto } from '../permissions/MontarEsqueleto'

function MontarEsqueleto(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsMontarEsqueleto(rol)
	

	useEffect(() => {
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('fechaMontaje')) && (
				<Property
				  title="Fecha de montaje"
				  key={'property-fechaMontaje'}
				  value={data.fechaMontaje ? data.fechaMontaje.toString() : null}
				  edit={create ? true : canEdit.includes('fechaMontaje') ? edit : false}>
				  <DateTimeField
				   fullWidth name="fechaMontaje" key={'property-fechaMontaje'} defaultValue={data.fechaMontaje ? data.fechaMontaje.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default MontarEsqueleto
