export function permissionsMontarMotor(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Mecanico':
		canView = ['fechaMontaje']
		canEdit = ['fechaMontaje']
		break
		default:
		break
  }

  return { canView, canEdit }
}
