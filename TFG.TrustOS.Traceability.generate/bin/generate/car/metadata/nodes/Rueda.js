import React, {useEffect} from 'react'
import Property from '../../property/property'
import PropertyBox from '../../property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DateTimeField, EmailField, DoubleField, Switch, Box, RowList } from '@telefonica/mistica'
import { permissionsRueda } from '../permissions/Rueda'

function Rueda(props) {

	const { data, rol, create, edit } = props
	const { canView, canEdit } = permissionsRueda(rol)
	
	
	const [vMax, set_vMax] = React.useState(data.vMax)
	
	

	useEffect(() => {
		
		
		set_vMax(data.vMax)
		
		
	}, [ data ] )  

	return (
	    <Box>
			{(create || canView.includes('altura')) && (
				<Property
				  title="Altura"
				  key={'property-altura'}
				  value={data.altura ? data.altura.toString() : null}
				  edit={create ? true : canEdit.includes('altura') ? edit : false}>
				  <IntegerField
				   fullWidth name="altura" key={'property-altura'} defaultValue={data.altura ? data.altura.toString() : null} />
				</Property>
			)}
			{(create || canView.includes('indCarg')) && (
				<Property
				  title="Indice de carga"
				  key={'property-indCarg'}
				  value={data.indCarg ? data.indCarg.toString() : null}
				  edit={create ? true : canEdit.includes('indCarg') ? edit : false}>
				  <IntegerField
				   fullWidth name="indCarg" key={'property-indCarg'} defaultValue={data.indCarg ? data.indCarg.toString() : null} />
				</Property>
			)}
			{(create || canView.includes('vMax')) && (
				<Property
				  title="Velocidad máxima"
				  key={'property-vMax'}
				  value={vMax ? vMax.toString() : null}
				  edit={create ? true : canEdit.includes('vMax') ? edit : false}>
				    <Select
				  	fullWidth
				      name={'vMax'} 
				      key={'property-vMax'}
				      onChangeValue={(value) => set_vMax(value)}
				      value={vMax ? vMax.toString() : null}
				      options={[ 
				  			{ value: 'V', text: 'V' },
				  			{ value: 'H', text: 'H' },
				  			{ value: 'R', text: 'R' },
				  		]}
				    />
				  
				</Property>
			)}
			{(create || canView.includes('diametro')) && (
				<Property
				  title="Diametro"
				  key={'property-diametro'}
				  value={data.diametro ? data.diametro.toString() : null}
				  edit={create ? true : canEdit.includes('diametro') ? edit : false}>
				  <DecimalField
				   fullWidth name="diametro" key={'property-diametro'} defaultValue={data.diametro ? data.diametro.toString() : null} />
				</Property>
			)}
			{(create || canView.includes('anchura')) && (
				<Property
				  title="Anchura"
				  key={'property-anchura'}
				  value={data.anchura ? data.anchura.toString() : null}
				  edit={create ? true : canEdit.includes('anchura') ? edit : false}>
				  <DecimalField
				   fullWidth name="anchura" key={'property-anchura'} defaultValue={data.anchura ? data.anchura.toString() : null} />
				</Property>
			)}
		</Box>
	)
}

export default Rueda
