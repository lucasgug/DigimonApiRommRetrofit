package com.lucasgugliuzza.digimonapirommretrofit.data.remote.dto

import com.squareup.moshi.Json

data class CharacterResponseItemDto(
    @Json(name = "img")
    val img: String,
    @Json(name = "level")
    val level: String,
    @Json(name = "name")
    val name: String
)