import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList, Checkbox } from '@telefonica/mistica'
import { permissionsSampling } from '../permissions/Sampling'

function Sampling(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsSampling(rol)
	

	useEffect(() => {
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('date_sampling')) && (
				<Property
				  title="Date of sampling"
				  key={'property-date_sampling'}
				  value={data.date_sampling ? data.date_sampling.toString() : null}
				  edit={create ? true : canEdit.includes('date_sampling') ? edit : false}>
				  <DateTimeField
				   fullWidth name="date_sampling" key={'property-date_sampling'} defaultValue={data.date_sampling ? data.date_sampling.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default Sampling
