import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList } from '@telefonica/mistica'
import { permissionsMotor } from '../permissions/Motor'

function Motor(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsMotor(rol)
	

	useEffect(() => {
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('potencia')) && (
				<Property
				  title="Potencia"
				  key={'property-potencia'}
				  value={data.potencia ? data.potencia.toString() : null}
				  edit={create ? true : canEdit.includes('potencia') ? edit : false}>
				  <IntegerField
				   fullWidth name="potencia" key={'property-potencia'} defaultValue={data.potencia ? data.potencia.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default Motor
