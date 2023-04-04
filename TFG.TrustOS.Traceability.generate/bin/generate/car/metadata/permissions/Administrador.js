export function permissionsAdministrador(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		default:
		canView = ['company']
		canEdit = ['company']
		break
  }

  return { canView, canEdit }
}
