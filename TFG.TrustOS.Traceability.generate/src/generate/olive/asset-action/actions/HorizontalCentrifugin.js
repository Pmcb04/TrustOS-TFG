
import { TYPES } from '../../../shared/util/nodes-types'
import { NAMES } from '../../../shared/util/nodes-names'

export default {
    input : [ 
		{
			title: NAMES.OLIVE_PASTE_PHASE_2,
			type: TYPES.OLIVE_PASTE,
			create: false,
		},
    ],

    action : [ 
        {
        	title: NAMES.HORIZONTAL_CENTRIFUGIN,
        	type: TYPES.MACHINE,
        	create: true,
        },
    ],

    output : [ 
		{
			title: NAMES.DIRTY_OIL_PHASE_1,
			type: TYPES.DIRTY_OIL,
			create: true,
		},
    ]
}
