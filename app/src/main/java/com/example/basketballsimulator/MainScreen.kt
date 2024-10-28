package com.example.basketballsimulator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.basketballsimulator.APIFiles.ChatRequest
import com.example.basketballsimulator.APIFiles.Message
import com.example.basketballsimulator.APIFiles.OpenAIService
import com.example.basketballsimulator.ui.theme.basketballColor


//This is the Composable for the Main Screen
@Composable
fun MainScreen(viewModel: MainViewModel, navController: NavController, openAIService: OpenAIService, modifier: Modifier = Modifier.fillMaxSize()){


    //This is the Main Column which holds everything
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())) {


        //Header Column
        Column(modifier = Modifier.background(basketballColor), horizontalAlignment = Alignment.CenterHorizontally) {
            Spacer(modifier = Modifier.height(24.dp))
            Text(text = "Welcome to the Basketball 1v1 Simulator!", fontSize = 25.sp, textAlign = TextAlign.Center)
            Spacer(modifier = Modifier.height(12.dp))
        }


        //This Column holds only the text at the top.
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Spacer(modifier = Modifier.height(24.dp))
            Text(text = "Ever wondered who would win in a 1v1 between you and your friend?", fontSize = 18.sp)

            Text(text = "Find out now! Enter your names and attributes below and click START to see who would win!", fontSize = 18.sp)
            Spacer(modifier = Modifier.height(36.dp))
            Text(text = "Enter a number out from 50-100 for the attributes. DO NOT PUT ANY LETTERS", fontSize = 18.sp)
            Spacer(modifier = Modifier.height(36.dp))
        }



        //This Column holds all the boxes for the attributes
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceEvenly) {


            //Names Row
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceAround) {
                Column() {
                    Text(text = "Player 1 Name")
                    OutlinedTextField(modifier = Modifier.width(150.dp).padding(top = 5.dp), value = viewModel.nameOne, onValueChange = {viewModel.changeValue(it,"name",1)})
                }

                Column() {
                    Text(text = "Player 2 Name")
                    OutlinedTextField(modifier = Modifier.width(150.dp).padding(top = 5.dp), value = viewModel.nameTwo, onValueChange = {viewModel.changeValue(it,"name",2)})
                }
            }
            Spacer(modifier = Modifier.height(24.dp))






            //Layups Row
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceAround) {
                Column() {
                    Text(text = "Layups")
                    OutlinedTextField(modifier = Modifier.width(150.dp).padding(top = 5.dp), value = viewModel.layupsOne, onValueChange = {viewModel.changeValue(it,"layups",1)})
                }

                Column() {
                    Text(text = "Layups")
                    OutlinedTextField(modifier = Modifier.width(150.dp).padding(top = 5.dp), value = viewModel.layupsTwo, onValueChange = {viewModel.changeValue(it,"layups",2)})
                }
            }
            Spacer(modifier = Modifier.height(24.dp))



            //Midrange Row
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceAround) {
                Column() {
                    Text(text = "Midrange")
                    OutlinedTextField(modifier = Modifier.width(150.dp).padding(top = 5.dp), value = viewModel.midrangeOne, onValueChange = {viewModel.changeValue(it,"midrange",1)})
                }

                Column() {
                    Text(text = "Midrange")
                    OutlinedTextField(modifier = Modifier.width(150.dp).padding(top = 5.dp), value = viewModel.midrangeTwo, onValueChange = {viewModel.changeValue(it,"midrange",2)})
                }
            }
            Spacer(modifier = Modifier.height(24.dp))

            //3PT Row
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceAround) {
                Column() {
                    Text(text = "3PT")
                    OutlinedTextField(modifier = Modifier.width(150.dp).padding(top = 5.dp), value = viewModel.threePointOne, onValueChange = {viewModel.changeValue(it,"threepoint",1)})
                }

                Column() {
                    Text(text = "3PT")
                    OutlinedTextField(modifier = Modifier.width(150.dp).padding(top = 5.dp), value = viewModel.threePointTwo, onValueChange = {viewModel.changeValue(it,"threepoint",2)})
                }
            }
            Spacer(modifier = Modifier.height(24.dp))

            //Dribbling Row
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceAround) {
                Column() {
                    Text(text = "Dribbling")
                    OutlinedTextField(modifier = Modifier.width(150.dp).padding(top = 5.dp), value = viewModel.dribblingOne, onValueChange = {viewModel.changeValue(it,"dribbling",1)})
                }

                Column() {
                    Text(text = "Dribbling")
                    OutlinedTextField(modifier = Modifier.width(150.dp).padding(top = 5.dp), value = viewModel.dribblingTwo, onValueChange = {viewModel.changeValue(it,"dribbling",2)})
                }
            }
            Spacer(modifier = Modifier.height(24.dp))

            //Speed Row
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceAround) {
                Column() {
                    Text(text = "Speed")
                    OutlinedTextField(modifier = Modifier.width(150.dp).padding(top = 5.dp), value = viewModel.speedOne, onValueChange = {viewModel.changeValue(it,"speed",1)})
                }

                Column() {
                    Text(text = "Speed")
                    OutlinedTextField(modifier = Modifier.width(150.dp).padding(top = 5.dp), value = viewModel.speedTwo, onValueChange = {viewModel.changeValue(it,"speed",2)})
                }
            }
            Spacer(modifier = Modifier.height(24.dp))

            //Rebounding Row
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceAround) {
                Column() {
                    Text(text = "Rebounding")
                    OutlinedTextField(modifier = Modifier.width(150.dp).padding(top = 5.dp), value = viewModel.reboundingOne, onValueChange = {viewModel.changeValue(it,"rebounding",1)})
                }

                Column() {
                    Text(text = "Rebounding")
                    OutlinedTextField(modifier = Modifier.width(150.dp).padding(top = 5.dp), value = viewModel.reboundingTwo, onValueChange = {viewModel.changeValue(it,"rebounding",2)})
                }
            }
            Spacer(modifier = Modifier.height(24.dp))

            //Steal Row
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceAround) {
                Column() {
                    Text(text = "Steals")
                    OutlinedTextField(modifier = Modifier.width(150.dp).padding(top = 5.dp), value = viewModel.stealsOne, onValueChange = {viewModel.changeValue(it,"steals",1)})
                }

                Column() {
                    Text(text = "Steals")
                    OutlinedTextField(modifier = Modifier.width(150.dp).padding(top = 5.dp), value = viewModel.stealsTwo, onValueChange = {viewModel.changeValue(it,"steals",2)})
                }
            }
            Spacer(modifier = Modifier.height(24.dp))

            //Block Row
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceAround) {
                Column() {
                    Text(text = "Blocks")
                    OutlinedTextField(modifier = Modifier.width(150.dp).padding(top = 5.dp), value = viewModel.blocksOne, onValueChange = {viewModel.changeValue(it,"blocks",1)})
                }

                Column() {
                    Text(text = "Blocks")
                    OutlinedTextField(modifier = Modifier.width(150.dp).padding(top = 5.dp), value = viewModel.blocksTwo, onValueChange = {viewModel.changeValue(it,"blocks",2)})
                }
            }
            Spacer(modifier = Modifier.height(24.dp))

            //Perimeter Defense Row
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceAround) {
                Column() {
                    Text(text = "Perimeter Defense")
                    OutlinedTextField(modifier = Modifier.width(150.dp).padding(top = 5.dp), value = viewModel.perimeterOne, onValueChange = {viewModel.changeValue(it,"perimeter",1)})
                }

                Column() {
                    Text(text = "Perimeter Defense")
                    OutlinedTextField(modifier = Modifier.width(150.dp).padding(top = 5.dp), value = viewModel.perimeterTwo, onValueChange = {viewModel.changeValue(it,"perimeter",2)})
                }
            }
            Spacer(modifier = Modifier.height(24.dp))

            //Inside Defense Row
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceAround) {
                Column() {
                    Text(text = "Inside Defense")
                    OutlinedTextField(modifier = Modifier.width(150.dp).padding(top = 5.dp), value = viewModel.insideOne, onValueChange = {viewModel.changeValue(it,"inside",1)})
                }

                Column() {
                    Text(text = "Inside Defense")
                    OutlinedTextField(modifier = Modifier.width(150.dp).padding(top = 5.dp), value = viewModel.insideTwo, onValueChange = {viewModel.changeValue(it,"inside",2)})
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceAround) {
                Button(onClick = {

                    var question ="I want you to create a half court 1 v 1 simulator for basketball. I will give you the stats/skill attributes for two different players. These are out of 100. If any attribute is missing, make it 75. I want you to create a play-by-play simulator and see who will win this 1 v 1. Make it up to 5 points. Ensure that the simulator does not go on for infinite plays. Do not give me any rules or plays. I want your answer to be divided in paragraphs by plays, but don't mention 'Play 1', etc. Display play by play. I am not asking for code or anything like that. I just want you to start displaying the game. At the end of the game, create a new paragraph, stating Who won and the Score\n" +
                            "\n" +
                            "First Player:${viewModel.nameOne}\n" +
                            "Layups:${viewModel.layupsOne}\n" +
                            "Midrange:${viewModel.midrangeOne}\n" +
                            "3pt shooting:${viewModel.threePointOne}\n" +
                            "dribbling:${viewModel.dribblingOne}\n" +
                            "speed:${viewModel.midrangeOne}\n" +
                            "rebounding:${viewModel.reboundingOne}\n" +
                            "steals:${viewModel.stealsOne}\n" +
                            "blocks:${viewModel.blocksOne}\n" +
                            "perimeter defense:${viewModel.perimeterOne}\n" +
                            "inside defense:${viewModel.midrangeOne}\n" +
                            "Second Player:${viewModel.nameTwo}\n" +
                            "Layups:${viewModel.layupsTwo}\n" +
                            "Midrange:${viewModel.midrangeTwo}\n" +
                            "3pt shooting:${viewModel.threePointTwo}\n" +
                            "dribbling:${viewModel.dribblingTwo}\n" +
                            "speed:${viewModel.speedTwo}\n" +
                            "rebounding:${viewModel.reboundingTwo}\n" +
                            "steals:${viewModel.stealsTwo}\n" +
                            "blocks:${viewModel.blocksTwo}\n" +
                            "perimeter defense:${viewModel.perimeterTwo}\n" +
                            "inside defense:${viewModel.insideTwo}"


                    val request = ChatRequest(model = "gpt-3.5-turbo", messages = listOf(Message(role = "user", content = question)))
                    openAIService.getChatCompletion(request, { response -> response?.choices?.get(0)?.message?.content?.let { viewModel.responseText = it} }, {error -> viewModel.responseText = error})

                    navController.navigate(Screens.GameResults.route)},

                    modifier = Modifier.width(180.dp).height(60.dp)) {
                    Text(text = "See the Results", fontSize = 18.sp)}
            }
            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}
