package com.example.learnjetback.ui.theme

import BottomNavigationComponent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learnjetback.R

@Composable
fun HomeScreen(modifier: Modifier = Modifier){
    Column(modifier = modifier.verticalScroll(rememberScrollState())){
        SearchBar(modifier = Modifier.padding(horizontal = 16.dp))
        HomeSection(title = R.string.align_your_body) {
            AlignYourBodyRow()
        }


        HomeSection(title = R.string.favorite_collections) {
            FavoriteCollectionsGrid()
        }



    }
}



@Composable
@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
fun HomeScreenPreview(){
    LearnJetbackTheme {
        HomeScreen()
    }

}