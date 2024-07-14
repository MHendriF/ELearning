package com.mhendrif.elearning.component

import android.widget.Toast
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mhendrif.elearning.R
import com.mhendrif.elearning.model.BottomMenuItem

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



@Composable
fun prepareBottomMenu(): List<BottomMenuItem> {
    val bottomMenuItems = arrayListOf<BottomMenuItem>()
    bottomMenuItems.add(BottomMenuItem(label = "Home", icon = painterResource(id = R.drawable.bottom_btn1)))
    bottomMenuItems.add(BottomMenuItem(label = "Profile", icon = painterResource(id = R.drawable.bottom_btn2)))
    bottomMenuItems.add(BottomMenuItem(label = "Support", icon = painterResource(id = R.drawable.bottom_btn3)))
    bottomMenuItems.add(BottomMenuItem(label = "Settings", icon = painterResource(id = R.drawable.bottom_btn4)))
    return bottomMenuItems
}

@Preview
@Composable
fun PreviewBottomBar() {
    BottomBar()
}