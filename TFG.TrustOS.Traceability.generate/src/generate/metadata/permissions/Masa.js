export function permissionsMasa(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Panadero':
		canView = ['integral']
		canEdit = ['integral']
		break
		default:
		break
  }

  return { canView, canEdit }
}
