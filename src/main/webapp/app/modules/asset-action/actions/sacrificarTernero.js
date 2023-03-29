
import { TYPES } from '../../../shared/util/nodes-types'
import { NAMES } from '../../../shared/util/nodes-names'

export default {
    input : [
        {
            title: NAMES.TERNERO,
            type: TYPES.TERNERO,
            create: false,
        },
    ],

    action : [
        {
            title: NAMES.SACRIFICARTERNERO,
            type: TYPES.SACRIFICARTERNERO,
            create: true,
        }
    ],

    output : [
        {
            title: NAMES.CARNE,
            type: TYPES.CARNE,
            create: true,
        },
    ]
}