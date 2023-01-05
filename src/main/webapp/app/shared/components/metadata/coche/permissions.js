export function permissionsCoche(rol) {
  let canView = []
  let canEdit = []
  switch (rol) {
    case 'ROLE_USER':
      canView = ['height', 'width', 'color', 'horsepower']
      canEdit = ['color']
      break
  }

  return { canView, canEdit }
}
