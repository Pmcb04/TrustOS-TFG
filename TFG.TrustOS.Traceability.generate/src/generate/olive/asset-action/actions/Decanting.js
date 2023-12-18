
import { TYPES } from '../../../shared/util/nodes-types'
import { NAMES } from '../../../shared/util/nodes-names'

export default {
    input : [ 
		{
			title: NAMES.DIRTY_OIL_PHASE_2,
			type: TYPES.DIRTY_OIL,
			create: false,
		},
    ],

    action : [ 
        {
        	title: NAMES.DECANTING,
        	type: TYPES.MACHINE,
        	create: true,
        },
    ],

    output : [ 
		{
			title: NAMES.CLEAN_OIL,
			type: TYPES.CLEAN_OIL,
			create: true,
		},
    ]
}
