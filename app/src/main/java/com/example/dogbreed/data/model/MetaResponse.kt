package com.example.dogbreed.data.model

import kotlinx.serialization.SerialName

data class MetaResponse(
    @SerialName("height") val height: String = "",
    @SerialName("weight") val weight: String = "",
    @SerialName("coat") val coat: String = "",
    @SerialName("imgSrcSet") val imgSrcSet: ImageSourceSetResponse,
    @SerialName("life_span") val lifeSpan: String = "",
    @SerialName("other_names") val otherNames: String = "",
    @SerialName("common_nicknames") val commonNicknames: String = "",
    @SerialName("colour") val colour: String = "",
    @SerialName("litter_size") val litterSize: String = "",
    @SerialName("notes") val notes: String = "",
    @SerialName("breed_status") val breedStatus: String = "",
    @SerialName("foundation_stock") val foundationStock: String = "",
)
