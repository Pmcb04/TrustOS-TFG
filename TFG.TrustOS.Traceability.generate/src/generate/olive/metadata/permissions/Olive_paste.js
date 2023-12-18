export function permissionsOlive_paste(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Oil mill':
		canView = ['humidity','temperature']
		canEdit = ['humidity','temperature']
		break
		default:
		break
  }

  return { canView, canEdit }
}
