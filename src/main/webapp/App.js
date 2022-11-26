import * as React from 'react'
import { Provider } from 'react-redux'
import createStore from './app/shared/reducers'
import * as SplashScreen from 'expo-splash-screen'
import { ThemeContextProvider, getTelefonicaSkin } from '@telefonica/mistica'

import NavContainer from './app/navigation/nav-container'
import './app/config/i18-config'

const store = createStore()

const misticaTheme = {
  skin: getTelefonicaSkin(),
  colorScheme: store.getState().appState.theme,
  i18n: { locale: 'es-ES', phoneNumberFormattingRegionCode: 'ES' },
}

function App(props) {
  // prevent the splashscreen from disappearing until the redux store is completely ready (hidden in nav-container.js)
  const [displayApp, setDisplayApp] = React.useState(false)

  React.useEffect(() => {
    if (!displayApp) {
      SplashScreen.preventAutoHideAsync()
        .then(() => setDisplayApp(true))
        .catch(() => setDisplayApp(true))
    }
  }, [displayApp, setDisplayApp])

  return displayApp ? (
    <Provider store={store}>
      <ThemeContextProvider theme={misticaTheme}>
        <NavContainer />
      </ThemeContextProvider>
    </Provider>
  ) : null
}

export default App
