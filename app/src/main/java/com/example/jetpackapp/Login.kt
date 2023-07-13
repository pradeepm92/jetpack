package com.example.jetpackapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Login() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.nature), contentDescription = "login",
            modifier = Modifier
                .fillMaxSize()
                .blur(6.dp),
            contentScale = ContentScale.Crop
        )
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .alpha(0.3f)
            .clip(
                CutCornerShape(
                    topEnd = 10.dp,
                    bottomEnd = 20.dp,
                    topStart = 20.dp,
                    bottomStart = 10.dp
                )
            )
            .background(color = Color.White)
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(40.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LoginHeader()
            LoginFields()
            LoginFooter()
        }
    }
}

@Composable
fun LoginFooter() {
    TODO("Not yet implemented")
}

@Composable
fun LoginFields() {

}

@Composable
fun LoginHeader() {
  Text(text = "Welcome Back ", fontSize =35.sp, fontWeight = FontWeight.ExtraBold , )
    Text(text = "Sign In To Continue", fontSize =25.sp, fontWeight = FontWeight.SemiBold , )
}
@Composable
fun field(Value:String,label:String, placeholder:String,
          VisualTransformation:VisualTransformation= androidx.compose.ui.text.input.VisualTransformation.None,
          onvaluechange:(String)-> Unit){
    OutlinedTextField(
        value = Value,
        onValueChange = onvaluechange,
        label ={Text(text = label) },
        placeholder={Text(text = placeholder)},
        VisualTransformation = VisualTransformation,

    )
}
