package com.example.dogbreed.data.models

import kotlinx.serialization.SerialName

data class ImageSourceSetResponse (
    @SerialName("1.5x") val imperial: String = "",
    @SerialName("2x") val width: String = "",
)
