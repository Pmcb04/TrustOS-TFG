import React, { useEffect } from 'react'
import { useTranslation } from 'react-i18next'
import { View } from 'react-native'
import styles from './metadata.styles'
import { connect } from 'react-redux'
import AssetCreateActions from '../../../modules/asset-create/asset-create-screen.reducer'

import { process } from './metadata.utils'
import { ButtonPrimary, ThemeContext, FadeIn, Box, TextField } from '@telefonica/mistica'
import { ScrollView } from 'react-native-gesture-handler'
import Property from '../property/property'

function Metadata(props) {
  const { data, edit_fields, type, create, setName, account } = props
  const { colors } = React.useContext(ThemeContext)
  const { t } = useTranslation() //i18n instance

  useEffect(() => {
    setName('')
  }, [setName])

  return (
    <View style={[styles.properties, { borderColor: colors.border }]}>
      <ScrollView contentContainerStyle={styles.contentContainer}>
        <Box padding={16}>
          <FadeIn delay="0.25s">
            {create && (
              <Property key={'name'} primaryKey="name" edit={true} title="name">
                <TextField name="name" label="name" onChangeValue={(value) => setName(value)} />
              </Property>
            )}
            {process(data, edit_fields, create, type, account.authorities[0])}
            <ButtonPrimary submit>{create ? t('CREATE') : t('UPDATE')}</ButtonPrimary>
          </FadeIn>
        </Box>
      </ScrollView>
    </View>
  )
}

const mapStateToProps = (state) => {
  return {
    name: state.assetCreate.name,
    account: state.account.account,
  }
}
const mapDispatchToProps = (dispatch) => {
  return {
    setName: (name) => dispatch(AssetCreateActions.assetCreateSetName(name)),
  }
}
export default connect(mapStateToProps, mapDispatchToProps)(Metadata)
