package net.reader128k

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dagger.hilt.android.AndroidEntryPoint
import net.reader128k.compose.Reader128kApp
import net.reader128k.compose.SplashScreen
import net.reader128k.ui.theme.Reader128kTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Reader128kTheme {
                Reader128kApp()
            }
//            Reader128kTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    SplashScreen()
//                }
//            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun SplashScreenPreview() {
    Reader128kTheme {
        SplashScreen()
    }
}