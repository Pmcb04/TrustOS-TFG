export function permissionsPlastico(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Maquina':
		canView = ['fechaCompra']
		canEdit = []
		break
		case 'Administrador':
		canView = []
		canEdit = ['fechaCompra']
		break
		default:
		break
  }

  return { canView, canEdit }
}
