export function permissionsCoche(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Vendedor':
		canView = ['peso','altura']
		canEdit = ['peso','altura']
		break
		default:
		break
  }

  return { canView, canEdit }
}
