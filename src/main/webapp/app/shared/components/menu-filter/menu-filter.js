import React from 'react'
import { View } from 'react-native'
import styles from './menu-filter.styles'
import { RadioGroup, RowList, Row, Text5, Text3, Divider, Checkbox, RadioButton, Inline, Chip, Boxed } from '@telefonica/mistica'
import { ScrollView } from 'react-native-gesture-handler'
import { useTranslation } from 'react-i18next'
import { connect } from 'react-redux'
import MyAssetsActions from '../../../modules/my-assets/my-assets-screen.reducer'

function MenuFilter(props) {
  const { t } = useTranslation()
  const { changeOffset, offset, setOrder, order } = props
  return (
    <ScrollView>
      <Boxed>
        <View style={[styles.order, styles.dataFilter]}>
          <View style={styles.title}>
            <Text5>{t('ORDER')}</Text5>
          </View>
          <RadioGroup defaultValue={order} onChange={(value) => setOrder(value)}>
            <RowList>
              <Row title={<Text3>{t('ALPHABETIC')}</Text3>} radioValue="natural" />
              <Row title={<Text3>{t('ALPHABETIC_REVERSE')}</Text3>} radioValue="inverse" />
            </RowList>
          </RadioGroup>
        </View>

        <View style={styles.divider}>
          <Divider />
        </View>

        <View style={[styles.offset, styles.dataFilter]}>
          <View style={styles.title}>
            <Text5>{t('SHOW')}</Text5>
          </View>
          <RadioGroup onChange={(value) => changeOffset(value)} name="chip-offset" defaultValue={offset}>
            <Inline space={'evenly'} alignItems="center">
              <RadioButton
                value={5}
                render={({ checked, labelId }) => (
                  <Chip active={checked} id={labelId}>
                    5
                  </Chip>
                )}
              />
              <RadioButton
                value={10}
                render={({ checked, labelId }) => (
                  <Chip active={checked} id={labelId}>
                    10
                  </Chip>
                )}
              />
              <RadioButton
                value={20}
                render={({ checked, labelId }) => (
                  <Chip active={checked} id={labelId}>
                    20
                  </Chip>
                )}
              />
              <RadioButton
                value={30}
                render={({ checked, labelId }) => (
                  <Chip active={checked} id={labelId}>
                    30
                  </Chip>
                )}
              />
            </Inline>
          </RadioGroup>
        </View>

        <View style={styles.divider}>
          <Divider />
        </View>

        <View style={[styles.authorizathed, styles.dataFilter]}>
          <View style={styles.title}>
            <Text5>{t('AUTHORIZATHED')}</Text5>
          </View>
          <Inline space={'evenly'} alignItems="center">
            <Checkbox
              name="authorizathed-yes"
              render={({ labelId, checked }) => (
                <Chip active={checked} id={labelId}>
                  {t('YES')}
                </Chip>
              )}
            />
            <Checkbox
              name="authorizathed-no"
              render={({ labelId, checked }) => (
                <Chip active={checked} id={labelId}>
                  {t('NO')}
                </Chip>
              )}
            />
          </Inline>
        </View>
      </Boxed>
    </ScrollView>
  )
}
const mapStateToProps = (state) => {
  return {
    offset: state.myAssets.offset,
    order: state.myAssets.order,
  }
}
const mapDispatchToProps = (dispatch) => {
  return {
    changeOffset: (changeOffset) => dispatch(MyAssetsActions.myAssetsChangeOffset(changeOffset)),
    setOrder: (order) => dispatch(MyAssetsActions.myAssetsSetOrder(order)),
  }
}
export default connect(mapStateToProps, mapDispatchToProps)(MenuFilter)
