export function permissionsClean_oil(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Oil mill':
		canView = ['purity']
		canEdit = ['purity']
		break
		default:
		break
  }

  return { canView, canEdit }
}
