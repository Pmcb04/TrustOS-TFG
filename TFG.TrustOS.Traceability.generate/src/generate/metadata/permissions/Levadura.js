export function permissionsLevadura(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Proveedor':
		canView = []
		canEdit = []
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
