import React, { useEffect, useState, useImperativeHandle } from 'react'
import { View } from 'react-native'
import { useTranslation } from 'react-i18next'
import { connect } from 'react-redux'
import Metadata from '../../components/metadata/metadata'
import Asset from '../../components/asset/asset'
import styles from './assetWithProperties.styles'

import { Title2, Select, Form, ButtonPrimary} from '@telefonica/mistica'

import AssetActionActions from '../../../modules/asset-action/asset-action-screen.reducer'


const AssetWithProperties = React.forwardRef((props, ref) => {
  const { title, type, create, listOption, finalAction, assetRef, indexAsset, getAsset, assetList, options } = props
  const [name, setName] = useState(listOption || assetRef.assetId )
  const [metadata, setMetadata] = useState(create ? assetRef.metadata ? assetRef.metadata : {} : {})

  assetRef.metadata = metadata
  assetRef.title = title
  assetRef.type = type
  assetRef.assetId = name

  const { t } = useTranslation() //i18n instance

  
  useEffect(() => {
    if(!create && name != null){
      getAsset(false,name,indexAsset)
    }
  }, [name])    

  useEffect(() => {
    if(!create && name != null && assetList[indexAsset] != null){
      setMetadata(assetList[indexAsset].metadata)
      assetRef.data = assetList[indexAsset].data
    }
  }, [assetList[indexAsset]])    

  return (
      <Form onSubmit={(formData) =>{
          setMetadata(formData) 
        }}>
        <View style={styles.row}>
          <View style={styles.titleTable}><Title2>{title}</Title2></View>
            {!create && ( // if the asset not will create, choose to the list of assets
              <Select
                fullWidth
                name={'name'}
                label={t('CHOOSE') + ' ' + type}
                key={'property-name'}
                value={name}
                onChangeValue={(value) => setName(value)}
                options={options}
              />
            )}
            <Asset 
              name={name}
              type={type} 
              final={!create && assetList[indexAsset] ? assetList[indexAsset].metadata.final != null ? assetList[indexAsset].metadata.final : true : false} 
              hash={!create && assetList[indexAsset] ? assetList[indexAsset].hash : null} 
              timestamp={!create && assetList[indexAsset] ? assetList[indexAsset].datetime : null}/>
            {(create || name != null) && (
              <Metadata data={metadata} type={type} create={create} />
            )}
            {create && <ButtonPrimary submit>{t('SAVE')}</ButtonPrimary>}
        </View>
      </Form> 
  )
})

const mapStateToProps = (state) => ({ 
  assetList: state.assetAction.assetList,
})
const mapDispatchToProps = (dispatch) => ({    
  getAsset: (isAuthorised, assetId, index) => dispatch(AssetActionActions.assetActionRequest(isAuthorised, assetId, index)),
})
export default connect(mapStateToProps, mapDispatchToProps)(AssetWithProperties)
