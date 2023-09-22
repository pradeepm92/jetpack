package com.example.jetpackapp

import com.example.jetpackapp.model.Character
import javax.inject.Inject

class CharacterRepo @Inject constructor(
    private val ApiInterface:ApiInterface
)  {
suspend fun getCharacters():List<Character>{
        return ApiInterface.getCharacters()
    }

}