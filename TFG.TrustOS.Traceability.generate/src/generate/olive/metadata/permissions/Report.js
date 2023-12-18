export function permissionsReport(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Oil mill':
		canView = ['acidity']
		canEdit = ['acidity']
		break
		default:
		break
  }

  return { canView, canEdit }
}
