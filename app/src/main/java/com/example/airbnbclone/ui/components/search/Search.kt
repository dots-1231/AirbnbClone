package com.example.airbnbclone.ui.components.search

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.airbnbclone.ui.core.extensions.light
import com.example.airbnbclone.ui.theme.AirbnbCloneTheme
import com.example.airbnbclone.ui.theme.spacing

@Composable
fun Search(
    title: String,
    location: String,
    dates: String,
    guests: String,
    searchIcon: ImageVector
) {
    AirbnbCloneTheme {
        Button(
            modifier = Modifier.padding(),
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(24.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    modifier = Modifier.padding(
                        end = MaterialTheme.spacing.small4,
                    ),
                    imageVector = searchIcon,
                    contentDescription = "search icon"
                )
                Column {
                    Text(text = title, style = MaterialTheme.typography.labelMedium)
                    Row(
                        modifier = Modifier.padding(top = MaterialTheme.spacing.small2)
                    ) {
                        Text(
                            modifier = Modifier
                                .padding(end = MaterialTheme.spacing.small4),
                            text = location,
                            style = MaterialTheme.typography.labelSmall.light
                        )
                        Text(
                            modifier = Modifier
                                .padding(end = MaterialTheme.spacing.small4),
                            text = dates,
                            style = MaterialTheme.typography.labelSmall.light
                        )
                        Text(
                            modifier = Modifier
                                .padding(end = MaterialTheme.spacing.small4),
                            text = guests,
                            style = MaterialTheme.typography.labelSmall.light
                        )
                    }
                }
            }
        }
    }

}

@Preview(

)
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