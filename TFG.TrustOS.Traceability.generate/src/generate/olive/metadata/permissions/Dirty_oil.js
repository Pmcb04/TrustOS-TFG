export function permissionsDirty_oil(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Oil mill':
		canView = ['contamination']
		canEdit = ['contamination']
		break
		default:
		break
  }

  return { canView, canEdit }
}
