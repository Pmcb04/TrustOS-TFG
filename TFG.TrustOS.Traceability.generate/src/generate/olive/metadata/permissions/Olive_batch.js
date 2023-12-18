export function permissionsOlive_batch(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Oil mill':
		canView = ['num_batch','owner','variety_oil']
		canEdit = ['num_batch','owner','variety_oil']
		break
		default:
		break
  }

  return { canView, canEdit }
}
