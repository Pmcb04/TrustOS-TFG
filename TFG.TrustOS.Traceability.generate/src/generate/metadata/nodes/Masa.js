import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DoubleField, Switch, Box, RowList } from '@telefonica/mistica'
import { permissionsMasa } from '../permissions/Masa'

function Masa(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsMasa(rol)
	

	useEffect(() => {
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('integral')) && (
				<Property
				  title=""
				  key={'property-integral'}
				  value={data.integral ? data.integral.toString() : null}
				  edit={create ? true : canEdit.includes('integral') ? edit : false}>
				  <Checkbox name="integral" key={'property-integral'} checked={data.integral ? data.integral : false}/>
				  
				</Property>
			)}
		</Box>
	)
}

export default Masa
