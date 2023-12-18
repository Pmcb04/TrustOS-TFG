import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList, Checkbox } from '@telefonica/mistica'
import { permissionsWeiging } from '../permissions/Weiging'

function Weiging(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsWeiging(rol)
	

	useEffect(() => {
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('num_kg')) && (
				<Property
				  title="Number of kilos"
				  key={'property-num_kg'}
				  value={data.num_kg ? data.num_kg.toString() : null}
				  edit={create ? true : canEdit.includes('num_kg') ? edit : false}>
				  <DecimalField
				   fullWidth name="num_kg" key={'property-num_kg'} defaultValue={data.num_kg ? data.num_kg.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default Weiging
