package com.example.basketballsimulator

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.navigation.NavController
import androidx.compose.ui.Modifier
import com.example.basketballsimulator.APIFiles.OpenAIService


@Composable
fun GameResult(viewModel: MainViewModel, navController: NavController, openAIService: OpenAIService, modifier: Modifier = Modifier
    .fillMaxSize()
    .verticalScroll(rememberScrollState())){

    if (viewModel.responseText == ""){
        Column(modifier = modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
            LoadingAnimation()
        }
    }

    else{
        Column(modifier = modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
            TypeWriter(viewModel.responseText)
        }
    }

}