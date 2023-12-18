
import { TYPES } from '../../../shared/util/nodes-types'
import { NAMES } from '../../../shared/util/nodes-names'

export default {
    input : [ 
		{
			title: NAMES.CLEAN_OIL,
			type: TYPES.CLEAN_OIL,
			create: false,
		},
		{
			title: NAMES.REPORT,
			type: TYPES.REPORT,
			create: false,
		},
    ],

    action : [ 
        {
        	title: NAMES.PACKAGING,
        	type: TYPES.PACKAGING,
        	create: true,
        },
    ],

    output : [ 
		{
			title: NAMES.OIL_BOTTLE_PHASE_1,
			type: TYPES.OIL_BOTTLE,
			create: true,
		},
    ]
}
