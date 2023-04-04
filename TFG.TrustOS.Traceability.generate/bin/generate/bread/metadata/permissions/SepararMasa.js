export function permissionsSepararMasa(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Panadero':
		canView = ['fechaSeparacion']
		canEdit = ['fechaSeparacion']
		break
		default:
		break
  }

  return { canView, canEdit }
}
