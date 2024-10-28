package com.example.basketballsimulator

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel


/*   This is the MainViewModel

It handles all variables.
The purpose of this is so that we don't lose the data whenever..
    the state is changed.
*/

class MainViewModel: ViewModel() {

    var responseText by mutableStateOf("")

    var nameOne by mutableStateOf("")
    var nameTwo by mutableStateOf("")


    var layupsOne by mutableStateOf("")
    var layupsTwo by mutableStateOf("")

    var midrangeOne by mutableStateOf("")
    var midrangeTwo by mutableStateOf("")

    var threePointOne by mutableStateOf("")
    var threePointTwo by mutableStateOf("")

    var dribblingOne by mutableStateOf("")
    var dribblingTwo by mutableStateOf("")

    var speedOne by mutableStateOf("")
    var speedTwo by mutableStateOf("")

    var reboundingOne by mutableStateOf("")
    var reboundingTwo by mutableStateOf("")

    var stealsOne by mutableStateOf("")
    var stealsTwo by mutableStateOf("")

    var blocksOne by mutableStateOf("")
    var blocksTwo by mutableStateOf("")

    var perimeterOne by mutableStateOf("")
    var perimeterTwo by mutableStateOf("")

    var insideOne by mutableStateOf("")
    var insideTwo by mutableStateOf("")


    fun changeValue(newValue: String, category:String, player: Int){

        if (category == "name"){
            if (player == 1){
                nameOne = newValue
            }
            else {
                nameTwo = newValue
            }
        }

        else if (category == "layups"){
            if (player == 1){
                layupsOne = newValue
            }
            else {
                layupsTwo = newValue
            }
        }

        else if (category == "midrange"){
            if (player == 1){
                midrangeOne = newValue
            }
            else {
                midrangeTwo = newValue
            }
        }

        else if (category == "threepoint"){
            if (player == 1){
                threePointOne = newValue
            }
            else {
                threePointTwo = newValue
            }
        }

        else if (category == "dribbling"){
            if (player == 1){
                dribblingOne = newValue
            }
            else {
                dribblingTwo = newValue
            }
        }

        else if (category == "speed"){
            if (player == 1){
                speedOne = newValue
            }
            else {
                speedTwo = newValue
            }
        }

        else if (category == "rebounding"){
            if (player == 1){
                reboundingOne = newValue
            }
            else {
                reboundingTwo = newValue
            }
        }

        else if (category == "steals"){
            if (player == 1){
                stealsOne = newValue
            }
            else {
                stealsTwo = newValue
            }
        }

        else if (category == "blocks"){
            if (player == 1){
                blocksOne = newValue
            }
            else {
                blocksTwo = newValue
            }
        }

        else if (category == "perimeter"){
            if (player == 1){
                perimeterOne = newValue
            }
            else {
                perimeterTwo = newValue
            }
        }

        else if (category == "inside"){
            if (player == 1){
                insideOne = newValue
            }
            else {
                insideTwo = newValue
            }
        }
    }
}