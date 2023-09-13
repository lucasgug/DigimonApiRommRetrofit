package com.lucasgugliuzza.digimonapirommretrofit.data

import com.lucasgugliuzza.digimonapirommretrofit.data.remote.DigimonApi
import com.lucasgugliuzza.digimonapirommretrofit.data.remote.DigimonCharacter
import com.lucasgugliuzza.digimonapirommretrofit.data.remote.dto.CharacterResponseDto
import com.lucasgugliuzza.digimonapirommretrofit.data.remote.dto.CharacterResponseItemDto

class DigimonRepository(
    private val api: DigimonApi
) {

    suspend fun getDigimon() : Result<List<DigimonCharacter>> {

         return try {
            val response = api.getDigimon().data
            val character = response.map { convert(it) }

            Result.success(character)

        }catch (e:Exception){
            Result.failure(e)
        }
    }

    private fun convert(data:CharacterResponseItemDto): DigimonCharacter {
        return  DigimonCharacter(
            name = data.name,
            level = data.level,
            img = data.img,

        )
    }

}