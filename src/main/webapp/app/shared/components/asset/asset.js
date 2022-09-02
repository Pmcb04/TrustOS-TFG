import React from 'react'
import {
  DataCard,
  Tag,
  IconFolderRegular,
  IconFingerprintRegular,
  IconAutenticationSuccessRegular,
  IconBoxRegular,
  Text4,
  Text1,
  Stack,
  ThemeContext,
  Inline,
} from '@telefonica/mistica'
import { useTranslation } from 'react-i18next'

const IMAGES = {
  TRANSACTION: 'transaction',
  PRODUCT: 'product',
}
const SIZE_ICONS = 50
const SIZE_ICONS_DESCRIPTION = 20

function setImage(image) {
  switch (image) {
    case IMAGES.TRANSACTION:
      return <IconFolderRegular size={SIZE_ICONS} />

    case IMAGES.PRODUCT:
      return <IconBoxRegular size={SIZE_ICONS} />

    default:
      return <IconBoxRegular size={SIZE_ICONS} />
  }
}

function Asset(props) {
  const { t } = useTranslation()
  const { colors } = React.useContext(ThemeContext)
  const { image, name, type, hash, authorizathed } = props
  return (
    <DataCard
      headline={<Tag type="active">{type ? type : 'Asset'}</Tag>}
      title={<Text4 color={colors.textPrimary}>{name.substring(0, 30)}</Text4>}
      subtitle={
        <Stack>
          {authorizathed ? (
            <Inline space={8}>
              <IconAutenticationSuccessRegular color={colors.success} size={SIZE_ICONS_DESCRIPTION} />
              <Text1 color={colors.success} medium>
                {t('AUTHORIZATHED')}
              </Text1>
            </Inline>
          ) : null}

          <Inline space={8}>
            <IconFingerprintRegular size={SIZE_ICONS_DESCRIPTION} />
            <Text1 color={colors.textSecondary} light>
              {hash.substring(0, 30)}
            </Text1>
          </Inline>
        </Stack>
      }
      icon={setImage(image)}
    />
  )
}

export default Asset
