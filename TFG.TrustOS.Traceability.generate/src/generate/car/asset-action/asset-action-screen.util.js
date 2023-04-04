import { TYPES } from '../../shared/util/nodes-types'

import MontarEsqueleto from './actions/MontarEsqueleto'
import MontarCarroceria from './actions/MontarCarroceria'
import MontarBase from './actions/MontarBase'
import MontarRuedas from './actions/MontarRuedas'
import MontarVolante from './actions/MontarVolante'
import MontarMotor from './actions/MontarMotor'
import Pintar from './actions/Pintar'
import Vender from './actions/Vender'

export function getAction(action) {
    let stepInput = [] 
    let stepAction = [] 
    let stepOutput = [] 
    switch (action) {
		case TYPES.MONTARESQUELETO:
	        stepInput = MontarEsqueleto.input
	        stepAction = MontarEsqueleto.action
	        stepOutput = MontarEsqueleto.output
	        break
		case TYPES.MONTARCARROCERIA:
	        stepInput = MontarCarroceria.input
	        stepAction = MontarCarroceria.action
	        stepOutput = MontarCarroceria.output
	        break
		case TYPES.MONTARBASE:
	        stepInput = MontarBase.input
	        stepAction = MontarBase.action
	        stepOutput = MontarBase.output
	        break
		case TYPES.MONTARRUEDAS:
	        stepInput = MontarRuedas.input
	        stepAction = MontarRuedas.action
	        stepOutput = MontarRuedas.output
	        break
		case TYPES.MONTARVOLANTE:
	        stepInput = MontarVolante.input
	        stepAction = MontarVolante.action
	        stepOutput = MontarVolante.output
	        break
		case TYPES.MONTARMOTOR:
	        stepInput = MontarMotor.input
	        stepAction = MontarMotor.action
	        stepOutput = MontarMotor.output
	        break
		case TYPES.PINTAR:
	        stepInput = Pintar.input
	        stepAction = Pintar.action
	        stepOutput = Pintar.output
	        break
		case TYPES.VENDER:
	        stepInput = Vender.input
	        stepAction = Vender.action
	        stepOutput = Vender.output
	        break
		default:
			break
    }
  
    return { stepInput, stepAction, stepOutput }
}
