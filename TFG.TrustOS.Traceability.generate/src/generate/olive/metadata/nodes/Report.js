import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList, Checkbox } from '@telefonica/mistica'
import { permissionsReport } from '../permissions/Report'

function Report(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsReport(rol)
	

	useEffect(() => {
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('acidity')) && (
				<Property
				  title="Acidity"
				  key={'property-acidity'}
				  value={data.acidity ? data.acidity.toString() : null}
				  edit={create ? true : canEdit.includes('acidity') ? edit : false}>
				  <DecimalField
				   fullWidth name="acidity" key={'property-acidity'} defaultValue={data.acidity ? data.acidity.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default Report
