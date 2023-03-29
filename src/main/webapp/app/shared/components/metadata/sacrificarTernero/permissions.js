// TODO fichero autogenerado
export function permissionsSacrificarTernero(rol) {
  let canView = []
  let canEdit = []
  switch (rol) {
    case 'ROLE_ADMIN':
      canView = ['fechaSacrificio']
      canEdit = ['fechaSacrificio']
      break
  }

  return { canView, canEdit }
}
