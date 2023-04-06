export function permissionsCarroceria(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Maquina':
		canView = ['altura','peso']
		canEdit = ['altura','peso']
		break
		default:
		break
  }

  return { canView, canEdit }
}
