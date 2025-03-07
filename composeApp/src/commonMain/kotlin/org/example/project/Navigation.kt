package org.example.project

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue


enum class Screen {
    Home,
    Second
}

@Composable
fun AppNavigation() {
    var currentScreen by remember { mutableStateOf(Screen.Home) }

    when (currentScreen) {
        Screen.Home -> HomePage { currentScreen = Screen.Second }
        Screen.Second -> SecondPage { currentScreen = Screen.Home }
    }
}