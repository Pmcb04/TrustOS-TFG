
import { TYPES } from '../../../shared/util/nodes-types'
import { NAMES } from '../../../shared/util/nodes-names'

export default {
    input : [ 
		{
			title: NAMES.PAN,
			type: TYPES.PAN,
			create: false,
		},
    ],

    action : [ 
        {
        	title: NAMES.VENDER,
        	type: TYPES.VENDER,
        	create: true,
        },
    ],

    output : [ 
		{
			title: NAMES.DINERO,
			type: TYPES.DINERO,
			create: true,
		},
    ]
}
