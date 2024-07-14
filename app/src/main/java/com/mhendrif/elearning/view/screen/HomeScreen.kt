package com.mhendrif.elearning.view.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mhendrif.elearning.R
import com.mhendrif.elearning.component.Banner
import com.mhendrif.elearning.component.BottomBar
import com.mhendrif.elearning.component.Buttons
import com.mhendrif.elearning.component.NameProfile
import com.mhendrif.elearning.component.Title

@Composable
fun HomeScreen() {
    val scaffoldState = rememberScaffoldState()
    Scaffold(bottomBar = {
        BottomBar()
    }, floatingActionButton = {
        FloatingActionButton(
            onClick = { /*TODO*/ },
            contentColor = Color.White,
            backgroundColor = Color(android.graphics.Color.parseColor("#fe5b52"))
        )  {
            Icon(
                painter = painterResource(id = R.drawable.shopping_cart),
                contentDescription = "add",
                modifier = Modifier
                    .height(30.dp)
                    .width(30.dp)
            )
        }
    }, scaffoldState = scaffoldState,
        isFloatingActionButtonDocked = true,
        floatingActionButtonPosition = androidx.compose.material.FabPosition.Center
    ) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
            .padding(paddingValues = it),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            NameProfile()
            Title()
            Buttons()
            Banner()
        }
    }
}

@Preview
@Composable
fun PreviewHomeScreen() {
    HomeScreen()
}