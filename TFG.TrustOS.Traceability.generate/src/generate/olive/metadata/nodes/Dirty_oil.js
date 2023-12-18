import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList, Checkbox } from '@telefonica/mistica'
import { permissionsDirty_oil } from '../permissions/Dirty_oil'

function Dirty_oil(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsDirty_oil(rol)
	

	useEffect(() => {
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('contamination')) && (
				<Property
				  title="Contamination"
				  key={'property-contamination'}
				  value={data.contamination ? data.contamination.toString() : null}
				  edit={create ? true : canEdit.includes('contamination') ? edit : false}>
				  <IntegerField
				   fullWidth name="contamination" key={'property-contamination'} defaultValue={data.contamination ? data.contamination.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default Dirty_oil
