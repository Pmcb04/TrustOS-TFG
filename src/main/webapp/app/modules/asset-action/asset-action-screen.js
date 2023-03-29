import React, { useRef, useState, useEffect } from 'react'
import { View } from 'react-native'
import { connect } from 'react-redux'
import { ThemeContext, ButtonPrimary, IconOfferFilled, 
    Stack, Stepper , ButtonLayout, Box, Text5, Text4, Text10,
    Inline,IconArrowLineRightRegular,IconArrowLineLeftRegular, IconFingerprintRegular, Tag,
    IconLockOpenRegular, IconLockClosedRegular } from '@telefonica/mistica'
import { useTranslation } from 'react-i18next'

import styles from './asset-action-screen.styles'

import TableUpdate from '../../shared/components/table-update/table-update'
import AssetWithProperties from '../../shared/components/asset-with-properties/assetWithProperties'
import AssetActionActions from './asset-action-screen.reducer'

import { addRandomString } from '../../shared/util/asset-image-name'
import { getAction } from './asset-action-screen.util'



function Step(props){
    return (
        <View style={styles.column}>
            {props.list.map((element, index) => {
                
                const listOptions = 
                    [...props.assets]
                        .filter((asset) => asset.assetId.split("@", 1) == element.type) // filter by type 
                        .map((asset) => (
                            { value: asset.assetId, text: asset.assetId }
                        ))
                return <AssetWithProperties 
                        key={element.title + element.type + index}
                        title={element.title} 
                        type={element.type} 
                        create={element.create} 
                        assetRef={element.ref}
                        indexAsset={index}
                        finalAction={props.finalAction}
                        listOption={element.ref.listOption} 
                        options ={listOptions}
                    />     
        })}
        </View>
    )
}


function TableResume(props) {
    const { colors } = React.useContext(ThemeContext)
    const {title, type, create, assetId, metadata, stepFinal} = props
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
                <Text4 light key={'type-state'}>{t('STATE')}</Text4>
                    <Inline>
                        {!stepFinal && props.final && <Inline>
                            <Tag Icon={IconLockOpenRegular} type="success">{t('OPEN')}</Tag>
                            <IconArrowLineRightRegular key={'arrow'} size={16} />
                            <Tag Icon={IconLockClosedRegular} type="error">{t('CLOSED')}</Tag>
                        </Inline>}
                        {stepFinal && <Inline>
                            <Tag Icon={IconLockOpenRegular} type="success">{t('OPEN')}</Tag>
                        </Inline>}
                    </Inline>
                </Inline>
                <Inline key={"inline-type"} alignItems='center' space='between'>
                    <Text4 light key={'type-name'}>{t('TYPE')}</Text4>
                    <Tag Icon={IconFingerprintRegular} type="active">{type ? type : 'Asset'}</Tag>
                </Inline>

                <Inline key={"inline-title"} alignItems='center' space='between'>
                    <Text4 light key={'title-name'}>{t('TITLE')}</Text4> 
                    <Text4 light key={'title'}>{title}</Text4>
                </Inline>
            </View>
            <View key={"table-view"} style={styles.column}>
                <TableUpdate key={'table'} dataBefore={{}} dataAfter={metadata} />
            </View>
        </View>

    )
}

