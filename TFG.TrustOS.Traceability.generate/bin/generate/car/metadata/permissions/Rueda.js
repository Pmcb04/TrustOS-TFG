export function permissionsRueda(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Operario':
		canView = ['anchura','altura','diametro']
		canEdit = []
		break
		case 'Administrador':
		canView = []
		canEdit = ['anchura','indCarg','altura','vMax','diametro']
		break
		default:
		break
  }

  return { canView, canEdit }
}
