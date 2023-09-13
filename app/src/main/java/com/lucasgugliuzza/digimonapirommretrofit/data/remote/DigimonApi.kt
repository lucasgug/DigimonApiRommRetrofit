package com.lucasgugliuzza.digimonapirommretrofit.data.remote

import com.lucasgugliuzza.digimonapirommretrofit.data.remote.dto.CharacterResponseDto
import com.lucasgugliuzza.digimonapirommretrofit.data.remote.dto.CharacterResponseItemDto
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import retrofit2.http.GET

interface DigimonApi {

    companion object{
        val instance = Retrofit.Builder().baseUrl("https://digimon-api.vercel.app")
            .addConverterFactory(MoshiConverterFactory.create()).client(
                OkHttpClient.Builder().build()).build().create(DigimonApi::class.java)

    }

    @GET("/api/digimon")
    suspend fun getDigimon() : CharacterResponseDto
}