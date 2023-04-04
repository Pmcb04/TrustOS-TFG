export function permissionsOperario(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		default:
		canView = ['zona']
		canEdit = ['zona']
		break
  }

  return { canView, canEdit }
}
