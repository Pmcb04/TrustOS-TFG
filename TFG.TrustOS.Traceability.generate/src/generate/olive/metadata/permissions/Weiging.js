export function permissionsWeiging(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Oil mill':
		canView = ['num_kg']
		canEdit = ['num_kg']
		break
		default:
		break
  }

  return { canView, canEdit }
}
