export function permissionsVolante(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Operario':
		canView = ['diametro']
		canEdit = []
		break
		case 'Administrador':
		canView = []
		canEdit = ['diametro']
		break
		default:
		break
  }

  return { canView, canEdit }
}
