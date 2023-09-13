package com.lucasgugliuzza.digimonapirommretrofit.main

import com.lucasgugliuzza.digimonapirommretrofit.data.remote.DigimonCharacter
import com.lucasgugliuzza.digimonapirommretrofit.data.remote.dto.CharacterResponseDto
import com.lucasgugliuzza.digimonapirommretrofit.data.remote.dto.CharacterResponseItemDto

data class MainState(
    val isloading:Boolean = false,
    val digimons :List<DigimonCharacter> = emptyList()
)
