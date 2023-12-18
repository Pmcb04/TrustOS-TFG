export function permissionsOil_bottle(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Oil mill':
		canView = ['type_oil']
		canEdit = ['type_oil']
		break
		default:
		break
  }

  return { canView, canEdit }
}
