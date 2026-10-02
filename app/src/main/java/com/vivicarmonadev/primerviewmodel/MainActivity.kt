package com.vivicarmonadev.primerviewmodel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.vivicarmonadev.primerviewmodel.ui.theme.PrimerViewModelTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrimerViewModelTheme {
                Surface (modifier = Modifier.fillMaxSize()) {
                    CounterScreen()
                }
            }
        }
    }
}
