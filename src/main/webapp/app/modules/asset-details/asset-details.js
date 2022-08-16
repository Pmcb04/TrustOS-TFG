import React from 'react'
import { View } from 'react-native'
import Product from '../../shared/themes/icons/product'
import styles from './asset-details.styles'
import { connect } from 'react-redux'
import {
  ButtonPrimary,
  ButtonSecondary,
  IconCreditCardVisaFilled,
  IconEditPencilRegular,
  DateField,
  Select,
  TextField,
  Stack,
  ButtonLink,
  Text2,
  ThemeContext,
} from '@telefonica/mistica'
import Asset from '../../shared/components/asset/asset'

// TODO cambiar por futura llamada a la api
const DATA = {
  image: <Product width={40} height={40} />,
  name: 'bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
  type: 'Fourth Item',
  hash: 'b1d9f25b1bf78e25e443a6815b9763b7f7eda25d1dd06486ccfc2130b229dc93',
}

function AssetDetails({ route }) {
  const { assetId } = route.params
  const { colors } = React.useContext(ThemeContext)

  return (
    <View style={[styles.container, styles.mainContainer]}>
      <View style={[styles.properties, { borderColor: colors.border }]}>
        <Stack space={32}>
          <DateField fullWidth name="date" label="Date" />
          <Select
            fullWidth
            name="fruits"
            label="Choose a fruit"
            value="orange"
            options={[
              { value: 'orange', text: 'Orange' },
              { value: 'banana', text: 'Banana' },
            ]}
          />
          <TextField fullWidth name="name" label="Name" value="asdjajkshdjkhasjkdhhas" />
        </Stack>
      </View>

      <View style={styles.assetView}>
        <View style={styles.asset}>
          <Asset name={assetId} image={DATA.image} type={DATA.type} hash={DATA.hash} />
        </View>

        <Stack space={16}>
          <View style={styles.buttons}>
            <ButtonPrimary onPress={() => {}}>
              <IconEditPencilRegular color="currentColor" />
              Edit
            </ButtonPrimary>

            <ButtonSecondary onPress={() => {}}>
              <IconCreditCardVisaFilled color="currentColor" />
              Tranfer
            </ButtonSecondary>
          </View>

          <View style={styles.actions}>
            <Text2 medium>Acciones que puede realizar</Text2>
            <ButtonLink onPress={() => {}}>Action 1</ButtonLink>
            <ButtonLink onPress={() => {}}>Action 2</ButtonLink>
          </View>
        </Stack>
      </View>
    </View>
  )
}

const mapStateToProps = (state) => ({ account: state.account.account })
const mapDispatchToProps = (dispatch) => ({})
export default connect(mapStateToProps, mapDispatchToProps)(AssetDetails)
