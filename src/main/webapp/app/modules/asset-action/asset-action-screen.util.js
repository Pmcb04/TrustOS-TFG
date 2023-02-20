import { TYPES } from '../../shared/util/nodes-types'

import romper from './actions/romper'

export function getAction(action) {
    let stepInput = []
    let stepAction = []
    let stepOutput = []
    switch (action) {
      case TYPES.ROMPER:
        stepInput = romper.input
        stepAction = romper.action
        stepOutput = romper.output
        break
    }
  
    return { stepInput, stepAction, stepOutput }
}