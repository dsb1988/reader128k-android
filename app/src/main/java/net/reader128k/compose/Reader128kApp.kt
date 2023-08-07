package net.reader128k.compose

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Reader128kApp() {
    val navController = rememberNavController()
    Reader128kNavHost(navController = navController)
}

@Composable
fun Reader128kNavHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "splash") {
        composable("splash") {
            SplashScreen()
        }
    }
}