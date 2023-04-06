export function permissionsBase(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		case 'Maquina':
		canView = ['identificador','peso','dimensiones','dimensiones.altura','dimensiones.anchura']
		canEdit = ['identificador','peso','dimensiones','dimensiones.altura','dimensiones.anchura']
		break
		case 'Operario':
		canView = ['peso','dimensiones','dimensiones.altura','dimensiones.anchura']
		canEdit = []
		break
		default:
		break
  }

  return { canView, canEdit }
}
