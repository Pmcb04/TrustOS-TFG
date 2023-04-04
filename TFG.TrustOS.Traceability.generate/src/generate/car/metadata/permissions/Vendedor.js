export function permissionsVendedor(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		default:
		canView = ['concesionario']
		canEdit = ['concesionario']
		break
  }

  return { canView, canEdit }
}
