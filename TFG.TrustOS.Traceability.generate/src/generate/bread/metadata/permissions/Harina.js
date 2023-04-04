export function permissionsHarina(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Proveedor':
		canView = ['Tipo']
		canEdit = ['Tipo']
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
