export function permissionsAceite(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Panadero':
		canView = ['tipo','denominacion']
		canEdit = []
		break
		case 'Proveedor':
		canView = ['tipo','denominacion']
		canEdit = ['tipo','denominacion']
		break
		default:
		break
  }

  return { canView, canEdit }
}
