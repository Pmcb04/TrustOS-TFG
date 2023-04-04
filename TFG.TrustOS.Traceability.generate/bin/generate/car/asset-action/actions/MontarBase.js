
import { TYPES } from '../../../shared/util/nodes-types'
import { NAMES } from '../../../shared/util/nodes-names'

export default {
    input : [ 
		{
			title: NAMES.ESQUELETO,
			type: TYPES.ESQUELETO,
			create: false,
		},
		{
			title: NAMES.CARROCERIA,
			type: TYPES.CARROCERIA,
			create: false,
		},
    ],

    action : [ 
        {
        	title: NAMES.MONTARBASE,
        	type: TYPES.MONTARBASE,
        	create: true,
        },
    ],

    output : [ 
		{
			title: NAMES.BASE,
			type: TYPES.BASE,
			create: true,
		},
    ]
}
