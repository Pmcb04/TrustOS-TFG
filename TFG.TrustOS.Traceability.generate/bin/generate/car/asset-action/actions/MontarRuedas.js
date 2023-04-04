
import { TYPES } from '../../../shared/util/nodes-types'
import { NAMES } from '../../../shared/util/nodes-names'

export default {
    input : [ 
		{
			title: NAMES.BASE,
			type: TYPES.BASE,
			create: false,
		},
		{
			title: NAMES.RUEDA1,
			type: TYPES.RUEDA,
			create: false,
		},
		{
			title: NAMES.RUEDA2,
			type: TYPES.RUEDA,
			create: false,
		},
		{
			title: NAMES.RUEDA3,
			type: TYPES.RUEDA,
			create: false,
		},
		{
			title: NAMES.RUEDA4,
			type: TYPES.RUEDA,
			create: false,
		},
    ],

    action : [ 
        {
        	title: NAMES.MONTARRUEDAS,
        	type: TYPES.MONTARRUEDAS,
        	create: true,
        },
    ],

    output : [ 
		{
			title: NAMES.COCHEFASE1,
			type: TYPES.COCHEFASE1,
			create: true,
		},
    ]
}
