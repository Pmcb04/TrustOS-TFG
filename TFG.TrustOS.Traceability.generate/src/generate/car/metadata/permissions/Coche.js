export function permissionsCoche(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Vendedor':
		canView = ['altura','peso']
		canEdit = ['altura','peso']
		break
		default:
		break
  }

  return { canView, canEdit }
}
