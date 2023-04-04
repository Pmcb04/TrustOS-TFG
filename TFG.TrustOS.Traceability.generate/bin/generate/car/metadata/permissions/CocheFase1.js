export function permissionsCocheFase1(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Operario':
		canView = ['altura','peso']
		canEdit = ['altura','peso']
		break
		default:
		break
  }

  return { canView, canEdit }
}
