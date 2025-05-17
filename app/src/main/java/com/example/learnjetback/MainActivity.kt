
package com.example.learnjetback

import android.content.res.Resources.Theme
import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
//import androidx.compose.runtime.saveable.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learnjetback.ui.theme.LearnJetbackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnJetbackTheme {
                OnBoardingScreen()
            }
        }
    }
}

//@Composable
//private fun MyApp(){
//    Surface(color = MaterialTheme.colorScheme.background){
//        Greeting(name="Android")
//    }
//}

@Composable
fun Greeting(name: String = "", modifier: Modifier = Modifier) {
    val stateOfButton = remember { mutableStateOf(false) }
    val textButton = remember { mutableStateOf("Show more") }
    val bottomPadding = remember { mutableStateOf(24.dp) }
    //2-
    Card(
        modifier = Modifier,
        elevation = CardDefaults.cardElevation(8.dp)
    ) {  Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Column {
            Row(
                modifier = Modifier.padding(
                    top = 24.dp,
                    bottom = 4.dp,
                    start = 24.dp,
                    end = 24.dp
                )
            ) {
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .padding(bottom = bottomPadding.value)
                ) {
                    Text(text = "Hello, ")
                    Text(
                        text = name, style = MaterialTheme.typography.headlineMedium.copy(
                            fontWeight = FontWeight.ExtraBold
                        )
                    )

                }
//                ElevatedButton(
//                    onClick = {
//                        if (stateOfButton.value == false) {
//                            stateOfButton.value = true
//                            textButton.value = "Show less"
//                            //bottomPadding.value = 100.dp
//
//                        } else {
//                            stateOfButton.value = false
//                            textButton.value = "Show more"
//                            //bottomPadding.value = 24.dp
//                            bottomPadding.value = 0.dp
//                        }
//                    }
//                ) {
//                    Text(text = textButton.value)
//                }

                IconButton(onClick = {
                    if (stateOfButton.value == false) {
                        stateOfButton.value = true
                        textButton.value = "Show less"
                        //bottomPadding.value = 100.dp

                    } else {
                        stateOfButton.value = false
                        textButton.value = "Show more"
                        //bottomPadding.value = 24.dp
                        bottomPadding.value = 0.dp
                    }
                }) {
                    if (stateOfButton.value == false) {
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowDown,
                            contentDescription = ""
                        )
                    } else {
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowUp,
                            contentDescription = ""
                        )
                    }

                }

            }
            if (stateOfButton.value == true) {
                Text(
                    text = ("Composem ipsum color sit lazy, " +
                            "padding theme elit, sed do bouncy. ").repeat(4),
                    modifier = Modifier.padding(bottom = 24.dp, start = 24.dp, end = 24.dp)
                )
            }
        } }


    }
}

@Composable
fun MyApp(names: List<String> = List(100) { "$it" }) {
    //1-
    LazyColumn(modifier = Modifier.padding(vertical = 4.dp)) {
        items(names) {
            Column(modifier = Modifier.padding(vertical = 4.dp)) {
                for (name in names) {
                    Greeting(name = name)
                }
            }
        }

    }

}

@Preview(showBackground = true, widthDp = 320)
@Composable
fun DefaultPreview() {
    LearnJetbackTheme {
        MyApp()
    }

}

@Composable
fun OnBoardingScreen(modifier: Modifier = Modifier) {
    val state = remember { mutableStateOf(false) }

    if (state.value == false) {
        Surface(modifier = modifier) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Text(text = "Welcome to the Basics Codelab!")
                ElevatedButton(onClick = {
                    state.value = true
                }) {
                    Text(text = "Continue")
                }

            }
        }
    } else {
        MyApp()
    }

}


