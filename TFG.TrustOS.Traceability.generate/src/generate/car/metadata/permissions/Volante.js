export function permissionsVolante(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Administrador':
		canView = []
		canEdit = ['diametro']
		break
		case 'Operario':
		canView = ['diametro']
		canEdit = []
		break
		default:
		break
  }

  return { canView, canEdit }
}
