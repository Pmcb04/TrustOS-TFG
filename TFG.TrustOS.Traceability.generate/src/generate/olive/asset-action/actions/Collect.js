
import { TYPES } from '../../../shared/util/nodes-types'
import { NAMES } from '../../../shared/util/nodes-names'

export default {
    input : [ 
		{
			title: NAMES.OLIVE_BATCH_PHASE_1,
			type: TYPES.OLIVE,
			create: false,
		},
    ],

    action : [ 
        {
        	title: NAMES.COLLECT,
        	type: TYPES.COLLECT,
        	create: true,
        },
    ],

    output : [ 
		{
			title: NAMES.OLIVE_BATCH_PHASE_2,
			type: TYPES.OLIVE_BATCH,
			create: true,
		},
    ]
}
