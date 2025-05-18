package com.example.learnjetback.ui.theme

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learnjetback.R

@Composable
fun AlignYourBodyElement(@DrawableRes image:Int, @StringRes text:Int, modifier: Modifier=Modifier) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ){

        Image(
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(88.dp).clip(CircleShape),
            painter = painterResource(image),
            contentDescription = "null"
        )
        Text(
            text = stringResource(text),
            style = MaterialTheme.typography.labelLarge
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
fun AlignYourBodyElementPreview() {
    LearnJetbackTheme {
        AlignYourBodyElement(R.drawable.ab1_inversions, R.string.ab1_inversions,Modifier.padding(8.dp))
    }
}