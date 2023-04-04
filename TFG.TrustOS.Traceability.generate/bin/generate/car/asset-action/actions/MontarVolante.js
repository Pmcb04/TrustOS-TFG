
import { TYPES } from '../../../shared/util/nodes-types'
import { NAMES } from '../../../shared/util/nodes-names'

export default {
    input : [ 
		{
			title: NAMES.VOLANTE,
			type: TYPES.VOLANTE,
			create: false,
		},
		{
			title: NAMES.COCHEFASE1,
			type: TYPES.COCHEFASE1,
			create: false,
		},
    ],

    action : [ 
        {
        	title: NAMES.MONTARVOLANTE,
        	type: TYPES.MONTARVOLANTE,
        	create: true,
        },
    ],

    output : [ 
		{
			title: NAMES.COCHEFASE2,
			type: TYPES.COCHEFASE2,
			create: true,
		},
    ]
}
