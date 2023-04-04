
import { TYPES } from '../../../shared/util/nodes-types'
import { NAMES } from '../../../shared/util/nodes-names'

export default {
    input : [ 
		{
			title: NAMES.METAL,
			type: TYPES.METAL,
			create: false,
		},
    ],

    action : [ 
        {
        	title: NAMES.MONTARESQUELETO,
        	type: TYPES.MONTARESQUELETO,
        	create: true,
        },
    ],

    output : [ 
		{
			title: NAMES.ESQUELETO,
			type: TYPES.ESQUELETO,
			create: true,
		},
    ]
}
