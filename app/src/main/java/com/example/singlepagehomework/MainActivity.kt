package com.example.singlepagehomework

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import com.example.singlepagehomework.ui.theme.SinglePageHomeworkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SinglePageHomeworkTheme {

            }
        }
    }
}

@Composable
fun MainScreen(darktheme: Boolean = isSystemInDarkTheme()){
    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp

}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SinglePageHomeworkTheme {

    }
}