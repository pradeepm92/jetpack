package com.example.jetpackapp

import android.graphics.Paint.Style
import android.view.Surface
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.viewModelFactory
import coil.compose.rememberAsyncImagePainter
import coil.size.Scale
import com.example.jetpackapp.model.Character


@Composable
fun HomeScreen(charcter: Character) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp)
            .padding(10.dp),
        shape = RoundedCornerShape(10.dp),
    ) {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(4.dp),
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(2.dp)
            ) {
                Image(
                    painter = rememberAsyncImagePainter(charcter.image),
                    contentDescription = null,
                    modifier = Modifier.size(128.dp)
                )

//                Image(
//                    painter = painterResource(id = charcter.image),
//                    contentDescription = "image",
//                    modifier = Modifier.fillMaxHeight(),
//                    contentScale = ContentScale.FillBounds )


                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .weight(0.8f)
                ) {
                    Text(
                        text = charcter.name,
                        style = MaterialTheme.typography.titleLarge.copy(fontSize = 16.sp), // Adjust the font size here
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = charcter.gender,
                        style = MaterialTheme.typography.titleLarge.copy(fontSize = 16.sp),
                        fontWeight = FontWeight.Normal
                    )
                    Text(
                        text = charcter.hairColour,
                        style = MaterialTheme.typography.titleLarge.copy(fontSize = 16.sp),
                        fontWeight = FontWeight.Normal
                    )

                }
            }

        }
    }

}


