export function permissionsMotor(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Mecanico':
		canView = ['potencia']
		canEdit = ['potencia']
		break
		case 'Administrador':
		canView = []
		canEdit = []
		break
		default:
		break
  }

  return { canView, canEdit }
}
