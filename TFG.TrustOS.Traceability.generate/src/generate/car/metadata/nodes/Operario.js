import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList } from '@telefonica/mistica'
import { permissionsOperario } from '../permissions/Operario'

function Operario(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsOperario(rol)
	const [zona, set_zona] = React.useState(data.zona)

	useEffect(() => {
		set_zona(data.zona)
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('zona')) && (
				<Property
				  title="Zona"
				  key={'property-zona'}
				  value={zona ? zona.toString() : null}
				  edit={create ? true : canEdit.includes('zona') ? edit : false}>
				    <Select
				  	fullWidth
				      name={'zona'} 
				      key={'property-zona'}
				      onChangeValue={(value) => set_zona(value)}
				      value={zona ? zona.toString() : null}
				      options={[ 
				  			{ value: 'A', text: 'A' },
				  			{ value: 'B', text: 'B' },
				  			{ value: 'C', text: 'C' },
				  		]}
				    />
				  
				</Property>
			)}
		</Box>
	)
}

export default Operario
