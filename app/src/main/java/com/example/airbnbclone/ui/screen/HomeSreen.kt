package com.example.airbnbclone.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.airbnbclone.ui.components.search.Search
import com.example.airbnbclone.ui.theme.AirbnbCloneTheme
import com.example.airbnbclone.ui.theme.spacing

@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            Row(
                modifier = Modifier.padding(all = MaterialTheme.spacing.medium)
            ) {
                Search(
                    modifier = Modifier.padding(all = MaterialTheme.spacing.small4),
                    title = "Where to?" ,
                    location = "Anywhere",
                    dates = "Any week",
                    guests = "Add guest")
            }

        }
    ) {
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("Screen content")
        }

    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    AirbnbCloneTheme {
        HomeScreen()
    }
}