
import { TYPES } from '../../../shared/util/nodes-types'
import { NAMES } from '../../../shared/util/nodes-names'

export default {
    input : [ 
		{
			title: NAMES.MASAMADRE,
			type: TYPES.MASAMADRE,
			create: false,
		},
    ],

    action : [ 
        {
        	title: NAMES.SEPARARMASA,
        	type: TYPES.SEPARARMASA,
        	create: true,
        },
    ],

    output : [ 
		{
			title: NAMES.MASA,
			type: TYPES.MASA,
			create: true,
		},
    ]
}
