package com.example.ordernow.ui.patterns

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.ordernow.R

@OptIn(ExperimentalMaterial3Api::class)

@Preview(name = "topbar")
@Composable
fun AppTopBar() {
   TopAppBar(
       title = {
           Text(text = stringResource(id = R.string.app_name),
               textAlign = TextAlign.Center,
               modifier = Modifier.fillMaxWidth()
           ) },
       colors = TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = MaterialTheme.colorScheme.background)
      
   )

}