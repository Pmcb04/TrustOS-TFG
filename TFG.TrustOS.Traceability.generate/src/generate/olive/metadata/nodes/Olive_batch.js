import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList, Checkbox } from '@telefonica/mistica'
import { permissionsOlive_batch } from '../permissions/Olive_batch'

function Olive_batch(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsOlive_batch(rol)
	
	
	

	useEffect(() => {
		
		
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('num_batch')) && (
				<Property
				  title="Number of batch"
				  key={'property-num_batch'}
				  value={data.num_batch ? data.num_batch.toString() : null}
				  edit={create ? true : canEdit.includes('num_batch') ? edit : false}>
				  <TextField
				   fullWidth name="num_batch" key={'property-num_batch'} defaultValue={data.num_batch ? data.num_batch.toString() : null} />
				</Property>
			)}
			{(create || canView.includes('owner')) && (
				<Property
				  title="Owner"
				  key={'property-owner'}
				  value={data.owner ? data.owner.toString() : null}
				  edit={create ? true : canEdit.includes('owner') ? edit : false}>
				  <TextField
				   fullWidth name="owner" key={'property-owner'} defaultValue={data.owner ? data.owner.toString() : null} />
				</Property>
			)}
			{(create || canView.includes('variety_oil')) && (
				<Property
				  title="Variery of olive"
				  key={'property-variety_oil'}
				  value={data.variety_oil ? data.variety_oil.toString() : null}
				  edit={create ? true : canEdit.includes('variety_oil') ? edit : false}>
				  <TextField
				   fullWidth name="variety_oil" key={'property-variety_oil'} defaultValue={data.variety_oil ? data.variety_oil.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default Olive_batch
