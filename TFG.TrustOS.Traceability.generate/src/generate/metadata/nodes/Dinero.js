import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DoubleField, Switch, Box, RowList } from '@telefonica/mistica'
import { permissionsDinero } from '../permissions/Dinero'

function Dinero(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsDinero(rol)
	

	useEffect(() => {
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('cantidad')) && (
				<Property
				  title=""
				  key={'property-cantidad'}
				  value={data.cantidad ? data.cantidad.toString() : null}
				  edit={create ? true : canEdit.includes('cantidad') ? edit : false}>
				  <DecimalField
				   fullWidth name="cantidad" key={'property-cantidad'} defaultValue={data.cantidad ? data.cantidad.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default Dinero
