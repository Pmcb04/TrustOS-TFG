
import { TYPES } from '../../../shared/util/nodes-types'
import { NAMES } from '../../../shared/util/nodes-names'

export default {
    input : [ 
		{
			title: NAMES.OIL_BOTTLE_PHASE_1,
			type: TYPES.OIL_BOTTLE,
			create: false,
		},
    ],

    action : [ 
        {
        	title: NAMES.LABELLING,
        	type: TYPES.LABELLING,
        	create: true,
        },
    ],

    output : [ 
		{
			title: NAMES.OIL_BOTTLE_PHASE_2,
			type: TYPES.OIL_BOTTLE,
			create: true,
		},
    ]
}
