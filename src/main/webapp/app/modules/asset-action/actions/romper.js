
import { TYPES } from '../../../shared/util/nodes-types'
import { NAMES } from '../../../shared/util/nodes-names'

export default {
    input : [
        {
            title: NAMES.PANTALON,
            type: TYPES.PANTALON,
            create: false,
        },
        {
            title: NAMES.PANTALON,
            type: TYPES.PANTALON,
            create: false,
        }
    ],

    action : [
        {
            title: NAMES.ROMPER,
            create: true,
        }
    ],

    output : [
        {
            title: NAMES.TERNERO,
            type: TYPES.TERNERO,
            create: true,
        },
        {
            title: NAMES.TERNERO,
            type: TYPES.TERNERO,
            create: true,
        },
        {
            title: NAMES.TERNERO,
            type: TYPES.TERNERO,
            create: true,
        },
    ]
}