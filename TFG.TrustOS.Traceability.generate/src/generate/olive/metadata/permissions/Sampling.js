export function permissionsSampling(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Oil mill':
		canView = ['date_sampling']
		canEdit = ['date_sampling']
		break
		default:
		break
  }

  return { canView, canEdit }
}
