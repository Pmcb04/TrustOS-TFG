export function permissionsAceite(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Proveedor':
		canView = ['denominacion','tipo']
		canEdit = ['denominacion','tipo']
		break
		case 'Panadero':
		canView = ['denominacion','tipo']
		canEdit = []
		break
		default:
		break
  }

  return { canView, canEdit }
}
