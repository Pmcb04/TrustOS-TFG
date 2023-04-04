export function permissionsPan(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Panadero':
		canView = ['nombre']
		canEdit = ['nombre']
		break
		default:
		break
  }

  return { canView, canEdit }
}
