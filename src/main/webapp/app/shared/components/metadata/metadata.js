import React from 'react'
import { useTranslation } from 'react-i18next'
import { View } from 'react-native'
import styles from './metadata.styles'
import { process } from '../../../modules/asset-details/asset-details.utils'
import { ButtonPrimary, Stack, ThemeContext, FadeIn, Box } from '@telefonica/mistica'
import { ScrollView } from 'react-native-gesture-handler'

function Metadata(props) {
  const { data, edit_fields } = props
  const { colors } = React.useContext(ThemeContext)
  const { t } = useTranslation() //i18n instance

  return (
    <View style={[styles.properties, { borderColor: colors.border }]}>
      <ScrollView contentContainerStyle={styles.contentContainer}>
        <Box padding={16}>
          <FadeIn delay="0.25s">
            <Stack fullWidth space={16}>
              {process(data, edit_fields)}
            </Stack>
          </FadeIn>
          {edit_fields && <ButtonPrimary submit>{t('UPDATE')}</ButtonPrimary>}
        </Box>
      </ScrollView>
    </View>
  )
}

export default Metadata
