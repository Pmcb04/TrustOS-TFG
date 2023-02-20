import React, { useEffect, useState, useImperativeHandle } from 'react'
import { View } from 'react-native'
import { useTranslation } from 'react-i18next'
import { connect } from 'react-redux'
import Metadata from '../../components/metadata/metadata'
import Asset from '../../components/asset/asset'
import styles from './assetWithProperties.styles'
import TableUpdate from '../table-update/table-update'

import { Title2, Select, Form, ButtonPrimary, confirm, Text3, Text6} from '@telefonica/mistica'

import AssetActionActions from '../../../modules/asset-action/asset-action-screen.reducer'


const AssetWithProperties = React.forwardRef((props, ref) => {
  const { title, type, create, listOption, assetRef, indexAsset, assets, getAsset, assetList } = props
  const [name, setName] = useState(listOption || assetRef.assetId )
  const [metadata, setMetadata] = useState(create ? assetRef.current : {})
  
  assetRef.current = metadata
  assetRef.title = title
  assetRef.type = type
  assetRef.assetId = name

  const { t } = useTranslation() //i18n instance
  const options = assets.filter((asset) => asset.assetId.includes(type)).map((asset) => ({ value: asset.assetId, text: asset.assetId }))
  
  useEffect(() => {
    if(!create && name != null){
      getAsset(false,name,indexAsset)
    }
  }, [name])    

  useEffect(() => {
    if(!create && name != null && assetList[indexAsset] != null){
      setMetadata(assetList[indexAsset].metadata)
    }
  }, [assetList[indexAsset]])  

  console.log("list option", listOption, "assetId", assetRef.assetId)

  return (
      <Form onSubmit={(formData) => setMetadata(formData)}>
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
            <Asset name={name} type={type} hash={!create && assetList[indexAsset] ? assetList[indexAsset].hash : null}/>
            {(create || name != null) && (
              <Metadata data={metadata} type={type} create={create} />
            )}
            {create && <ButtonPrimary submit>{t('SAVE')}</ButtonPrimary>}
        </View>
      </Form> 
  )
})

const mapStateToProps = (state) => ({ 
  assets: state.myAssets.assets,
  assetList: state.assetAction.assetList,
})
const mapDispatchToProps = (dispatch) => ({    
  getAsset: (isAuthorised, assetId, index) => dispatch(AssetActionActions.assetActionRequest(isAuthorised, assetId, index)),
})
export default connect(mapStateToProps, mapDispatchToProps)(AssetWithProperties)
