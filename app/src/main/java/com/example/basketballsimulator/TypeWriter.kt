package com.example.basketballsimulator

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay


@Composable
fun TypeWriter(givenText: String){
    val text = givenText

    var displayedText by remember{ mutableStateOf("") }

    //This is kind of going to be a loop
    LaunchedEffect(Unit){
        //for (i in 0..text.length)
        for(i in 1 until (text.length+1)){
            displayedText = text.substring(0,i)
            delay(10)
        }
    }

    //Essentially, since displayed text will keep on changing
    //The line below will have to recompose again and again
    Text(text = displayedText, fontSize = 25.sp, textAlign = TextAlign.Center )


}