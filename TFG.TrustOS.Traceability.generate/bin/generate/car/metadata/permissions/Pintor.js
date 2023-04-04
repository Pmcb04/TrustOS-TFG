export function permissionsPintor(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		default:
		canView = ['estudio']
		canEdit = ['estudio']
		break
  }

  return { canView, canEdit }
}
