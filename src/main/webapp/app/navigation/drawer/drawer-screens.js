import React from 'react'
import i18n from '../../config/i18-config'

import HomeScreen from '../../modules/home/home-screen'
import LoginScreen from '../../modules/login/login-screen'
import EntityStackScreen from '../entity-stack'
import StorybookScreen from '../../../storybook'

import ConfigurationScreen from '../../modules/configuration/configuration-screen'
import AccountScreen from '../../modules/account/account-screen'
import MyAssetsScreen from '../../modules/my-assets/my-assets-screen'

import { IconUserAccountRegular, IconHomeRegular, IconBoxRegular, IconSettingsRegular, IconAlertRegular } from '@telefonica/mistica'

export const drawerScreens = [
  {
    categoryName: i18n.t('APPLICATION'),
    settings: [
      { title: i18n.t('HOME'), icon: <IconHomeRegular />, component: HomeScreen, auth: null },
      { title: i18n.t('MY_ASSETS'), icon: <IconBoxRegular />, route: 'assets', component: MyAssetsScreen, auth: false },
      { title: i18n.t('LOGIN'), icon: <IconBoxRegular />, route: 'login', component: LoginScreen, auth: false },
    ],
  },
  {
    categoryName: i18n.t('PERSONAL_INFORMATION'),
    settings: [{ title: i18n.t('ACCOUNT'), icon: <IconUserAccountRegular />, route: 'account', component: AccountScreen, auth: false }],
  },
  {
    categoryName: i18n.t('CONFIGURATION'),
    settings: [
      {
        title: i18n.t('CONFIGURATION'),
        icon: <IconSettingsRegular />,
        route: 'configuration',
        component: ConfigurationScreen,
        auth: false,
      },
    ],
  },
]

if (__DEV__) {
  drawerScreens.push({
    categoryName: i18n.t('DEV'),
    settings: [{ title: i18n.t('STORYBOOK'), icon: <IconAlertRegular />, route: 'storybook', component: StorybookScreen, auth: false }],
  })
}
