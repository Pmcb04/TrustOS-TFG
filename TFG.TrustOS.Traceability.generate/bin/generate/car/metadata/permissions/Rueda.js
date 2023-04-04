export function permissionsRueda(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Administrador':
		canView = []
		canEdit = ['vMax','diametro','altura','indCarg','anchura']
		break
		case 'Operario':
		canView = ['diametro','altura','anchura']
		canEdit = []
		break
		default:
		break
  }

  return { canView, canEdit }
}
