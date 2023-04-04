export function permissionsMontarBase(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Maquina':
		canView = ['fechaMontaje']
		canEdit = ['fechaMontaje']
		break
		default:
		break
  }

  return { canView, canEdit }
}
