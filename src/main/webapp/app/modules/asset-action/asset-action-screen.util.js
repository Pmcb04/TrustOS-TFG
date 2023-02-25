import { TYPES } from '../../shared/util/nodes-types'

import romperPantalon from './actions/romperPantalon'
import usar from './actions/usar'

export function getAction(action) {
    let stepInput = []
    let stepAction = []
    let stepOutput = []
    switch (action) {
      case TYPES.ROMPER_PANTALON:
        stepInput = romperPantalon.input
        stepAction = romperPantalon.action
        stepOutput = romperPantalon.output
        break
      case TYPES.USAR:
        stepInput = usar.input
        stepAction = usar.action
        stepOutput = usar.output
        break
    }
  
    return { stepInput, stepAction, stepOutput }
}