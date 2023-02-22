package com.example.dogbreed.domain.model

import android.os.Parcelable
import com.example.dogbreed.data.model.ImageSourceSetResponse
import kotlinx.parcelize.Parcelize

@Parcelize
data class MetaBO(
    var height: String = "",
    var weight: String = "",
    var coat: String = "",
    var imgSrcSet: ImageSourceSetResponse,
    var lifeSpan: String = "",
    var otherNames: String = "",
    var commonNicknames: String = "",
    var colour: String = "",
    var litterSize: String = "",
    var notes: String = "",
    var breedStatus: String = "",
    var foundationStock: String = "",
): Parcelable
