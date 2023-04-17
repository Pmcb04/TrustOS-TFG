export function permissionsLevadura(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Panadero':
		canView = ['marca']
		canEdit = []
		break
		case 'Proveedor':
		canView = ['marca']
		canEdit = ['marca']
		break
		default:
		break
  }

  return { canView, canEdit }
}
