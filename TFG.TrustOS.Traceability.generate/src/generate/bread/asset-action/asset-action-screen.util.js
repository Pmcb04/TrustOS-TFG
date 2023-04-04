import { TYPES } from '../../shared/util/nodes-types'

import RealizarMasa from './actions/RealizarMasa'
import SepararMasa from './actions/SepararMasa'
import Cocinar from './actions/Cocinar'
import Vender from './actions/Vender'

export function getAction(action) {
    let stepInput = [] 
    let stepAction = [] 
    let stepOutput = [] 
    switch (action) {
		case TYPES.REALIZARMASA:
	        stepInput = RealizarMasa.input
	        stepAction = RealizarMasa.action
	        stepOutput = RealizarMasa.output
	        break
		case TYPES.SEPARARMASA:
	        stepInput = SepararMasa.input
	        stepAction = SepararMasa.action
	        stepOutput = SepararMasa.output
	        break
		case TYPES.COCINAR:
	        stepInput = Cocinar.input
	        stepAction = Cocinar.action
	        stepOutput = Cocinar.output
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
