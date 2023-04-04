export function permissionsCocheFase3(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Pintor':
		canView = ['peso','altura']
		canEdit = []
		break
		case 'Mecanico':
		canView = ['peso','altura']
		canEdit = ['peso','altura']
		break
		default:
		break
  }

  return { canView, canEdit }
}
