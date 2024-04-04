package com.example.myapplication.BottomNavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavGraph(
    navHostController: NavHostController
) {
    NavHost(navController = navHostController, startDestination = "Скрин_1")
    {
        composable("Скрин_1") {
            Screen1()
        }
        composable("Скрин_2") {
            Screen2()
        }
        composable("Скрин_3") {
            Screen3()
        }
        composable("Скрин_4") {
            Screen4()
        }
    }
}