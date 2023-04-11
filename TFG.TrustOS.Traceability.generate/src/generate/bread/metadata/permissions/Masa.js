export function permissionsMasa(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Panadero':
		canView = ['gramos']
		canEdit = ['gramos']
		break
		default:
		break
  }

  return { canView, canEdit }
}
