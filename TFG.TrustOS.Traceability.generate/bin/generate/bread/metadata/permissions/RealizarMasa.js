export function permissionsRealizarMasa(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Panadero':
		canView = ['fechaAmasado']
		canEdit = ['fechaAmasado']
		break
		default:
		break
  }

  return { canView, canEdit }
}
