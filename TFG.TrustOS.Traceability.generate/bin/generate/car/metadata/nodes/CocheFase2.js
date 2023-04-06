import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList, Checkbox } from '@telefonica/mistica'
import { permissionsCocheFase2 } from '../permissions/CocheFase2'

function CocheFase2(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsCocheFase2(rol)
	
	

	useEffect(() => {
		
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('altura')) && (
				<Property
				  title="Altura"
				  key={'property-altura'}
				  value={data.altura ? data.altura.toString() : null}
				  edit={create ? true : canEdit.includes('altura') ? edit : false}>
				  <DecimalField
				   fullWidth name="altura" key={'property-altura'} defaultValue={data.altura ? data.altura.toString() : null} />
				</Property>
			)}
			{(create || canView.includes('peso')) && (
				<Property
				  title="Peso"
				  key={'property-peso'}
				  value={data.peso ? data.peso.toString() : null}
				  edit={create ? true : canEdit.includes('peso') ? edit : false}>
				  <DecimalField
				   fullWidth name="peso" key={'property-peso'} defaultValue={data.peso ? data.peso.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default CocheFase2
