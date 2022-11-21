import React from 'react'
import i18n from '../../config/i18-config'

import HomeScreen from '../../modules/home/home-screen'
import StorybookScreen from '../../../storybook'

import ConfigurationScreen from '../../modules/configuration/configuration-screen'
import AccountScreen from '../../modules/account/account-screen'
import MyAssetsScreen from '../../modules/my-assets/my-assets-screen'
import RegisterScreen from '../../modules/account/register/register-screen'

import { IconUserAccountRegular, IconHomeRegular, IconBoxRegular, IconSettingsRegular, IconAlertRegular } from '@telefonica/mistica'

export const drawerScreens = [
  {
    categoryName: i18n.t('APPLICATION'),
    settings: [
      { title: i18n.t('HOME'), icon: <IconHomeRegular />, component: HomeScreen, auth: true },
      { title: i18n.t('MY_ASSETS'), icon: <IconBoxRegular />, route: 'assets', component: MyAssetsScreen, auth: true },
    ],
  },
  {
    categoryName: i18n.t('PERSONAL_INFORMATION'),
    settings: [{ title: i18n.t('ACCOUNT'), icon: <IconUserAccountRegular />, route: 'account', component: AccountScreen, auth: true }],
  },
  {
    categoryName: i18n.t('CONFIGURATION'),
    settings: [
      {
        title: i18n.t('CONFIGURATION'),
        icon: <IconSettingsRegular />,
        route: 'configuration',
        component: ConfigurationScreen,
        auth: true,
      },
    ],
  },
  {
    categoryName: i18n.t('ADMINITRATION'),
    settings: [
      {
        title: i18n.t('REGISTER'),
        icon: <IconSettingsRegular />,
        route: 'register',
        component: RegisterScreen,
        auth: true,
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
