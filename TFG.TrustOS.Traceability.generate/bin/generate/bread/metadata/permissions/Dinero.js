export function permissionsDinero(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Panadero':
		canView = ['cantidad']
		canEdit = ['cantidad']
		break
		default:
		break
  }

  return { canView, canEdit }
}
