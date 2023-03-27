import React, { useImperativeHandle } from 'react'
import { useTranslation } from 'react-i18next'
import { View } from 'react-native'
import styles from './metadata.styles'
import { connect } from 'react-redux'

import { process } from './metadata.utils'
import { ButtonPrimary, ThemeContext, FadeIn, Box } from '@telefonica/mistica'

function Metadata(props) {
  const { data, edit_fields, editWithoutButton, type, create, createWithButton, canEdit, account, register } = props
  const { colors } = React.useContext(ThemeContext)
  const { t } = useTranslation() //i18n instance

  const asset = process(data || {}, edit_fields || editWithoutButton, create || createWithButton, type, register ? "ADMIN" : account.authorities[0])

  return (
    <View style={[styles.properties, { borderColor: colors.border }]}>
        <Box padding={16}>
          <FadeIn delay="0.25s">
            {asset}
            {canEdit != [] && edit_fields && (
              <ButtonPrimary fullWidth submit>
                {t('UPDATE')}
              </ButtonPrimary>
            )}
            {createWithButton && (
              <ButtonPrimary fullWidth submit>
                {t('CREATE')}
              </ButtonPrimary>
            )}
          </FadeIn>
        </Box>
    </View>
  )
}

const mapStateToProps = (state) => {
  return {
    account: state.account.account,
  }
}
const mapDispatchToProps = (dispatch) => {
  return {}
}
export default connect(mapStateToProps, mapDispatchToProps)(Metadata)
