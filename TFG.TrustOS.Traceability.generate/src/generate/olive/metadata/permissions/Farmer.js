export function permissionsFarmer(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		default:
		canView = ['name']
		canEdit = ['name']
		break
  }

  return { canView, canEdit }
}
