export function permissionsCocheFase2(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Operario':
		canView = ['peso','altura']
		canEdit = ['peso','altura']
		break
		case 'Mecanico':
		canView = ['peso','altura']
		canEdit = []
		break
		default:
		break
  }

  return { canView, canEdit }
}
