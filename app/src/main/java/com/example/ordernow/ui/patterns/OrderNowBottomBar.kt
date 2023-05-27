package com.example.ordernow.ui.patterns

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ordernow.ui.theme.orange

@Preview(name = "btm")
@Composable
fun OrderNowBottomBar() {
    val selectedIndex = remember { mutableStateOf(0) }
    Box(modifier = Modifier.fillMaxWidth().height(75.dp)) {
        NavigationBar(
            tonalElevation = 16.dp,
            containerColor = Color.White,
        ) {
            NavigationBarItem(
                selected = (selectedIndex.value == 0),
                onClick = { selectedIndex.value = 0},
                icon = { Icon(Icons.Filled.Home, contentDescription = "Home")},
                label = { Text(text = "Home")},
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = orange,
                    selectedTextColor = orange,
                    unselectedIconColor = Color.Gray,
                    unselectedTextColor = Color.Gray
                ),
            )
            NavigationBarItem(
                selected = (selectedIndex.value == 1),
                onClick = { selectedIndex.value = 1},
                icon = { Icon(Icons.Filled.ShoppingCart, contentDescription = "Cart")},
                label = { Text(text = "Cart")},
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = orange,
                    selectedTextColor = orange,
                    unselectedIconColor = Color.Gray,
                    unselectedTextColor = Color.Gray
                ),
            )
        }
    }


}

@Composable
fun bottom(){
    var selectedItem by remember { mutableStateOf(0) }
    val items = listOf("Songs", "Artists", "Playlists")

    NavigationBar {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = { Icon(Icons.Filled.Favorite, contentDescription = item) },
                label = { Text(item) },
                selected = selectedItem == index,
                onClick = { selectedItem = index }
            )
        }
    }
}