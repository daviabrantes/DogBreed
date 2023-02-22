package com.example.dogbreed.data.repository.remote

import com.example.dogbreed.data.model.toDomain
import com.example.dogbreed.domain.model.BreedBO
import com.example.dogbreed.domain.repository.IDogBreedRepository
import com.example.dogbreed.network.DogBreedApi

class DogBreedRepository(
    private val apiService: DogBreedApi,
) : IDogBreedRepository {

    override suspend fun getAllDogBreeds(): List<BreedBO> {
        return apiService.getAllDogBreeds().map { it.toDomain() }
    }

    override suspend fun getDogBreed(filter: String): List<BreedBO> {
        return apiService.getDogBreed(filter).map { it.toDomain() }
    }

    override suspend fun getDogBreedByStatus(type: String, status: String): List<BreedBO> {
        return apiService.getDogBreedByStatus(type, status).map { it.toDomain }
    }
}
