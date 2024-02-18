package com.example.airbnbclone.ui.components.search

import android.graphics.drawable.Drawable
import android.graphics.drawable.Icon
import android.graphics.drawable.shapes.Shape
import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.airbnbclone.R
import com.example.airbnbclone.ui.theme.AirbnbCloneTheme

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
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(24.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = searchIcon,
                    contentDescription = "search icon",
                )
                Column {
                    Text(text = title)
                    Row {
                        Text(location)
                        Text(dates)
                        Text(guests)
                    }
                }
            }
        }
    }

}

@Preview(
    showBackground = true
)
@Composable
fun SearchPreview() {
    AirbnbCloneTheme {
        Search(
            title = "Where to?",
            location = "Anywhere",
            dates = "Any week",
            guests = "Add guest",
            searchIcon = Icons.Rounded.Search
        )
    }
}