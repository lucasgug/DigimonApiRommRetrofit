package com.lucasgugliuzza.digimonapirommretrofit.main

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lucasgugliuzza.digimonapirommretrofit.data.DigimonRepository
import com.lucasgugliuzza.digimonapirommretrofit.data.remote.DigimonApi
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class DigimonViewModel(
    private val repository: DigimonRepository = DigimonRepository(DigimonApi.instance)
) :ViewModel() {

    var state by mutableStateOf(MainState())
    private set

    init {
        viewModelScope.launch {
            state = state.copy(
                isloading = true
            )


        repository.getDigimon().onSuccess {
            state = state.copy(
                digimons = it
            )
        }.onFailure {
            println("ERROR DE CONEXION")
        }
            state =state.copy(
                isloading = false
            )

        }

    }

}