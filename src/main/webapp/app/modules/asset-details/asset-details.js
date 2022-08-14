import React from 'react'
import { View } from 'react-native'
import Product from '../../shared/themes/icons/product'
import styles from './asset-details.styles'
import {
  ButtonPrimary,
  DataCard,
  Tag,
  ButtonSecondary,
  IconCreditCardVisaFilled,
  IconEditPencilRegular,
  DateField,
  Select,
  TextField,
  RadioGroup,
  RadioButton,
  Stack,
  PasswordField,
  ButtonLink,
  Text2,
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

  return (
    <View style={[styles.container, styles.mainContainer]}>
      <View style={styles.properties}>
        <Stack space={16}>
          <DateField fullWidth name="date" label="Date" />
          <Select
            fullWidth
            name="fruits"
            label="Choose a fruit"
            options={[
              { value: 'orange', text: 'Orange' },
              { value: 'banana', text: 'Banana' },
            ]}
          />

          <TextField fullWidth name="name" label="Name" />
          <PasswordField fullWidth name="password" label="Password" />
          <RadioGroup name="juicy-fruit" aria-labelledby="label" defaultValue="banana">
            <Stack space={16}>
              <RadioButton value="banana">Banana</RadioButton>
              <RadioButton value="apple">Apple</RadioButton>
            </Stack>
          </RadioGroup>
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

export default AssetDetails
