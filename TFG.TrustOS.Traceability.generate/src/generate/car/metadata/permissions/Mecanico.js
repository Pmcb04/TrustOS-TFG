export function permissionsMecanico(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		default:
		canView = ['taller']
		canEdit = ['taller']
		break
  }

  return { canView, canEdit }
}
