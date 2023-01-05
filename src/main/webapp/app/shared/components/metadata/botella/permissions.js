export function permissionsBotella(rol) {
  let canView = []
  let canEdit = []
  switch (rol) {
    case 'ROLE_ADMIN':
      canView = ['height', 'capacity']
      canEdit = ['capacity']
      break
    case 'ROLE_USER':
      canView = ['height', 'capacity']
      canEdit = ['height']
      break
  }

  return { canView, canEdit }
}
