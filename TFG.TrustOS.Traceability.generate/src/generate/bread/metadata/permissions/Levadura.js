export function permissionsLevadura(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Proveedor':
		canView = ['marca']
		canEdit = ['marca']
		break
		case 'Panadero':
		canView = ['marca']
		canEdit = []
		break
		default:
		break
  }

  return { canView, canEdit }
}
