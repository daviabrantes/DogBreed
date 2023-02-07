package com.example.dogbreed.network

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap

interface DogBreedApi {

    @GET("images")
    suspend fun getImages(
        @QueryMap queries: Map<String, String>
    ): Response<DogBreed>

    @GET("breeds")
    suspend fun getBreeds(
        @QueryMap searchQuery: Map<String, String>
    ): Response<DogBreed>

    @GET("breeds")
    suspend fun searchBreed(
        @Query("apiKey") apiKey: String
    ): Response<DogBreed>

}