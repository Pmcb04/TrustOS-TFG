
import { TYPES } from '../../../shared/util/nodes-types'
import { NAMES } from '../../../shared/util/nodes-names'

export default {
    input : [ 
		{
			title: NAMES.MASA,
			type: TYPES.MASA,
			create: false,
		},
    ],

    action : [ 
        {
        	title: NAMES.COCINAR,
        	type: TYPES.COCINAR,
        	create: true,
        },
    ],

    output : [ 
		{
			title: NAMES.PAN,
			type: TYPES.PAN,
			create: true,
		},
    ]
}
