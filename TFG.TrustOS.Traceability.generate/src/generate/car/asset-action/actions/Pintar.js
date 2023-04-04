
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
        	title: NAMES.PINTAR,
        	type: TYPES.PINTAR,
        	create: true,
        },
    ],

    output : [ 
		{
			title: NAMES.COCHEFASE3,
			type: TYPES.COCHEFASE3,
			create: true,
		},
    ]
}
