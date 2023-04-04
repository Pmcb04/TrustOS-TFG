export function permissionsVender(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Panadero':
		canView = ['fechaVendido']
		canEdit = ['fechaVendido']
		break
		default:
		break
  }

  return { canView, canEdit }
}
