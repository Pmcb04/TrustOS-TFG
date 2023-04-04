export function permissionsCocinar(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Panadero':
		canView = ['fechaCocinado']
		canEdit = ['fechaCocinado']
		break
		default:
		break
  }

  return { canView, canEdit }
}
