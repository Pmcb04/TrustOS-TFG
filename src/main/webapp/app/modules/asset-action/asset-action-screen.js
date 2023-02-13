import React, { useRef, useState, useEffect } from 'react'
import { View } from 'react-native'
import { connect } from 'react-redux'
import { ThemeContext, ButtonPrimary, IconOfferFilled, 
    Stack, Stepper , ButtonLayout, Box, Text5, Text4, Text3,
    Inline,IconArrowLineRightRegular,IconArrowLineLeftRegular } from '@telefonica/mistica'
import { useTranslation } from 'react-i18next'

import styles from './asset-action-screen.styles'

import { TYPES } from '../../shared/util/nodes-types'
import { NAMES } from '../../shared/util/nodes-names'

import TableUpdate from '../../shared/components/table-update/table-update'
import AssetWithProperties from '../../shared/components/asset-with-properties/assetWithProperties'

import { addRandomString } from '../../shared/util/asset-image-name'

import AssetActionActions from './asset-action-screen.reducer'

function AssetActionScreen(props) {
    const { action } = props.route.params
    const { assetAction, assets, reset} = props
    const { colors } = React.useContext(ThemeContext)
    const { t } = useTranslation() //i18n instance

    useEffect(() => {
        reset()
      }, [])  

    const texts = [t('INPUT'),t('ACTION'),t('OUTPUT'),t('FINAL')]

    const [step, setStep] = useState(0)

    const stepDecrement = () => {setStep((prevStep) => prevStep - 1)}
    const stepIncrement = () => {setStep((prevStep) => prevStep + 1)}

    const step_input = [
        {
            title: NAMES.PANTALON,
            type: assetAction.data.type,
            create: false,
            ref: useRef({})
        },
        {
            title: NAMES.PANTALON,
            type: assetAction.data.type,
            listOption: assetAction.assetId,
            create: false,
            ref: useRef({})
        }
    ]

    const step_action = [
        {
            title: NAMES.ROMPER,
            type: action,
            create: true,
            ref: useRef({})
        }
    ]

    const step_output = [
        {
            title: NAMES.TERNERO,
            type: TYPES.TERNERO,
            create: true,
            ref: useRef({})
        },
        {
            title: NAMES.TERNERO,
            type: TYPES.TERNERO,
            create: true,
            ref: useRef({})
        },
        {
            title: NAMES.TERNERO,
            type: TYPES.TERNERO,
            create: true,
            ref: useRef({})
        },
    ]

    function saveStateStep(step){
        switch (step) {
            case 0:
                {step_input.map((element, index) => (   
                    console.log(element.ref)
                ))}
                break;
            case 1:
                {step_action.map((element, index) => (   
                    console.log(element.ref)
                ))}
                break;
            case 2:
                {step_output.map((element, index) => (   
                    console.log(element.ref)
                ))}
                break;
            default:
                break;
        }        
    }

    function tablesSteps(){
        return (
            <Box>
                {[step_input, step_action, step_output].map((step, index) => {
                    return (
                    <View key={"step-" + index} style={styles.tablesSteps}>
                        <View style={styles.titleTable}><Text5 key={"title-" + index} decoration='underline'>{texts[index]}</Text5></View>
                        {step.map((element, index) => (  
                            <TableResume 
                                key={element.title + index}
                                create={element.create} 
                                type={element.ref.type} 
                                title={element.ref.title} 
                                assetId={element.ref.assetId ? element.ref.assetId : addRandomString(element.type)} 
                                current={element.ref.current}>
                            </TableResume>
                        ))}
                    </View>)
                })}
            </Box>        
        )
    }
      
    function Step(props){
        return (
            <View style={styles.column}>
                {props.list.map((element, index) => (
                    <AssetWithProperties 
                        key={element.title + element.type + index}
                        title={element.title} 
                        type={element.type} 
                        create={element.create} 
                        assetRef={element.ref}
                        indexAsset={index}
                        listOption={element.listOption} />     
                ))}
            </View>
        )
    }
    
    function TableResume(props) {
        const { colors } = React.useContext(ThemeContext)
        const {title, type, create, assetId, current} = props
        const { t } = useTranslation() //i18n instance
    
        return (
            <View style={[styles.table,styles.borderTable, { borderColor: colors.border }]} key={"box"}>
                <View key={"information"} style={styles.column}>
                    <Inline key={"inline-assetid"} alignItems='center' space='between'>
                        <Text5 key={'assetId-name'}>Asset ID</Text5>
                        <Inline space={4} key={"inline"}>
                            {create && <IconOfferFilled key={"icon-new"} size={32}/>}
                            <Text5 key={'assetId'}>{assetId}</Text5>
                        </Inline>
                    </Inline>
    
                    <Inline key={"inline-type"} alignItems='center' space='between'>
                        <Text4 light key={'type-name'}>{t('TYPE')}</Text4>
                        <Text4 light key={'type'}>{type}</Text4>
                    </Inline>
    
                    <Inline key={"inline-title"} alignItems='center' space='between'>
                        <Text4 light key={'title-name'}>{t('TITLE')}</Text4> 
                        <Text4 light key={'title'}>{title}</Text4>
                    </Inline>
                </View>
                <View key={"table-view"} style={styles.column}>
                    <TableUpdate key={'table'} dataBefore={{}} dataAfter={current} />
                </View>
            </View>
    
        )
    }

  return (
    // <Form onSubmit={(formData) => console.log(formData)}>
      <View style={[styles.container, { backgroundColor: colors.background }]}>
       {/* <ButtonPrimary submit>{t('SAVE')}</ButtonPrimary> */}
       <Stack space={32}>
            <Stepper currentIndex={step} steps={texts} aria-label="Progress" />
            <ButtonLayout align="center">
                <ButtonPrimary onPress={stepDecrement} disabled={step === 0}>
                    <IconArrowLineLeftRegular color="currentColor"/>
                    {t('PREVIOUS')}
                </ButtonPrimary>
                <ButtonPrimary onPress={stepIncrement} disabled={step === texts.length - 1}>
                    {t('NEXT')}
                    <IconArrowLineRightRegular color="currentColor"/>
                </ButtonPrimary>
                {/* <ButtonPrimary onPress={() => saveStateStep(step)}>
                    STATES
                </ButtonPrimary> */}
            </ButtonLayout>
            <View style={ styles.table}>
                {step == 0 && (<Step assets={assets} list={step_input}></Step>)}
                {step == 1 && (<Step list={step_action}></Step>)}
                {step == 2 && (<Step list={step_output}></Step>)}
                {step == 3 && (<View style={styles.column}> 
                                    <Text4 key="text"><IconOfferFilled key="icon" size={32}/>{t('NEW')}</Text4>
                                    {tablesSteps()}
                                </View>
                )}                                
            </View>
            
        </Stack>
      
      </View>
    // </Form>
  )
}

const mapStateToProps = (state) => ({ 
    assetAction : state.assetDetails.asset, 
    assets: state.myAssets.assets,
})
const mapDispatchToProps = (dispatch) => ({    
    reset: () => dispatch(AssetActionActions.assetActionReset()),
})
export default connect(mapStateToProps, mapDispatchToProps)(AssetActionScreen)
