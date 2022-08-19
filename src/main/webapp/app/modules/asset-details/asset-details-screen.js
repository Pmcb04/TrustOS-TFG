import React from 'react'
import { View } from 'react-native'
import { useTranslation } from 'react-i18next'

import Product from '../../shared/themes/icons/product'
import styles from './asset-details-screen.styles'
import Asset from '../../shared/components/asset/asset'
import { connect } from 'react-redux'
import AssetDetailsScreenActions from './asset-details-screen.reducer'
import {
  ButtonPrimary,
  ButtonSecondary,
  IconIdCardRegular,
  IconEditPencilRegular,
  IconBookmarkRegular,
  Form,
  TextField,
  Stack,
  DateField,
  ThemeContext,
  IntegerField,
  IconRouteRegular,
  DecimalField,
} from '@telefonica/mistica'

// TODO cambiar por futura llamada a la api
const DATA = {
  image: <Product width={40} height={40} />,
  name: 'bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
  type: 'Fourth Item',
  hash: 'b1d9f25b1bf78e25e443a6815b9763b7f7eda25d1dd06486ccfc2130b229dc93',
}

function AssetDetailsScreen(props) {
  const { assetId } = props.route.params
  const { editAsset, disabled_fields } = props
  const { colors } = React.useContext(ThemeContext)
  const { t } = useTranslation() //i18n instance

  return (
    <View style={[styles.container, styles.mainContainer]}>
      <View style={[styles.properties, { borderColor: colors.border }]}>
        <Form onSubmit={(formData) => console.log(formData)}>
          <Stack fullWidth space={16}>
            <TextField disabled fullWidth name="owner" label="Owner" />
            <TextField disabled={disabled_fields} fullWidth name="name" label="Name" />
            <TextField disabled={disabled_fields} fullWidth optional name="name" label="Name" />
            <TextField disabled={disabled_fields} fullWidth multiline name="name" label="Name" />
            <TextField disabled={disabled_fields} fullWidth optional multiline name="name" label="Name" />
            <DateField disabled={disabled_fields} fullWidth name="date" label="Date" />
            <DateField disabled={disabled_fields} fullWidth optional name="date" label="Date" />
            <IntegerField disabled={disabled_fields} fullWidth name="integer" label="Integer" />
            <IntegerField disabled={disabled_fields} fullWidth optional name="integer" label="Integer" />
            <DecimalField disabled={disabled_fields} fullWidth name="decimal" label="Decimal" />
            <DecimalField disabled={disabled_fields} fullWidth optional name="decimal" label="Decimal" />
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
                {t('EDIT')}
              </ButtonPrimary>
            ) : (
              <ButtonPrimary onPress={editAsset}>
                <IconBookmarkRegular color="currentColor" />
                {t('SAVE')}
              </ButtonPrimary>
            )}

            <ButtonSecondary disabled={!disabled_fields} onPress={() => {}}>
              <IconIdCardRegular color="currentColor" />
              {t('TRANFER')}
            </ButtonSecondary>
            <ButtonSecondary disabled={!disabled_fields} onPress={() => {}}>
              <IconRouteRegular color="currentColor" />
              {t('TRACEABILITY')}
            </ButtonSecondary>
            <ButtonSecondary disabled={!disabled_fields} onPress={() => {}}>
              Action 2
            </ButtonSecondary>
            <ButtonSecondary disabled={!disabled_fields} onPress={() => {}}>
              Action 1
            </ButtonSecondary>
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
    editAsset: () => dispatch(AssetDetailsScreenActions.assetDetailsEdit()),
  }
}
export default connect(mapStateToProps, mapDispatchToProps)(AssetDetailsScreen)
