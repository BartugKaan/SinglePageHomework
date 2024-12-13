package com.example.singlepagehomework

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.singlepagehomework.ui.theme.ButtonBackGround
import com.example.singlepagehomework.ui.theme.ButtonBackGroundDark
import com.example.singlepagehomework.ui.theme.ButtonTextColor
import com.example.singlepagehomework.ui.theme.ButtonTextColorDark
import com.example.singlepagehomework.ui.theme.PrimaryTextColor
import com.example.singlepagehomework.ui.theme.PrimaryTextColorDark
import com.example.singlepagehomework.ui.theme.SinglePageHomeworkTheme
import com.example.singlepagehomework.ui.theme.StarColor
import com.example.singlepagehomework.ui.theme.StarColorDark
import com.example.singlepagehomework.ui.theme.kanit

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SinglePageHomeworkTheme {
                MainScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(darktheme: Boolean = isSystemInDarkTheme()){
    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp
    val screenWidth = configuration.screenWidthDp

    Scaffold(topBar = {
        CenterAlignedTopAppBar(
            title = { Text("JBL E55BT", fontFamily = kanit) },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = if(darktheme) ButtonBackGroundDark else ButtonBackGround,
                titleContentColor = if (darktheme) ButtonTextColorDark else ButtonTextColor
            ),
        )
    }) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(painter = painterResource(R.drawable.jbl55bt), contentDescription = "", Modifier.size((screenHeight/3).dp))
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 15.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        "JBL E55BT",
                        fontSize = 30.sp,
                        color = if (darktheme) PrimaryTextColorDark else PrimaryTextColor,
                    )
                    Text(
                        "$99",
                        fontSize = 30.sp,
                        color = if (darktheme) ButtonBackGroundDark else ButtonBackGround,
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 15.dp)
                ){
                    Icon(Icons.Rounded.Star, contentDescription = "", tint = if(darktheme) StarColorDark else StarColor)
                    Icon(Icons.Rounded.Star, contentDescription = "", tint = if(darktheme) StarColorDark else StarColor)
                    Icon(Icons.Rounded.Star, contentDescription = "", tint = if(darktheme) StarColorDark else StarColor)
                    Icon(Icons.Rounded.Star, contentDescription = "", tint = if(darktheme) StarColorDark else StarColor)
                    Icon(Icons.Rounded.Star, contentDescription = "")
                    Spacer(modifier = Modifier.size(15.dp))
                    Text(" 4.1(620)", color = if (darktheme) ButtonBackGroundDark else ButtonBackGround)
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SinglePageHomeworkTheme {
        MainScreen()
    }
}