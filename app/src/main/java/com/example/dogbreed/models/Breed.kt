package com.example.dogbreed.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Breed(
    @SerializedName("id")
    val imageId: Int,
    @SerializedName("name")
    val url: String,
): Parcelable
