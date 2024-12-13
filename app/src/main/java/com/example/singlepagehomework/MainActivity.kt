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
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.FavoriteBorder
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.singlepagehomework.ui.theme.ButtonBackGround
import com.example.singlepagehomework.ui.theme.ButtonBackGroundDark
import com.example.singlepagehomework.ui.theme.ButtonTextColor
import com.example.singlepagehomework.ui.theme.ButtonTextColorDark
import com.example.singlepagehomework.ui.theme.PrimaryTextColor
import com.example.singlepagehomework.ui.theme.PrimaryTextColorDark
import com.example.singlepagehomework.ui.theme.SecondaryTextColor
import com.example.singlepagehomework.ui.theme.SecondaryTextColorDark
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
            navigationIcon = {
                Icon(Icons.Rounded.ArrowBack, contentDescription = "", tint = if (darktheme) ButtonTextColorDark else ButtonTextColor )
            },
            actions = {
                Icon(Icons.Rounded.FavoriteBorder, contentDescription = "", tint = if (darktheme) ButtonTextColorDark else ButtonTextColor , modifier = Modifier.padding(end = 10.dp))
            }

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
                        stringResource(R.string.price),
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
            Column(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 15.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start
            ) {
                Text(stringResource(R.string.about_title), fontSize = 20.sp)
                Text(
                    stringResource(R.string.about_desc),
                    color = if (darktheme) SecondaryTextColorDark else SecondaryTextColor
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 15.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(stringResource(R.string.color_title), fontSize = 20.sp, color = if (darktheme) PrimaryTextColorDark else PrimaryTextColor)
                Row (
                    modifier = Modifier.width(120.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                    ){
                    ColorButton(Color.Blue)
                    ColorButton(Color.Red)
                    ColorButton(Color.Black)
                }
            }
            Button(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 15.dp),
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (darktheme) ButtonBackGroundDark else ButtonBackGround,
                    contentColor = if (darktheme) ButtonTextColorDark else ButtonTextColor)
                ) {
                Text( stringResource(R.string.cart_button_title),fontSize = 25.sp)
                Spacer(modifier = Modifier.width(20.dp))
                Icon(Icons.Rounded.ShoppingCart, contentDescription = "")
            }
        }
    }
}


@Composable
fun ColorButton(ButtonColor: Color){
    Button(
        modifier = Modifier.size(30.dp),
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            containerColor = ButtonColor
        )
    ) {
        Text("")
    }
}


@Preview(showBackground = true, locale = "tr")
@Composable
fun GreetingPreview() {
    SinglePageHomeworkTheme {
        MainScreen()
    }
}