function AssetActionScreen(props) {
    const { action, final } = props.route.params
    const { assetAction, assets, reset, createAsset, updateAsset, fetching, error, actions, getActions, actionsList} = props
    const { colors } = React.useContext(ThemeContext)
    const { t } = useTranslation() //i18n instance

    const steps = [t('INPUT'),t('ACTION'),t('OUTPUT'),t('FINAL')]

    const { stepInput, stepAction, stepOutput } = getAction(action)

    // set the ref in each element
    {[stepInput, stepAction, stepOutput].map((step, index) => {
        {step.map((element, indexElement) => {  
            element.ref = useRef({})
        })}
    })}

    // set one element the asset selected in asset details page
    const found = stepInput.find(element => element.type === assetAction.data.type);
    found ? found.ref.listOption = assetAction.assetId : null

    const [step, setStep] = useState(0)
    const [errorNextStep, setErrorNextStep] = useState(false)

    function metadataIsEmpty(metadata){
        return Object.keys(metadata).length == 0
    }

    const stepDecrement = () => {
        setStep((prevStep) => prevStep - 1)
        setErrorNextStep(false)
    }
    const stepIncrement = () => {
        if(![stepInput, stepAction, stepOutput][step].some((element => metadataIsEmpty(element.ref.metadata)))){
            setErrorNextStep(false)
            setStep((prevStep) => prevStep + 1)
        }else{
            setErrorNextStep(true)
        }
    }

    useEffect(() => {
        reset()
        getActions(stepInput.concat(stepAction, stepOutput))
    }, [])  


    function chooseAssetId(element){
        if(!element.ref.assetId)
            element.ref.assetId = addRandomString(element.type)

        return element.ref.assetId
    }

    function tablesSteps(final){
        return (
            <Box>
                {[stepInput, stepAction, stepOutput].map((step, index) => {
                    return (
                    <View key={"step-" + index} style={styles.tablesSteps}>
                        <View style={styles.titleTable}><Text5 key={"title-" + index} decoration='underline'>{steps[index]}</Text5></View>
                        {step.map((element, index) => (
                            <TableResume 
                                key={element.title + index}
                                create={element.create} 
                                type={element.ref.type} 
                                title={element.ref.title} 
                                final={final}
                                assetId={chooseAssetId(element)} 
                                stepFinal={step === stepOutput}
                                metadata={element.ref.metadata}>
                            </TableResume>
                        ))}
                    </View>)
                })}
            </Box>        
        )
    }

    function createAssets(){

        // function getActionsMetadata(index){
        //     let metadataActions = {}
        //     actionsList[index] ? actionsList[index].map((action) => metadataActions[action.name.trim().replace(" ", "_")] = 0) : null
        //     return metadataActions
        // }

        {[stepInput, stepAction, stepOutput].map((step, indexStep) => {
            {step.map((element, indexElement) => { 

                let newMetadata = {...element.ref.metadata}

                // always close the action because you cant do anything with the action 
                // and known that the action it is done
                if(step == stepAction) newMetadata.final = true 
                else {
                // closed asset in the step input
                if(step == stepInput && final == true) {
                    newMetadata.final = true
                }else {
                    newMetadata.final = false
                }
                }

          
 
                if(element.create) {
                    // let newActions = getActionsMetadata(indexStep + indexElement + (indexStep != 0 ? 1 : 0)) 
                    // newMetadata.actions = newActions
                    let newAsset = {
                        assetId: element.ref.assetId,
                        metadata: newMetadata,
                        data: { 
                            type: element.ref.type, 
                            assetBefore: [stepInput, stepAction, stepOutput][indexStep - 1].map((element => element.ref.assetId)), 
                        }
                    }
                    createAsset(newAsset)
                }else {
                    let newActions = {...newMetadata.actions}
                    if(newActions[action.trim().replace(' ', '_')]){
                        newActions[action.trim().replace(' ', '_')] += 1
                    }
                    else{
                        newActions[action.trim().replace(' ', '_')] = 1
                    }
                    newMetadata.actions = newActions
                    let updateNewAsset = {
                        assetId: element.ref.assetId,
                        metadata: newMetadata,
                        data: element.ref.data
                    }
                    updateAsset(updateNewAsset)

                }

            })}
        })}

        props.navigation.navigate(t('MY_ASSETS')) // vamos a la pantalla de la lista de assets

    }

  return (
    <>
      {!actions.some((a) => a.name === action) && (
        <View style={[styles.loading, { backgroundColor: colors.background }]}>
          <View style={styles.loadingText}>
            <Text10>You don't create the {action} action</Text10>
          </View>
        </View>
      )}
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
      {!error && actions.some((a) => a.name === action) && (
      <View style={[styles.container, { backgroundColor: colors.background }]}>
       <Stack space={32}>
            <Stepper currentIndex={step} steps={steps} aria-label="Progress" />
            <ButtonLayout align="center">
                <ButtonPrimary onPress={stepDecrement} disabled={step === 0}>
                    <IconArrowLineLeftRegular color="currentColor"/>
                    {t('PREVIOUS')}
                </ButtonPrimary>
                <ButtonPrimary onPress={stepIncrement} disabled={step === steps.length - 1}>
                    {t('NEXT')}
                    <IconArrowLineRightRegular color="currentColor"/>
                </ButtonPrimary>
            </ButtonLayout>
            {errorNextStep && <View style={{textAlign: 'center'}}><Text4 color={colors.error}>{t('ERROR_NEXT_STEP')}</Text4></View>}
            <View style={ styles.table}>
                {step == 0 && (<Step assets={assets} finalAction={false} list={stepInput}></Step>)}
                {step == 1 && (<Step assets={assets} finalAction={true} list={stepAction}></Step>)}
                {step == 2 && (<Step assets={assets} finalAction={false} list={stepOutput}></Step>)}
                {step == 3 && (<View style={styles.column}> 
                                    <Text4 key="text"><IconOfferFilled key="icon" size={32}/>{t('NEW')}</Text4>
                                    {tablesSteps(final)}
                                    <ButtonPrimary onPress={() => createAssets()}>
                                    {t('CREATE')}
                                    </ButtonPrimary>
                                </View>
                )}                                
            </View>
        </Stack>
      </View>
      )}
      </>
    )
}

const mapStateToProps = (state) => ({ 
    assetAction : state.assetDetails.asset, 
    assets: state.myAssets.assets,
    fetching: state.assetDetails.fetching,
    error: state.assetDetails.error,
    actions: state.assetDetails.actions,
    actionsList: state.assetAction.actionsList,
})
const mapDispatchToProps = (dispatch) => ({    
    reset: () => dispatch(AssetActionActions.assetActionReset()),
    createAsset: (newAsset) => dispatch(AssetActionActions.assetActionCreate(newAsset)),
    updateAsset: (asset) => dispatch(AssetActionActions.assetActionUpdate(asset)),
    getActions: (assetType, index) => dispatch(AssetActionActions.assetActionActionRequest(assetType, index)),
})
export default connect(mapStateToProps, mapDispatchToProps)(AssetActionScreen)
