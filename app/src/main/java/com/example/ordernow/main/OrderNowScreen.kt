package com.example.ordernow.main

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ordernow.ui.patterns.AppTopBar
import com.example.ordernow.ui.patterns.OrderNowBottomBar
import com.example.ordernow.ui.patterns.bottom


@OptIn(ExperimentalMaterial3Api::class)
@Preview(name = "bottom")
@Composable
fun OrderNowScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.onBackground
    ) {
        Scaffold(
            bottomBar = {OrderNowBottomBar()},
            topBar = {AppTopBar()}
        ) {}
    }

    }
