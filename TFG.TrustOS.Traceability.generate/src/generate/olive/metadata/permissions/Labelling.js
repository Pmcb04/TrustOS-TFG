export function permissionsLabelling(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Oil mill':
		canView = ['expirity_date']
		canEdit = ['expirity_date']
		break
		default:
		break
  }

  return { canView, canEdit }
}
