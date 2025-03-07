package org.example.project

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SecondPage(onNavigateBack: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Second Page",
            style = MaterialTheme.typography.h4,
            modifier = Modifier.padding(bottom = 24.dp)
        )

        Text(
            text = "This is the content of your second page",
            modifier = Modifier.padding(bottom = 24.dp)
        )

        Button(onClick = onNavigateBack) {
            Text("Go Back")
        }
    }
}