export function permissionsPanadero(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		default:
		canView = ['direccion']
		canEdit = ['direccion']
		break
  }

  return { canView, canEdit }
}
