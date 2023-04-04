export function permissionsBase(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Maquina':
		canView = ['dimensiones','dimensiones.altura','dimensiones.anchura','identificador','peso']
		canEdit = ['dimensiones','dimensiones.altura','dimensiones.anchura','identificador','peso']
		break
		case 'Operario':
		canView = ['dimensiones','dimensiones.altura','dimensiones.anchura','peso']
		canEdit = []
		break
		default:
		break
  }

  return { canView, canEdit }
}
