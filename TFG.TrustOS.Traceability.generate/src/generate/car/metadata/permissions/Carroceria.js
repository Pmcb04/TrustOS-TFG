export function permissionsCarroceria(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Maquina':
		canView = ['peso','altura']
		canEdit = ['peso','altura']
		break
		default:
		break
  }

  return { canView, canEdit }
}
