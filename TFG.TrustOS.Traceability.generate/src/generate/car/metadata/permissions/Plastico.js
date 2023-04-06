export function permissionsPlastico(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Administrador':
		canView = []
		canEdit = ['fechaCompra']
		break
		case 'Maquina':
		canView = ['fechaCompra']
		canEdit = []
		break
		default:
		break
  }

  return { canView, canEdit }
}
