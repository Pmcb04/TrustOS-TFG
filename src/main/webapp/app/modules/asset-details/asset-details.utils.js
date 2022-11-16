import React from 'react'
import Property from '../../shared/components/property/property'
import PropertyBox from '../../shared/components/property-box/property-box'
import { Select, TextField, Title1, IntegerField, DecimalField, DoubleField, Switch } from '@telefonica/mistica'

export function process(data, edit_fields) {
  return Object.keys(data).map((key, index) => {
    if (Array.isArray(data[key])) {
      return (
        <Property key={`property-${key}-${index}`} primaryKey={key} edit={edit_fields} title={key} value={data[key]}>
          <Select
            name={key}
            label={key}
            key={key}
            options={[
              // TODO opciones por generacion de codigo?
              // ver como podemos guardar el dato del asset y la lista de opciones.
              { value: 'orange', text: 'Orange' },
              { value: 'banana', text: 'Banana' },
            ]}
          />
        </Property>
      )
    } else if (typeof data[key] === 'object') {
      return <PropertyBox title={key} key={key} primaryKey={key} field={process(data[key], edit_fields)} />
    } else if (typeof data[key] === 'number') {
      if (data[key] % 1 === 0)
        return (
          <Property key={`property-${key}-${index}`} primaryKey={key} edit={edit_fields} title={key} value={data[key]}>
            <IntegerField defaultValue={data[key].toString()} key={key} name={key} label={key} />
          </Property>
        )
      else
        return (
          <Property key={`property-${key}-${index}`} primaryKey={key} edit={edit_fields} title={key} value={data[key]}>
            <DecimalField defaultValue={data[key].toString()} key={key} name={key} label={key} />
          </Property>
        )
    } else if (typeof data[key] === 'boolean') {
      return (
        <Property key={`property-${key}-${index}`} primaryKey={key} edit={edit_fields} title={key} value={data[key]}>
          <DoubleField>
            <Title1>{key}</Title1>
            <Switch defaultValue={data[key]} name={key} />
          </DoubleField>
        </Property>
      )
    } else {
      return (
        <Property key={`property-${key}-${index}`} primaryKey={key} edit={edit_fields} title={key} value={data[key]}>
          <TextField defaultValue={data[key].toString()} key={key} name={key} label={key} />
        </Property>
      )
    }
  })
}

export function copyAssetMetadata(metadata, newMetadata) {
  let metadataCopy = {}
  Object.keys(metadata).map((key) => {
    if (typeof metadata[key] === 'object' && !Array.isArray(metadata[key])) {
      metadataCopy[key] = copyAssetMetadata(metadata[key], newMetadata)
    } else {
      metadataCopy[key] = parseType(newMetadata[key])
    }
  })

  return metadataCopy
}

function parseType(str) {
  if (!isNaN(parseFloat(str))) {
    return parseFloat(str)
  }
  if (!isNaN(parseInt(str, 10))) {
    return parseInt(str, 10)
  }

  return str
}
