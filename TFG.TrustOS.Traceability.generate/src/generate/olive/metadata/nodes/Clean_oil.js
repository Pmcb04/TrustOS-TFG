import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList, Checkbox } from '@telefonica/mistica'
import { permissionsClean_oil } from '../permissions/Clean_oil'

function Clean_oil(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsClean_oil(rol)
	

	useEffect(() => {
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('purity')) && (
				<Property
				  title="Purity"
				  key={'property-purity'}
				  value={data.purity ? data.purity.toString() : null}
				  edit={create ? true : canEdit.includes('purity') ? edit : false}>
				  <TextField
				   fullWidth name="purity" key={'property-purity'} defaultValue={data.purity ? data.purity.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default Clean_oil
