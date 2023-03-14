// TODO fichero autogenerado

export function permissionsROLE_USER(rol) {
  let canView = []
  let canEdit = []
  switch (rol) {
    default:
      canView = ['damage']
      canEdit = []
      break
  }

  return { canView, canEdit }
}
