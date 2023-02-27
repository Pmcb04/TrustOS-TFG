// TODO fichero autogenerado

export function permissionsUsar(rol) {
  let canView = []
  let canEdit = []
  switch (rol) {
    case 'ROLE_ADMIN':
      canView = ['time']
      canEdit = []
      break
  }

  return { canView, canEdit }
}
