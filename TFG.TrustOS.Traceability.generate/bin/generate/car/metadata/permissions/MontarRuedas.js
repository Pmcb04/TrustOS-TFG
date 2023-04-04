export function permissionsMontarRuedas(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Operario':
		canView = ['fechaMontaje']
		canEdit = ['fechaMontaje']
		break
		default:
		break
  }

  return { canView, canEdit }
}
