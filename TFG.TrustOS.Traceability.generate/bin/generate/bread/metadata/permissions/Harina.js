export function permissionsHarina(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Panadero':
		canView = ['Tipo']
		canEdit = []
		break
		case 'Proveedor':
		canView = ['Tipo']
		canEdit = ['Tipo']
		break
		default:
		break
  }

  return { canView, canEdit }
}
