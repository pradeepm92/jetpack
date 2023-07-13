package com.example.jetpackapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.*
import com.example.jetpackapp.ui.theme.JetpackAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Blue
                ) {
                    Splash()
                }
            }
        }
    }
}

@Composable
fun Splash() {

    val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.dog))
    var isplaying by remember {
        mutableStateOf(true)
    }
    val progress by animateLottieCompositionAsState(composition = composition, isPlaying = isplaying, )
    LaunchedEffect(key1 = progress ){
        if (progress==0f){
            isplaying=true
        }
        if (progress==1f){
            isplaying= false
        }
    }



   Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
       LottieAnimation (modifier = Modifier.height(400.dp),composition = composition , progress = {progress})

       Button(onClick = {isplaying=true}, colors = ButtonDefaults.buttonColors(Color.Yellow), modifier = Modifier.wrapContentWidth().wrapContentHeight()) {

           Text(text = "play Again", color = Color.Black)
       }
   }

}




