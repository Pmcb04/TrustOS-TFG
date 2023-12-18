
import { TYPES } from '../../../shared/util/nodes-types'
import { NAMES } from '../../../shared/util/nodes-names'

export default {
    input : [ 
		{
			title: NAMES.OLIVE_BATCH_PHASE_3,
			type: TYPES.OLIVE_BATCH,
			create: false,
		},
    ],

    action : [ 
        {
        	title: NAMES.GRIDING,
        	type: TYPES.MACHINE,
        	create: true,
        },
    ],

    output : [ 
		{
			title: NAMES.OLIVE_PASTE_PHASE_1,
			type: TYPES.OLIVE_PASTE,
			create: true,
		},
    ]
}
