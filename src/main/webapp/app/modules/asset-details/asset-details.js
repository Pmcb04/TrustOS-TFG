import React from 'react'
import { View } from 'react-native'
import Product from '../../shared/themes/icons/product'
import styles from './asset-details.styles'
import Asset from '../../shared/components/asset/asset'
import { connect } from 'react-redux'
import AssetDetailsActions from './asset-details.reducer'
import {
  ButtonPrimary,
  ButtonSecondary,
  IconIdCardRegular,
  IconEditPencilRegular,
  IconBookmarkRegular,
  Form,
  TextField,
  Stack,
  ButtonLink,
  Text2,
  ThemeContext,
  EmailField,
  Box,
} from '@telefonica/mistica'
import { ScrollView } from 'react-native-gesture-handler'

// TODO cambiar por futura llamada a la api
const DATA = {
  image: <Product width={40} height={40} />,
  name: 'bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
  type: 'Fourth Item',
  hash: 'b1d9f25b1bf78e25e443a6815b9763b7f7eda25d1dd06486ccfc2130b229dc93',
}

function AssetDetails(props) {
  const { assetId } = props.route.params
  const { editAsset, disabled_fields } = props
  const { colors } = React.useContext(ThemeContext)

  return (
    <View style={[styles.container, styles.mainContainer]}>
      <View style={[styles.properties, { borderColor: colors.border }]}>
        <Form onSubmit={(formData) => console.log(formData)}>
          <Stack space={16}>
            <TextField disabled={disabled_fields} name="name" label="Name" />
            <EmailField disabled={disabled_fields} name="email" label="e-mail" />
            <TextField disabled={disabled_fields} name="name" label="Name" />
            <EmailField disabled={disabled_fields} name="email" label="e-mail" />
            <TextField disabled={disabled_fields} name="name" label="Name" />
            <EmailField disabled={disabled_fields} name="email" label="e-mail" />
            <TextField disabled={disabled_fields} name="name" label="Name" />
            <EmailField disabled={disabled_fields} name="email" label="e-mail" />
            <TextField disabled={disabled_fields} name="name" label="Name" />
            <EmailField disabled={disabled_fields} name="email" label="e-mail" />
            <TextField disabled={disabled_fields} name="name" label="Name" />
            <EmailField disabled={disabled_fields} name="email" label="e-mail" />
            <TextField disabled={disabled_fields} name="name" label="Name" />
            <EmailField disabled={disabled_fields} name="email" label="e-mail" />
          </Stack>
        </Form>
      </View>
      <View style={styles.assetView}>
        <View style={styles.asset}>
          <Asset name={assetId} image={DATA.image} type={DATA.type} hash={DATA.hash} />
        </View>

        <Stack space={16}>
          <View style={styles.buttons}>
            {disabled_fields ? (
              <ButtonPrimary onPress={editAsset}>
                <IconEditPencilRegular color="currentColor" />
                Edit
              </ButtonPrimary>
            ) : (
              <ButtonPrimary onPress={editAsset}>
                <IconBookmarkRegular color="currentColor" />
                Save
              </ButtonPrimary>
            )}

            <ButtonSecondary disabled={!disabled_fields} onPress={() => {}}>
              <IconIdCardRegular color="currentColor" />
              Tranfer
            </ButtonSecondary>
          </View>

          <View style={styles.actions}>
            <Text2 medium>Acciones que puede realizar</Text2>
            <ButtonLink disabled={!disabled_fields} onPress={() => {}}>
              Action 2
            </ButtonLink>
            <ButtonLink disabled={!disabled_fields} onPress={() => {}}>
              Action 1
            </ButtonLink>
          </View>
        </Stack>
      </View>
    </View>
  )
}

const mapStateToProps = (state) => {
  return {
    disabled_fields: state.assetDetails.disabled_fields,
  }
}
const mapDispatchToProps = (dispatch) => {
  return {
    editAsset: () => dispatch(AssetDetailsActions.assetDetailsEdit()),
  }
}
export default connect(mapStateToProps, mapDispatchToProps)(AssetDetails)