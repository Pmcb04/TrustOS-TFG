
import { TYPES } from '../../../shared/util/nodes-types'
import { NAMES } from '../../../shared/util/nodes-names'

export default {
    input : [ 
		{
			title: NAMES.PLASTICO,
			type: TYPES.PLASTICO,
			create: false,
		},
    ],

    action : [ 
        {
        	title: NAMES.MONTARCARROCERIA,
        	type: TYPES.MONTARCARROCERIA,
        	create: true,
        },
    ],

    output : [ 
		{
			title: NAMES.CARROCERIA,
			type: TYPES.CARROCERIA,
			create: true,
		},
    ]
}
