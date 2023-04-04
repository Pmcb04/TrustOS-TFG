export function permissionsAceite(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Proveedor':
		canView = ['tipo','denominacion']
		canEdit = ['tipo','denominacion']
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
