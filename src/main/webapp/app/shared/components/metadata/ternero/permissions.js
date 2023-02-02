// TODO fichero autogenerado

export function permissionsTernero(rol) {
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
