package com.mhendrif.elearning

import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Scaffold
import androidx.compose.material.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mhendrif.elearning.component.Banner
import com.mhendrif.elearning.component.Buttons
import com.mhendrif.elearning.component.NameProfile
import com.mhendrif.elearning.component.Title

class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        setContent {
            MyUI()
        }
    }
}

@Preview
@Composable
fun MyUI() {
    val scaffoldState = rememberScaffoldState()

    Scaffold(bottomBar = {
        BottomBar()
    }, floatingActionButton = {
        FloatingActionButton(
            onClick = { /*TODO*/ },
            contentColor = Color.White,
            backgroundColor = Color(android.graphics.Color.parseColor("#fe5b52")))  {
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

@Composable
fun BottomBar() {
    val bottomMenuItems = prepareBottomMenu()
    val context = LocalContext.current.applicationContext
    var selectedItem by remember { mutableStateOf("Profile") }

    BottomAppBar(cutoutShape = CircleShape, backgroundColor = Color(android.graphics.Color.parseColor("#f8f8f8")), elevation = 3.dp) {
        bottomMenuItems.forEachIndexed() { index, bottomMenuItem ->
            if(index == 2) {
                BottomNavigationItem(
                    selected = false,
                    onClick = { /*TODO*/ },
                    icon = { /*TODO*/ },
                    enabled = false
                )
            }
            BottomNavigationItem(
                selected = (selectedItem == bottomMenuItem.label),
                onClick = {
                    selectedItem = bottomMenuItem.label
                    Toast.makeText(context, bottomMenuItem.label, Toast.LENGTH_SHORT).show()
                          },
                icon = { 
                    Icon(painter = bottomMenuItem.icon, contentDescription = bottomMenuItem.label,
                        modifier = Modifier
                            .height(20.dp)
                            .width(20.dp))
                },
                label = {
                    Text(text = bottomMenuItem.label, modifier = Modifier.padding(top = 14.dp))
                },
                alwaysShowLabel = true,
                enabled = true
            )
        }

    }
}

data class BottomMenuItem(val label: String, val icon: Painter)

@Composable
fun prepareBottomMenu(): List<BottomMenuItem> {
    val bottomMenuItems = arrayListOf<BottomMenuItem>()
    bottomMenuItems.add(BottomMenuItem(label = "Home", icon = painterResource(id = R.drawable.bottom_btn1)))
    bottomMenuItems.add(BottomMenuItem(label = "Profile", icon = painterResource(id = R.drawable.bottom_btn2)))
    bottomMenuItems.add(BottomMenuItem(label = "Support", icon = painterResource(id = R.drawable.bottom_btn3)))
    bottomMenuItems.add(BottomMenuItem(label = "Settings", icon = painterResource(id = R.drawable.bottom_btn4)))
    return bottomMenuItems
}