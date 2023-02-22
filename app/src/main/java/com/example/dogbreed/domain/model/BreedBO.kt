package com.example.dogbreed.domain.model

import android.os.Parcelable
import com.example.dogbreed.data.model.MetaResponse
import kotlinx.parcelize.Parcelize

@Parcelize
data class BreedBO(
    var id: Int = 0,
    var breed: String = "",
    var origin: String = "",
    var url: String = "",
    var img: String = "",
    var meta: MetaResponse
): Parcelable
