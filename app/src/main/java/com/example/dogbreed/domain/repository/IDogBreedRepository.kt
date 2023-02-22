package com.example.dogbreed.domain.repository

import com.example.dogbreed.domain.model.BreedBO

interface IDogBreedRepository {
    suspend fun getAllDogBreeds(): List<BreedBO>
    suspend fun getDogBreed(filter: String): List<BreedBO>
    suspend fun getDogBreedByStatus(type: String, status: String): List<BreedBO>
}
