
import { TYPES } from '../../../shared/util/nodes-types'
import { NAMES } from '../../../shared/util/nodes-names'

export default {
    input : [ 
		{
			title: NAMES.CLEAN_OIL,
			type: TYPES.CLEAN_OIL,
			create: false,
		},
    ],

    action : [ 
        {
        	title: NAMES.SAMPLING,
        	type: TYPES.SAMPLING,
        	create: true,
        },
    ],

    output : [ 
		{
			title: NAMES.REPORT,
			type: TYPES.REPORT,
			create: true,
		},
    ]
}
