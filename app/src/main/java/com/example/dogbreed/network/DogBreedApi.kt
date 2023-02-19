package com.example.dogbreed.network

import com.example.dogbreed.data.models.BreedResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.QueryMap

interface DogBreedApi {

    @GET("dog_breeds")
    suspend fun getAllDogBreeds(
        @QueryMap queries: Map<String, String>
    ): Response<BreedResponse>

    @GET("dog_breeds/breed/")
    suspend fun getDogBreed(
        @QueryMap searchQuery: Map<String, String>
    ): Response<BreedResponse>

    @GET("dog_breeds/group/{typeParameter}/{statusParameter}")
    suspend fun searchBreed(
        @Path("typeParameters") type: String,
        @Path("statusParameter") status: String
    ): Response<BreedResponse>

}