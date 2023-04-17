export function permissionsAzucar(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Panadero':
		canView = ['color']
		canEdit = []
		break
		case 'Proveedor':
		canView = ['color']
		canEdit = ['color']
		break
		default:
		break
  }

  return { canView, canEdit }
}
