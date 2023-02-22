package com.example.dogbreed.domain.usecase

import com.example.dogbreed.domain.model.BreedBO
import com.example.dogbreed.domain.repository.IDogBreedRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class DogBreedUseCase(
    private val repository: IDogBreedRepository
) {
    fun getAllDogBreeds(): Flow<List<BreedBO>> = flow {
        val response = repository.getAllDogBreeds()
        emit(response)
    }

    fun getDogBreed(filter: String): Flow<List<BreedBO>> = flow {
        val response = repository.getDogBreed(filter)
        emit(response)
    }

    fun getDogBreedByStatus(type: String, status: String): Flow<List<BreedBO>> = flow {
        val response = repository.getDogBreedByStatus(type, status)
        emit(response)
    }
}