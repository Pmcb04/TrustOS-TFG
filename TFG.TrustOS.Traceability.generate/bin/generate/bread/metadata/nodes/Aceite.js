import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList, Checkbox } from '@telefonica/mistica'
import { permissionsAceite } from '../permissions/Aceite'

function Aceite(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsAceite(rol)
	const [denominacion, set_denominacion] = React.useState(data.denominacion)
	const [tipo, set_tipo] = React.useState(data.tipo)

	useEffect(() => {
		set_denominacion(data.denominacion)
		set_tipo(data.tipo)
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('denominacion')) && (
				<Property
				  title="Denominacion"
				  key={'property-denominacion'}
				  value={denominacion ? denominacion.toString() : null}
				  edit={create ? true : canEdit.includes('denominacion') ? edit : false}>
				    <Select
				  	fullWidth
				      name={'denominacion'} 
				      key={'property-denominacion'}
				      onChangeValue={(value) => set_denominacion(value)}
				      value={denominacion ? denominacion.toString() : null}
				      options={[ 
				  			{ value: 'virgen', text: 'virgen' },
				  			{ value: 'virgen extra', text: 'virgen extra' },
				  		]}
				    />
				  
				</Property>
			)}
			{(create || canView.includes('tipo')) && (
				<Property
				  title="Tipo"
				  key={'property-tipo'}
				  value={tipo ? tipo.toString() : null}
				  edit={create ? true : canEdit.includes('tipo') ? edit : false}>
				    <Select
				  	fullWidth
				      name={'tipo'} 
				      key={'property-tipo'}
				      onChangeValue={(value) => set_tipo(value)}
				      value={tipo ? tipo.toString() : null}
				      options={[ 
				  			{ value: 'oliva', text: 'oliva' },
				  			{ value: 'girasol', text: 'girasol' },
				  		]}
				    />
				  
				</Property>
			)}
		</Box>
	)
}

export default Aceite
