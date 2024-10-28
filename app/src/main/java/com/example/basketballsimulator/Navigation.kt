package com.example.basketballsimulator

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.basketballsimulator.APIFiles.OpenAIService


/*   This is the Navigation.

It controls how each page is opened.

It takes viewModel and NavController as parameters.

NavController is how each page is opened.

The route variables are taken from the 'Screen' class
 */



@Composable
fun Navigation(viewModel: MainViewModel = MainViewModel(), navController: NavHostController = rememberNavController()){

    lateinit var openAIService: OpenAIService
    openAIService = OpenAIService("WRITE YOUR API KEY HERE")

    NavHost(navController = navController, startDestination = Screens.MainScreen.route){
        //Main Screen
        composable(Screens.MainScreen.route){
            MainScreen(viewModel, navController, openAIService)
        }

        //Game Result
        composable(Screens.GameResults.route){
            GameResult(viewModel, navController, openAIService, )
        }
    }

}


