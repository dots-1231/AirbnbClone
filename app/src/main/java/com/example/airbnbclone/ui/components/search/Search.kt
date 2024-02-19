package com.example.airbnbclone.ui.components.search

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.airbnbclone.ui.core.extensions.light
import com.example.airbnbclone.ui.theme.AirbnbCloneTheme
import com.example.airbnbclone.ui.theme.spacing

@Composable
fun Search(
    modifier: Modifier = Modifier,
    title: String,
    location: String,
    dates: String,
    guests: String,
    searchIcon: ImageVector = Icons.Rounded.Search
) {
    AirbnbCloneTheme {
        Button(
            modifier = modifier.shadow(4.dp, shape = RoundedCornerShape(32.dp)),
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(32.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    modifier = Modifier
                        .size(40.dp)
                        .padding(
                            end = MaterialTheme.spacing.small4,
                        )
                    ,
                    imageVector = searchIcon,
                    contentDescription = "search icon"
                )
                Column {
                    Text(text = title, style = MaterialTheme.typography.labelLarge)
                    Row(
                        modifier = Modifier.padding(top = MaterialTheme.spacing.small1)
                    ) {
                        SearchSubHeaderText(text = location)
                        SearchSubHeaderText(text = dates)
                        SearchSubHeaderText(text = guests, showSeparator = false)
                    }
                }
            }
        }
    }

}

@Composable
private fun SearchSubHeaderText(
    modifier: Modifier = Modifier,
    text: String,
    showSeparator: Boolean = true
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.labelSmall.light
        )
        Box(
            modifier = Modifier.padding(horizontal = MaterialTheme.spacing.small3),
            contentAlignment = Alignment.Center
        ) {
            if (showSeparator) {
                Text("•", style = MaterialTheme.typography.labelMedium.light)
            }

        }

    }
}

@Preview
@Composable
fun SearchPreview() {
    AirbnbCloneTheme {
        Search(
            title = "Where to?",
            location = "Anywhere",
            dates = "Any week",
            guests = "Add guests",
            searchIcon = Icons.Rounded.Search
        )
    }
}