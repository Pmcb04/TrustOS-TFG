export function permissionsPintar(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Pintor':
		canView = ['color']
		canEdit = []
		break
		default:
		break
  }

  return { canView, canEdit }
}
