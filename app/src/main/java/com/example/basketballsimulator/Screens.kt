package com.example.basketballsimulator


/*   This is the Screens class.

A route name and Screen Objects are created for each page

 */
sealed class Screens(val route: String) {
    object MainScreen: Screens("main_screen")
    object GameResults: Screens("result_screen")
}