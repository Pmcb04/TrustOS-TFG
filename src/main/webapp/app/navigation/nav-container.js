import * as React from 'react'
import { AppState, Text, useWindowDimensions, View } from 'react-native'
import * as Linking from 'expo-linking'
import * as SplashScreen from 'expo-splash-screen'
import { NavigationContainer } from '@react-navigation/native'
import { createDrawerNavigator } from '@react-navigation/drawer'
import { createStackNavigator } from '@react-navigation/stack'
import { useReduxDevToolsExtension } from '@react-navigation/devtools'
import { connect } from 'react-redux'

import { drawerScreens } from './drawer/drawer-screens'

import AccountActions from '../shared/reducers/account.reducer'
import DrawerContent from './drawer/drawer-content'
import { isReadyRef, navigationRef } from './nav-ref'
import NotFound from './not-found-screen'
import { ModalScreen } from './modal-screen'
import { DrawerButton } from './drawer/drawer-button'

import AssetDetailsScreen from '../modules/asset-details/asset-details-screen'
import AssetTraceabilityScreen from '../modules/asset-traceability/asset-traceability-screen'
import AssetCreateScreen from '../modules/asset-create/asset-create-screen'
import AssetActionScreen from '../modules/asset-action/asset-action-screen'

export const getDrawerRoutes = () => {
  const routes = {}
  drawerScreens.forEach((category) => {
    category.settings.map((setting) => {
      if (setting.route) {
        routes[setting.title] = setting.route
      }
    })
  })
  return routes
}

const linking = {
  prefixes: ['rnapp://', Linking.makeUrl('/')],
  config: {
    initialRouteName: 'Home',
    screens: {
      Home: {
        screens: {
          ...getDrawerRoutes(),
        },
      },
      AssetDetails: 'asset',
      AssetCreate: 'asset/create',
      AssetAction: 'asset/action',
      AssetTraceability: 'asset/traceability',
      ModalScreen: 'alert',
      NotFound: '*',
    },
  },
}

const Stack = createStackNavigator()
const Drawer = createDrawerNavigator()

const getScreens = (isAuthed) => {
  return drawerScreens.map((category, index) => {
    return category.settings.map((setting) => {
      if (setting.auth === null || setting.auth === undefined) {
        return <Drawer.Screen name={setting.title} component={setting.component} options={setting.options} key={index} />
      } else if (setting.auth === isAuthed) {
        return <Drawer.Screen name={setting.title} component={setting.component} options={setting.options} key={index} />
      }
    })
  })
}

function NavContainer(props) {
  const { loaded, getAccount } = props
  const dimensions = useWindowDimensions()
  const moreDimension = dimensions.width >= 768
  const lastAppState = 'active'
  const isAuthed = props.account !== null

  React.useEffect(() => {
    return () => {
      isReadyRef.current = false
    }
  }, [])

  React.useEffect(() => {
    if (loaded) {
      SplashScreen.hideAsync()
    }
  }, [loaded])

  React.useEffect(() => {
    const subscription = AppState.addEventListener('change', (nextAppState) => {
      if (lastAppState.match(/inactive|background/) && nextAppState === 'active') {
        getAccount()
      }
    })

    return () => {
      subscription.remove()
    }
  }, [getAccount])

  useReduxDevToolsExtension(navigationRef)

  return !loaded ? (
    <View>
      <Text>Loading...</Text>
    </View>
  ) : (
    <NavigationContainer
      linking={linking}
      ref={navigationRef}
      onReady={() => {
        isReadyRef.current = true
      }}>
      <Stack.Navigator
        screenOptions={{
          headerShown: !moreDimension,
        }}>
        <Stack.Screen name="Home" options={{ headerShown: false }}>
          {() => (
            <Drawer.Navigator
              drawerContent={(p) => <DrawerContent {...p} />}
              initialRouteName={drawerScreens[0].title}
              drawerType={moreDimension ? 'permanent' : 'slide'}
              screenOptions={{ headerShown: !moreDimension, headerLeft: DrawerButton }}>
              {getScreens(isAuthed)}
            </Drawer.Navigator>
          )}
        </Stack.Screen>
        <Stack.Screen
          name="ModalScreen"
          component={ModalScreen}
          options={{
            headerShown: false,
            cardStyle: { backgroundColor: 'transparent' },
            cardOverlayEnabled: true,
            cardStyleInterpolator: ({ current: { progress } }) => ({
              cardStyle: {
                opacity: progress.interpolate({
                  inputRange: [0, 0.5, 0.9, 1],
                  outputRange: [0, 0.25, 0.7, 1],
                }),
              },
              overlayStyle: {
                opacity: progress.interpolate({
                  inputRange: [0, 1],
                  outputRange: [0, 0.5],
                  extrapolate: 'clamp',
                }),
              },
            }),
          }}
        />
        <Stack.Screen name="NotFound" component={NotFound} options={{ title: 'Oops!' }} />
        <Stack.Screen name="AssetDetails" component={AssetDetailsScreen} />
        <Stack.Screen name="AssetTraceability" component={AssetTraceabilityScreen} />
        <Stack.Screen name="AssetCreate" component={AssetCreateScreen} />
        <Stack.Screen name="AssetAction" component={AssetActionScreen} />
      </Stack.Navigator>
    </NavigationContainer>
  )
}

const mapStateToProps = (state) => {
  return {
    loaded: state.appState.rehydrationComplete,
    account: state.account.account,
  }
}

const mapDispatchToProps = (dispatch) => {
  return {
    getAccount: () => dispatch(AccountActions.accountRequest()),
  }
}

export default connect(mapStateToProps, mapDispatchToProps)(NavContainer)
