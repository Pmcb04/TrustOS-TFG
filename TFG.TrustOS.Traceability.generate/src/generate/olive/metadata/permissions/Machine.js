export function permissionsMachine(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Oil mill':
		canView = ['date_exec']
		canEdit = ['date_exec']
		break
		default:
		break
  }

  return { canView, canEdit }
}
