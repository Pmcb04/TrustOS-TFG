// TODO fichero autogenerado
export function permissionsPantalon(rol) {
  let canView = []
  let canEdit = []
  switch (rol) {
    case 'ROLE_ADMIN':
      canView = ['color', 'width']
      canEdit = ['color', 'width']
      break
  }

  return { canView, canEdit }
}
