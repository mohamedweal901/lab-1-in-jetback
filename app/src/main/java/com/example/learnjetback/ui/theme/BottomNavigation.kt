import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.learnjetback.ui.theme.LearnJetbackTheme

@Composable
fun BottomNavigationComponent(
    modifier: Modifier = Modifier
) {
    var selectedItem by remember { mutableStateOf(0) }

    NavigationBar(modifier = modifier) {
        NavigationBarItem(
            selected = selectedItem == 0,
            onClick = { selectedItem = 0 },
            icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
            label = { Text("Home") }
        )

        NavigationBarItem(
            selected = selectedItem == 1,
            onClick = { selectedItem = 1 },
            icon = { Icon(Icons.Default.Favorite, contentDescription = "Favorites") },
            label = { Text("Favorites") }
        )
    }
}


@Composable
@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
fun BottomNavigationComponentPreview() {
    LearnJetbackTheme {
        BottomNavigationComponent()
    }
}
