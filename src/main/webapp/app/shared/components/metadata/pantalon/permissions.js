export function permissionsPantalon(rol) {
  let canView = []
  let canEdit = []
  switch (rol) {
    case 'ROLE_ADMIN':
      canView = ['height', 'width']
      canEdit = []
      break
  }

  return { canView, canEdit }
}
