package com.example.dogbreed.data.models

import com.example.dogbreed.domain.model.BreedBO
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BreedResponse(
    @SerialName("id") val id: Int = 0,
    @SerialName("breed") val breed: String = "",
    @SerialName("origin") val origin: String = "",
    @SerialName("url") val url: String = "",
    @SerialName("img") val img: String = "",
    @SerialName("meta") val meta: MetaResponse
)

fun BreedResponse.toDomain() = BreedBO(
    id = this.id,
    breed = this.breed,
    origin = this.origin,
    url = this.url,
    img = this.img,
    meta = this.meta
)