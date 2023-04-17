package com.example.artspaceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.artspaceapp.ui.theme.ArtSpaceAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ArtSpaceApp()
                }
            }
        }
    }
}

@Composable
fun ArtSpaceApp(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Row(modifier = modifier.weight(7.5f).fillMaxSize().background(Color.Blue)) {
            ArtImage()
        }
        Row(modifier = modifier.weight(1.5f).background(Color.Yellow)) {
            ArtDescription()
        }
        Row(modifier = modifier.weight(1f).background(Color.Red)) {
            ArtNavigation()
        }
    }

}

@Composable
fun ArtImage(modifier: Modifier = Modifier) {
    Column(
        modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(painter = painterResource(id = R.drawable.mona_lisa), contentDescription = null)
    }
}

@Composable
fun ArtDescription(modifier: Modifier = Modifier) {
    Column() {
        Text(text = stringResource(id = R.string.mona_lisa_title))
        Text(text = stringResource(id = R.string.mona_lisa_author))
    }
}

@Composable
fun ArtNavigation(modifier: Modifier = Modifier) {
    Row() {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Previous")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Next")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun ArtSpaceAppPreview() {
    ArtSpaceAppTheme {
        ArtSpaceApp()
    }
}