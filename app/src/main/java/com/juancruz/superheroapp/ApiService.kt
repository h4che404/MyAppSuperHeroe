package com.juancruz.superheroapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("/api/14999839b7556c79d383d370cc03f6ba/search/{name}")
    suspend fun getSuperheroes(@Path("name") superheroName:String):Response<SuperHeroDataResponse>

}