import React from 'react'
import {
  DataCard,
  Tag,
  IconFolderRegular,
  IconFingerprintRegular,
  IconShieldRegular,
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
      title={
        <Text4 truncate color={colors.textPrimary}>
          {name}
        </Text4>
      }
      subtitle={
        <Stack>
          <Inline space={8}>
            <IconShieldRegular color={authorizathed ? colors.success : colors.textPrimary} size={SIZE_ICONS_DESCRIPTION} />
            {authorizathed ? (
              <Text1 wordBreak color={colors.success} medium>
                {t('AUTHORIZATHED')}
              </Text1>
            ) : (
              <Text1 color={colors.textPrimary} medium>
                {t('OWNER')}
              </Text1>
            )}
          </Inline>

          <Inline space={8}>
            <IconFingerprintRegular size={SIZE_ICONS_DESCRIPTION} />

            <Text1 color={colors.textSecondary} regular truncate>
              {hash}
            </Text1>
          </Inline>
        </Stack>
      }
      icon={setImage(image)}
    />
  )
}

export default Asset
