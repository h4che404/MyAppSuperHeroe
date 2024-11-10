package com.juancruz.superheroapp

import com.google.gson.annotations.SerializedName

data class SuperHeroDataResponse(@SerializedName("response") val Conexion: String
                                 ,@SerializedName("results") val superheroes: List<SuperHeroItemResponse>) {
}

data class SuperHeroItemResponse (@SerializedName("id") val SuperHeroId: String,
    @SerializedName("name") val name: String
    )
