export function permissionsAceite(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Proveedor':
		canView = []
		canEdit = []
		break
		case 'Panadero':
		canView = ['tipo','denominacion']
		canEdit = []
		break
		default:
		break
  }

  return { canView, canEdit }
}
