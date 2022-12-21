import React, { useEffect } from 'react'
import { View } from 'react-native'
import { useTranslation } from 'react-i18next'

import styles from './asset-create-screen.styles'
import { connect } from 'react-redux'
import Asset from '../../shared/components/asset/asset'
import AssetCreateActions from './asset-create-screen.reducer'

import { Form, ThemeContext, Text10, Spinner, TextField } from '@telefonica/mistica'

function AssetCreateScreen(props) {
  const { navigation } = props
  let { type } = props.route.params
  const { fetching, error, name, setName } = props
  const { colors } = React.useContext(ThemeContext)
  const { t } = useTranslation() //i18n instance

  // // BUG cuando se recarga la página nos lanza un 401, esto es por que perdemos el token de la api al actualizar.
  // useEffect(() => {
  //   getAsset(isAuthorised, assetId)
  // }, [getAsset, isAuthorised, assetId])

  return (
    <>
      {error && (
        <View style={[styles.loading, { backgroundColor: colors.background }]}>
          <View style={styles.loadingText}>
            <Text10>Asset with id not found...</Text10>
          </View>
        </View>
      )}
      {fetching && (
        <View style={[styles.loading, { backgroundColor: colors.background }]}>
          <View style={styles.loadingText}>
            <Text10>Loading...</Text10>
            <Spinner size={64} />
          </View>
        </View>
      )}
      {!error && !fetching && (
        <View style={[styles.container, { backgroundColor: colors.background }]}>
          <Form onSubmit={(formData) => console.table(formData)}>
            <View style={[styles.container, styles.mainContainer]}>
              <View style={styles.metadata}>
                <TextField name="name" label="name" onChangeValue={(value) => setName(value)} />
              </View>
              <View style={styles.assetView}>
                <View style={styles.asset}>
                  <Asset name={name} type={type} authorizathed={false} />
                </View>
              </View>
            </View>
          </Form>
        </View>
      )}
    </>
  )
}

const mapStateToProps = (state) => {
  return {
    fetching: state.assetCreate.fetching,
    error: state.assetCreate.error,
    name: state.assetCreate.name,
  }
}
const mapDispatchToProps = (dispatch) => {
  return {
    setName: (name) => dispatch(AssetCreateActions.assetCreateSetName(name)),
  }
}
export default connect(mapStateToProps, mapDispatchToProps)(AssetCreateScreen)
