import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList, Checkbox } from '@telefonica/mistica'
import { permissionsSepararMasa } from '../permissions/SepararMasa'

function SepararMasa(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsSepararMasa(rol)
	

	useEffect(() => {
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('fechaSeparacion')) && (
				<Property
				  title="FechaSeparacion"
				  key={'property-fechaSeparacion'}
				  value={data.fechaSeparacion ? data.fechaSeparacion.toString() : null}
				  edit={create ? true : canEdit.includes('fechaSeparacion') ? edit : false}>
				  <DateTimeField
				   fullWidth name="fechaSeparacion" key={'property-fechaSeparacion'} defaultValue={data.fechaSeparacion ? data.fechaSeparacion.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default SepararMasa
