package com.mhendrif.elearning.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.mhendrif.elearning.R

@Composable
fun Banner() {
    Row(modifier = Modifier.padding(top = 16.dp)) {
        Text(text = "Popular Courses",
            color = Color.Black,
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.weight(1f)
        )
        Text(text = "See all",
            color = Color(android.graphics.Color.parseColor("#389ef2")),
            fontSize = 16.sp,
        )
    }
    ConstraintLayout(modifier = Modifier
        .fillMaxWidth()
        .height(120.dp)
        .padding(top = 32.dp)
        .border(
            1.dp,
            Color(android.graphics.Color.parseColor("#fbe6dd")),
            shape = RoundedCornerShape(25.dp)
        )
        .background(
            brush = Brush.horizontalGradient(
                colors = listOf(
                    Color.White,
                    Color(android.graphics.Color.parseColor("#fbe6dd"))
                )
            ), shape = RoundedCornerShape(25.dp)
        )
    ) {
        val (img, text) = createRefs()
        Image(
            modifier = Modifier
                .constrainAs(img) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    end.linkTo(parent.end)
                }
                .padding(end = 16.dp),
                painter = painterResource(id = R.drawable.ai),
                contentDescription = null,
            )
        Text(text = "Advance certificate\n" + "Progress in AI",
            color = Color.Black,
            fontSize = 18.sp,
            modifier = Modifier
                .padding(start = 16.dp)
                .constrainAs(text) {
                    start.linkTo(parent.start)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                }
        )
    }
}

@Preview
@Composable
fun PreviewBanner() {
    Banner()
}