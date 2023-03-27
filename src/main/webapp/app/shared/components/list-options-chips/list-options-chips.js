import React from 'react'
import { Text3, Inline, RadioGroup, RadioButton, Chip } from '@telefonica/mistica'

const ListOptionsChips = (props) => {
  const { title, options, defaultOption, callback } = props

  return (
    <Inline space={16}>
      <Text3>{title}</Text3>
      <RadioGroup onChange={(value) => callback(value)} name="chip-offset" defaultValue={defaultOption}>
        <Inline space={16}>
          {options.map((element) => (
            <RadioButton
              key={element.value}
              value={element.value}
              render={({ checked, labelId }) => (
                <Chip active={checked} id={labelId}>
                  {element.icon}
                </Chip>
              )}
            />
          ))}
        </Inline>
      </RadioGroup>
    </Inline>
  )
}

export default ListOptionsChips
