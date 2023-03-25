export function permissionsHarina(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Proveedor':
		canView = []
		canEdit = []
		break
		case 'Panadero':
		canView = ['Tipo']
		canEdit = []
		break
		default:
		break
  }

  return { canView, canEdit }
}
