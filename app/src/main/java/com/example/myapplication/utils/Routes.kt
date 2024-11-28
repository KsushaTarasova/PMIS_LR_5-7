package com.example.myapplication.utils

sealed class Routes(val route: String) {
    object MAIN_SCREEN : Routes(Constants.MAIN_SCREEN)
    object INFO_SCREEN : Routes(Constants.INFO_SCREEN)
}