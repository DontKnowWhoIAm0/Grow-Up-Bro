package com.example.growupbro.data

import android.os.Parcelable
import com.example.growupbro.enums.CareDifficulty
import com.example.growupbro.enums.OtherFeatures
import com.example.growupbro.enums.Safety
import com.example.growupbro.enums.Size
import com.example.growupbro.enums.SunlightNeed
import com.example.growupbro.enums.TemperatureNeed
import com.example.growupbro.enums.WaterNeed
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Plant(
    val name: String,
    val sunlightNeed: SunlightNeed,
    val waterNeed: WaterNeed,
    val temperatureNeed: TemperatureNeed,
    val isSafe: Safety,
    val careDifficulty: CareDifficulty,
    val size: Size,
    val otherFeatures: List<OtherFeatures>,
    val imagesURL: List<String>,
    val description: String,
    var currentImageURL: Int = 0
) : Parcelable {
    fun getImageURL(): String = imagesURL[0]

    fun changeImage() {
        if (currentImageURL == imagesURL.size - 1) {
            currentImageURL = 0
        } else {
            currentImageURL++
        }
    }

    fun getCurrentImageURL(): String = imagesURL[currentImageURL]
}