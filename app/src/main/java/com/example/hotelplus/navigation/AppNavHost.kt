package com.example.hotelplus.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.hotelplus.ui.theme.screens.about.AboutScreen
import com.example.hotelplus.ui.theme.screens.booking.BookingScreen
import com.example.hotelplus.ui.theme.screens.login.LoginScreen
import com.example.hotelplus.ui.theme.screens.signup.SignupScreen
import com.example.hotelplus.ui.theme.screens.splash.SplashScreen
import com.example.hotelpus.ui.theme.screens.home.HomeScreen
import com.example.hotelplus.ui.theme.screens.products.AddProductsScreen
import com.example.hotelplus.ui.theme.screens.products.ViewProductsScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASH
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController = navController)
        }

        composable(ROUT_ABOUT) {
            AboutScreen(navController = navController)
        }

        composable(ROUT_SPLASH) {
            SplashScreen(navController = navController)
        }

        composable(ROUT_SIGNUP) {
            SignupScreen(navController = navController)
        }

        composable(ROUT_LOGIN) {
            LoginScreen(navController = navController)
        }
        composable(ROUT_BOOKING) {
            BookingScreen(navController = navController)
        }
        composable(ADD_PRODUCTS_URL) {
            AddProductsScreen(navController = navController)
        }
        composable(VIEW_PRODUCTS_URL) {
            ViewProductsScreen(navController = navController)
        }
        composable(ROUT_CITY) {
            BookingScreen(navController = navController)
        }
        composable(ROUT_SUBURBAN) {
            BookingScreen(navController = navController)
        }
        composable(ROUT_BEACH) {
            BookingScreen(navController = navController)
        }
        composable(ROUT_COUNTRY) {
            BookingScreen(navController = navController)
        }
    }
}
