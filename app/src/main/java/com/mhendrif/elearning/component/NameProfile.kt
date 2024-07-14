package com.mhendrif.elearning.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
fun NameProfile() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 32.dp)) {
        Image(
            painter = painterResource(id = R.drawable.user_1),
            contentDescription = null,
            modifier = Modifier
                .width(55.dp)
                .height(55.dp)
                .clickable { }
        )
        Box(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp)
            .height(40.dp)
            .align(alignment = Alignment.CenterVertically)
        ) {
            Text(
                text = "Hi, Hendri",
                color = Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}

@Preview
@Composable
fun PreviewNameProfile() {
    NameProfile()
}