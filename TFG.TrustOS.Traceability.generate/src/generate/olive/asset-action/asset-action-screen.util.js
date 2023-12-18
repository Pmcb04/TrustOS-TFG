import { TYPES } from '../../shared/util/nodes-types'

import Weighing from './actions/Weighing'
import Griding from './actions/Griding'
import Mixing from './actions/Mixing'
import HorizontalCentrifugin from './actions/HorizontalCentrifugin'
import VerticalCentrifuging from './actions/VerticalCentrifuging'
import Decanting from './actions/Decanting'
import Sampling from './actions/Sampling'
import Packaging from './actions/Packaging'
import Labelling from './actions/Labelling'
import Collect from './actions/Collect'

export function getAction(action) {
    let stepInput = [] 
    let stepAction = [] 
    let stepOutput = [] 
    switch (action) {
		case TYPES.WEIGING:
	        stepInput = Weighing.input
	        stepAction = Weighing.action
	        stepOutput = Weighing.output
	        break
		case TYPES.MACHINE:
	        stepInput = Griding.input
	        stepAction = Griding.action
	        stepOutput = Griding.output
	        break
		case TYPES.MACHINE:
	        stepInput = Mixing.input
	        stepAction = Mixing.action
	        stepOutput = Mixing.output
	        break
		case TYPES.MACHINE:
	        stepInput = HorizontalCentrifugin.input
	        stepAction = HorizontalCentrifugin.action
	        stepOutput = HorizontalCentrifugin.output
	        break
		case TYPES.MACHINE:
	        stepInput = VerticalCentrifuging.input
	        stepAction = VerticalCentrifuging.action
	        stepOutput = VerticalCentrifuging.output
	        break
		case TYPES.MACHINE:
	        stepInput = Decanting.input
	        stepAction = Decanting.action
	        stepOutput = Decanting.output
	        break
		case TYPES.SAMPLING:
	        stepInput = Sampling.input
	        stepAction = Sampling.action
	        stepOutput = Sampling.output
	        break
		case TYPES.PACKAGING:
	        stepInput = Packaging.input
	        stepAction = Packaging.action
	        stepOutput = Packaging.output
	        break
		case TYPES.LABELLING:
	        stepInput = Labelling.input
	        stepAction = Labelling.action
	        stepOutput = Labelling.output
	        break
		case TYPES.COLLECT:
	        stepInput = Collect.input
	        stepAction = Collect.action
	        stepOutput = Collect.output
	        break
		default:
			break
    }
  
    return { stepInput, stepAction, stepOutput }
}
