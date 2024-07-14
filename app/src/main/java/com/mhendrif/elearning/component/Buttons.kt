package com.mhendrif.elearning.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mhendrif.elearning.R

@Composable
fun Buttons() {
    Row(modifier = Modifier
        .padding(top = 24.dp)
        .fillMaxWidth()
    ) {
        Column(modifier = Modifier
            .weight(0.5f)
            .height(170.dp)
            .padding(end = 12.dp)
            .background(
                color = Color(android.graphics.Color.parseColor("#37c9bb")),
                shape = RoundedCornerShape(20.dp)
            )
            .padding(top = 16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.btn_1),
                contentDescription = null,
                modifier = Modifier
                    .height(65.dp)
                    .width(65.dp)
            )
            Text(
                text = "Developing",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.White
            )
        }
        Column(modifier = Modifier
            .weight(0.5f)
            .height(170.dp)
            .padding(start = 12.dp)
            .background(
                color = Color(android.graphics.Color.parseColor("#ff9d43")),
                shape = RoundedCornerShape(20.dp)
            )
            .padding(top = 16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.btn_2),
                contentDescription = null,
                modifier = Modifier
                    .height(65.dp)
                    .width(65.dp)
            )
            Text(
                text = "Designing",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.White
            )
        }
    }
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 24.dp)
    ) {
        Column(modifier = Modifier
            .weight(0.5f)
            .height(170.dp)
            .padding(end = 12.dp)
            .background(
                color = Color(android.graphics.Color.parseColor("#f36095")),
                shape = RoundedCornerShape(20.dp)
            )
            .padding(top = 16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.btn_3),
                contentDescription = null,
                modifier = Modifier
                    .height(65.dp)
                    .width(65.dp)
            )
            Text(
                text = "AI & ML",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.White
            )
        }
        Column(modifier = Modifier
            .weight(0.5f)
            .height(170.dp)
            .padding(start = 12.dp)
            .background(
                color = Color(android.graphics.Color.parseColor("#389ef2")),
                shape = RoundedCornerShape(20.dp)
            )
            .padding(top = 16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.btn_4),
                contentDescription = null,
                modifier = Modifier
                    .height(65.dp)
                    .width(65.dp)
            )
            Text(
                text = "Explorer",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.White
            )
        }
    }
}

@Preview
@Composable
fun PreviewButtons() {
    Buttons()
}