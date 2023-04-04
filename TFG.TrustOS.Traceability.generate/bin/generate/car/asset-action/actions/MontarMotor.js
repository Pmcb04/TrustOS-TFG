
import { TYPES } from '../../../shared/util/nodes-types'
import { NAMES } from '../../../shared/util/nodes-names'

export default {
    input : [ 
		{
			title: NAMES.MOTOR,
			type: TYPES.MOTOR,
			create: false,
		},
		{
			title: NAMES.COCHEFASE2,
			type: TYPES.COCHEFASE2,
			create: false,
		},
    ],

    action : [ 
        {
        	title: NAMES.MONTARMOTOR,
        	type: TYPES.MONTARMOTOR,
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
