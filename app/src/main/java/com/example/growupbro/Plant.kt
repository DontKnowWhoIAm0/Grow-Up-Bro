package com.example.growupbro

import com.example.growupbro.enums.CareDifficulty
import com.example.growupbro.enums.OtherFeatures
import com.example.growupbro.enums.Safety
import com.example.growupbro.enums.Size
import com.example.growupbro.enums.SunlightNeed
import com.example.growupbro.enums.TemperatureNeed
import com.example.growupbro.enums.WaterNeed

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
) {
    fun getImageURL(): String = imagesURL[0]
}