package com.lucasgugliuzza.digimonapirommretrofit.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun MainScreen( viewModel: DigimonViewModel) {

    val state = viewModel.state


    if (state.isloading){
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
            CircularProgressIndicator(color = Color.Red)
        }
    }

    if (state.digimons.isNotEmpty()){
        LazyColumn(modifier = Modifier.fillMaxWidth()){
            items(state.digimons){
                Text(text = it.name)
                Text(text = it.level)
                Text(text = it.img)

                Divider()
            }
        }
    }

    
}