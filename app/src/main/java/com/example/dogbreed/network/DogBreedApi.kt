package com.example.dogbreed.network

import com.example.dogbreed.data.model.BreedResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface DogBreedApi {

    @GET("dog_breeds")
    suspend fun getAllDogBreeds(
    ): List<BreedResponse>

    @GET("dog_breeds/breed/{breedParameter}")
    suspend fun getDogBreed(
        @Path("breedParameter") type: String
    ): List<BreedResponse>

    @GET("dog_breeds/group/{typeParameter}/{statusParameter}")
    suspend fun getDogBreedByStatus(
        @Path("typeParameters") type: String,
        @Path("statusParameter") status: String
    ): List<BreedResponse>

}