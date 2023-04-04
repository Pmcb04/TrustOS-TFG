
import { TYPES } from '../../../shared/util/nodes-types'
import { NAMES } from '../../../shared/util/nodes-names'

export default {
    input : [ 
		{
			title: NAMES.COCHEFASE3,
			type: TYPES.COCHEFASE3,
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
			title: NAMES.COCHE,
			type: TYPES.COCHE,
			create: true,
		},
    ]
}
