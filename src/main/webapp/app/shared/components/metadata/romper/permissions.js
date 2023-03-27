// TODO fichero autogenerado

export function permissionsRomper(rol) {
  let canView = []
  let canEdit = []
  switch (rol) {
    case 'ROLE_ADMIN':
      canView = ['damage']
      canEdit = []
      break
  }

  return { canView, canEdit }
}
