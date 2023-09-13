package com.lucasgugliuzza.digimonapirommretrofit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.lucasgugliuzza.digimonapirommretrofit.main.DigimonViewModel
import com.lucasgugliuzza.digimonapirommretrofit.main.MainScreen
import com.lucasgugliuzza.digimonapirommretrofit.ui.theme.DigimonApiRommRetrofitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel by viewModels<DigimonViewModel>()
        setContent {
            DigimonApiRommRetrofitTheme {

                MainScreen(viewModel)
            }
        }
    }
}

