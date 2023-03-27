// TODO fichero autogenerado
export function permissionsBotella(rol) {
  let canView = []
  let canEdit = []
  switch (rol) {
    case 'ROLE_ADMIN':
      canView = ['heigth', 'capacity']
      canEdit = ['capacity']
      break
    case 'ROLE_USER':
      canView = ['heigth', 'capacity']
      canEdit = ['heigth']
      break
  }

  return { canView, canEdit }
}
