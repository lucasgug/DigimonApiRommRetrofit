package com.lucasgugliuzza.digimonapirommretrofit.data.remote.dto

import com.squareup.moshi.Json

data class CharacterResponseDto (
    @Json(name = "data")
    val data: List<CharacterResponseItemDto>

    )