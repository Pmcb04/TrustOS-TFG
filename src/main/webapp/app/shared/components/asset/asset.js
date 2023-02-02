import React from 'react'
import { DataCard, Tag, IconFingerprintRegular, IconShieldRegular, Text4, Text1, Stack, ThemeContext, Inline } from '@telefonica/mistica'
import { useTranslation } from 'react-i18next'
import { getImage } from '../../util/asset-image-name'

const SIZE_ICONS_DESCRIPTION = 20

function Asset(props) {
  const { t } = useTranslation()
  const { colors } = React.useContext(ThemeContext)
  const { name, type, hash, authorizathed } = props
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
          {hash && (
            <Inline space={8}>
              <IconFingerprintRegular size={SIZE_ICONS_DESCRIPTION} />

              <Text1 color={colors.textSecondary} regular truncate>
                {hash}
              </Text1>
            </Inline>
          )}
        </Stack>
      }
      icon={getImage(type)}
    />
  )
}

export default Asset
