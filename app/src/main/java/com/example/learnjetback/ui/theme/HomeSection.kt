package com.example.learnjetback.ui.theme

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learnjetback.R

@Composable
fun HomeSection(
    @StringRes title: Int,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {

    Column(modifier = modifier) {
        Text(
            text = stringResource(title).uppercase(),
            style = MaterialTheme.typography.labelMedium,
            modifier = Modifier
                .paddingFromBaseline(top = 40.dp, bottom = 8.dp)
                .padding(horizontal = 16.dp)
        )
    }
    content()

}


@Composable
@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
fun HomeSectionPreview() {
    LearnJetbackTheme {
        HomeSection(
            title = R.string.align_your_body
        ) {
            AlignYourBodyRow()
        }

    }
}