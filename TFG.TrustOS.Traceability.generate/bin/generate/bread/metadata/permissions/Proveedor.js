export function permissionsProveedor(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		default:
		canView = ['contacto']
		canEdit = ['contacto']
		break
  }

  return { canView, canEdit }
}
