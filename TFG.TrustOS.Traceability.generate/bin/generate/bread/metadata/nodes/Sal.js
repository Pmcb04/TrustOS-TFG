import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList, Checkbox } from '@telefonica/mistica'
import { permissionsSal } from '../permissions/Sal'

function Sal(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsSal(rol)
	const [Tipo, set_Tipo] = React.useState(data.Tipo)

	useEffect(() => {
		set_Tipo(data.Tipo)
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('Tipo')) && (
				<Property
				  title="Tipo"
				  key={'property-Tipo'}
				  value={Tipo ? Tipo.toString() : null}
				  edit={create ? true : canEdit.includes('Tipo') ? edit : false}>
				    <Select
				  	fullWidth
				      name={'Tipo'} 
				      key={'property-Tipo'}
				      onChangeValue={(value) => set_Tipo(value)}
				      value={Tipo ? Tipo.toString() : null}
				      options={[ 
				  			{ value: 'Marinada', text: 'Marinada' },
				  			{ value: 'Yodada', text: 'Yodada' },
				  			{ value: 'Himalaya', text: 'Himalaya' },
				  		]}
				    />
				  
				</Property>
			)}
		</Box>
	)
}

export default Sal
