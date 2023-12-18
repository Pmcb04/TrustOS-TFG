export function permissionsOil_mill(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		default:
		canView = ['ubication','name']
		canEdit = ['ubication','name']
		break
  }

  return { canView, canEdit }
}
