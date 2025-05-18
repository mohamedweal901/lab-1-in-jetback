
package com.example.learnjetback

import BottomNavigationComponent
import android.content.res.Resources.Theme
import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.learnjetback.ui.theme.HomeScreen
import com.example.learnjetback.ui.theme.LearnJetbackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnJetbackTheme {
                Scaffold(bottomBar = {BottomNavigationComponent()}){
                    paddingValues -> HomeScreen(modifier = Modifier.padding(paddingValues))

                }
            }
        }
    }
}