import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList, Checkbox } from '@telefonica/mistica'
import { permissionsAzucar } from '../permissions/Azucar'

function Azucar(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsAzucar(rol)
	const [color, set_color] = React.useState(data.color)

	useEffect(() => {
		set_color(data.color)
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('color')) && (
				<Property
				  title="Color"
				  key={'property-color'}
				  value={color ? color.toString() : null}
				  edit={create ? true : canEdit.includes('color') ? edit : false}>
				    <Select
				  	fullWidth
				      name={'color'} 
				      key={'property-color'}
				      onChangeValue={(value) => set_color(value)}
				      value={color ? color.toString() : null}
				      options={[ 
				  			{ value: 'blanca', text: 'blanca' },
				  			{ value: 'morena', text: 'morena' },
				  		]}
				    />
				  
				</Property>
			)}
		</Box>
	)
}

export default Azucar
