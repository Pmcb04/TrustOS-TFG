// TODO fichero autogenerado

export function permissionsOrdenador(rol) {
  let canView = []
  let canEdit = []
  switch (rol) {
    case 'ROLE_USER':
      canView = ['company', 'ram', 'rom', 'processor']
      canEdit = ['ram', 'rom']
      break
  }

  return { canView, canEdit }
}
