import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList } from '@telefonica/mistica'
import { permissionsBase } from '../permissions/Base'

function Base(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsBase(rol)
	
	
	

	useEffect(() => {
		
		
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('dimensiones')) && (
				<PropertyBox title={'Dimensiones'} key={'dimensiones'}>
				{(create || canView.includes('dimensiones.altura')) && (
					<Property
					  title="Altura"
					  key={'property-dimensiones.altura'}
					  value={data.dimensiones.altura ? data.dimensiones.altura.toString() : null}
					  edit={create ? true : canEdit.includes('dimensiones.altura') ? edit : false}>
					  <TextField
					   fullWidth name="altura" key={'property-dimensiones.altura'} defaultValue={data.dimensiones.altura ? data.dimensiones.altura.toString() : null} />
					</Property>
				)}
				{(create || canView.includes('dimensiones.anchura')) && (
					<Property
					  title="Anchura"
					  key={'property-dimensiones.anchura'}
					  value={data.dimensiones.anchura ? data.dimensiones.anchura.toString() : null}
					  edit={create ? true : canEdit.includes('dimensiones.anchura') ? edit : false}>
					  <TextField
					   fullWidth name="anchura" key={'property-dimensiones.anchura'} defaultValue={data.dimensiones.anchura ? data.dimensiones.anchura.toString() : null} />
					</Property>
				)}
				</PropertyBox>
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
			{(create || canView.includes('identificador')) && (
				<Property
				  title="Identificador"
				  key={'property-identificador'}
				  value={data.identificador ? data.identificador.toString() : null}
				  edit={create ? true : canEdit.includes('identificador') ? edit : false}>
				  <TextField
				   fullWidth name="identificador" key={'property-identificador'} defaultValue={data.identificador ? data.identificador.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default Base
