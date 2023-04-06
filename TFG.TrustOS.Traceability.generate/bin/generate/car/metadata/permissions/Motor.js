export function permissionsMotor(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Administrador':
		canView = []
		canEdit = []
		break
		case 'Mecanico':
		canView = ['potencia']
		canEdit = ['potencia']
		break
		default:
		break
  }

  return { canView, canEdit }
}
