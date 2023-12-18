import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList, Checkbox } from '@telefonica/mistica'
import { permissionsCollect } from '../permissions/Collect'

function Collect(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsCollect(rol)
	

	useEffect(() => {
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('season')) && (
				<Property
				  title="Season"
				  key={'property-season'}
				  value={data.season ? data.season.toString() : null}
				  edit={create ? true : canEdit.includes('season') ? edit : false}>
				  <TextField
				   fullWidth name="season" key={'property-season'} defaultValue={data.season ? data.season.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default Collect
