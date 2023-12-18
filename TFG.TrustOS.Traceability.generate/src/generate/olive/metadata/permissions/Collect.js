export function permissionsCollect(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Oil mill':
		canView = ['season']
		canEdit = ['season']
		break
		default:
		break
  }

  return { canView, canEdit }
}
