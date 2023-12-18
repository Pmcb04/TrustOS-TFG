import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList, Checkbox } from '@telefonica/mistica'
import { permissionsOil_bottle } from '../permissions/Oil_bottle'

function Oil_bottle(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsOil_bottle(rol)
	const [type_oil, set_type_oil] = React.useState(data.type_oil)

	useEffect(() => {
		set_type_oil(data.type_oil)
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('type_oil')) && (
				<Property
				  title="Type of oil"
				  key={'property-type_oil'}
				  value={type_oil ? type_oil.toString() : null}
				  edit={create ? true : canEdit.includes('type_oil') ? edit : false}>
				    <Select
				  	fullWidth
				      name={'type_oil'} 
				      key={'property-type_oil'}
				      onChangeValue={(value) => set_type_oil(value)}
				      value={type_oil ? type_oil.toString() : null}
				      options={[ 
				  			{ value: 'EVOO', text: 'EVOO' },
				  			{ value: 'VOO', text: 'VOO' },
				  		]}
				    />
				  
				</Property>
			)}
		</Box>
	)
}

export default Oil_bottle
