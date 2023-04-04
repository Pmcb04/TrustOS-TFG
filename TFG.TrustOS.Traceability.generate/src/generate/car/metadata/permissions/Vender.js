export function permissionsVender(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Vendedor':
		canView = ['fechaVenta']
		canEdit = ['fechaVenta']
		break
		default:
		break
  }

  return { canView, canEdit }
}
