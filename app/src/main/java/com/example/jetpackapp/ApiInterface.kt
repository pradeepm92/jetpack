package com.example.jetpackapp

import com.example.jetpackapp.model.Character
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET(ApiConstants.Endpoint)
    suspend fun getCharacters():List<Character>






}