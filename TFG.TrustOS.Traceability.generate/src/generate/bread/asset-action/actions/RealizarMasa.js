
import { TYPES } from '../../../shared/util/nodes-types'
import { NAMES } from '../../../shared/util/nodes-names'

export default {
    input : [ 
		{
			title: NAMES.HARINA,
			type: TYPES.HARINA,
			create: false,
		},
		{
			title: NAMES.SAL,
			type: TYPES.SAL,
			create: false,
		},
		{
			title: NAMES.AZUCAR,
			type: TYPES.AZUCAR,
			create: false,
		},
		{
			title: NAMES.ACEITE,
			type: TYPES.ACEITE,
			create: false,
		},
		{
			title: NAMES.LEVADURA,
			type: TYPES.LEVADURA,
			create: false,
		},
    ],

    action : [ 
        {
        	title: NAMES.REALIZARMASA,
        	type: TYPES.REALIZARMASA,
        	create: true,
        },
    ],

    output : [ 
		{
			title: NAMES.MASAMADRE,
			type: TYPES.MASAMADRE,
			create: true,
		},
    ]
}
