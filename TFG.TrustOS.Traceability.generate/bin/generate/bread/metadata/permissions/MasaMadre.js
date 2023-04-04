export function permissionsMasaMadre(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Panadero':
		canView = ['tiempoReposo']
		canEdit = ['tiempoReposo']
		break
		default:
		break
  }

  return { canView, canEdit }
}
