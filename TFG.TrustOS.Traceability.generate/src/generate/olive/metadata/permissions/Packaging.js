export function permissionsPackaging(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Oil mill':
		canView = ['date_packaging']
		canEdit = ['date_packaging']
		break
		default:
		break
  }

  return { canView, canEdit }
}
