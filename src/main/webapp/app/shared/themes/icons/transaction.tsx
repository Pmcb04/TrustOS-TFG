import * as React from 'react'
import Svg, { Path } from 'react-native-svg'
import { SVG } from './svg'

const Product = ({ width, height }: SVG) => (
  <Svg width={width} height={height}>
    <Svg width={width} height={height}>
      <Svg viewBox="0 0 24 24" width={width} height={height}>
        <Path
          fill="#0026af"
          d="M17,7.25H12.8a.747.747,0,0,1-.624-.334l-1.11-1.664a2.246,2.246,0,0,0-1.872-1H7A4.756,4.756,0,0,0,2.25,9v7A4.756,4.756,0,0,0,7,20.75H17A4.756,4.756,0,0,0,21.75,16V12A4.756,4.756,0,0,0,17,7.25ZM20.25,16A3.254,3.254,0,0,1,17,19.25H7A3.254,3.254,0,0,1,3.75,16V9A3.254,3.254,0,0,1,7,5.75H9.2a.747.747,0,0,1,.624.334l1.11,1.664a2.246,2.246,0,0,0,1.872,1H17A3.254,3.254,0,0,1,20.25,12Z"
          data-name="package-Regular"
        />
      </Svg>
    </Svg>
  </Svg>
)

export default Product
