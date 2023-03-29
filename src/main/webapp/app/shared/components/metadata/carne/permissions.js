// TODO fichero autogenerado
export function permissionsCarne(rol) {
  let canView = []
  let canEdit = []
  switch (rol) {
    case 'ROLE_ADMIN':
      canView = ['fechaCaducidad']
      canEdit = ['fechaCaducidad']
      break
  }

  return { canView, canEdit }
}
