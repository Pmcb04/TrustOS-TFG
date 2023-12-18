export function permissionsOlive(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Oil mill':
		canView = ['pick_up_date']
		canEdit = []
		break
		case 'Farmer':
		canView = ['pick_up_date']
		canEdit = ['pick_up_date']
		break
		default:
		break
  }

  return { canView, canEdit }
}
