export function permissionsMaquina(rol) {
  let canView = [] 
  let canEdit = []
  switch (rol) {
		default:
		canView = ['serialNumber']
		canEdit = ['serialNumber']
		break
  }

  return { canView, canEdit }
}
