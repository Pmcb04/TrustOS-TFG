// TODO fichero autogenerado
export function permissionsROLE_ADMIN(rol) {
  let canView = []
  let canEdit = []
  switch (rol) {
    default:
      canView = ['color', 'width']
      canEdit = ['color', 'width']
      break
  }

  return { canView, canEdit }
}
