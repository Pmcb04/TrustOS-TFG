export function permissionsAzucar(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Proveedor':
		canView = ['color']
		canEdit = ['color']
		break
		case 'Panadero':
		canView = ['color']
		canEdit = []
		break
		default:
		break
  }

  return { canView, canEdit }
}
