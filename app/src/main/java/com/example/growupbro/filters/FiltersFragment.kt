package com.example.growupbro.filters

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import com.example.growupbro.R
import com.example.growupbro.enums.CareDifficulty
import com.example.growupbro.enums.OtherFeatures
import com.example.growupbro.enums.Safety
import com.example.growupbro.enums.Size
import com.example.growupbro.enums.SunlightNeed
import com.example.growupbro.enums.TemperatureNeed
import com.example.growupbro.enums.WaterNeed
import com.google.android.material.button.MaterialButton
import androidx.core.graphics.toColorInt

class FiltersFragment : Fragment(R.layout.fragment_filters) {

    private var selectedFilters: MutableMap<String, List<Any>> = mutableMapOf(
        "careDifficult" to mutableListOf(),
        "sunlightNeed" to mutableListOf(),
        "waterNeed" to mutableListOf(),
        "temperatureNeed" to mutableListOf(),
        "size" to mutableListOf(),
        "safety" to mutableListOf(),
        "otherFeatures" to mutableListOf()
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val careDifficultyBeginnerButton = view.findViewById<MaterialButton>(R.id.beginnerLevel)
        val careDifficultyMediumButton = view.findViewById<MaterialButton>(R.id.mediumLevel)
        val careDifficultyHighButton = view.findViewById<MaterialButton>(R.id.highLevel)

        val sunlightNeedSunloving = view.findViewById<MaterialButton>(R.id.sunloving)
        val sunlightNeedPartial = view.findViewById<MaterialButton>(R.id.partial)
        val sunlightNeedShade = view.findViewById<MaterialButton>(R.id.shade)

        careDifficultyBeginnerButton.setOnClickListener {
            val selectedCareDifficulties = selectedFilters["careDifficult"] as MutableList<CareDifficulty>
            if (selectedCareDifficulties.contains(CareDifficulty.EASY)) {
                careDifficultyBeginnerButton.setBackgroundColor("#FFFFFFFF".toColorInt())
                selectedCareDifficulties.remove(CareDifficulty.EASY)
                selectedFilters["careDifficult"] = selectedCareDifficulties
            } else {
                careDifficultyBeginnerButton.setBackgroundColor("#24873B".toColorInt())
                selectedCareDifficulties.add(CareDifficulty.EASY)
                selectedFilters["careDifficult"] = selectedCareDifficulties
            }
        }

        careDifficultyMediumButton.setOnClickListener {
            val selectedCareDifficulties = selectedFilters["careDifficult"] as MutableList<CareDifficulty>
            if (selectedCareDifficulties.contains(CareDifficulty.MEDIUM)) {
                careDifficultyMediumButton.setBackgroundColor("#FFFFFFFF".toColorInt())
                selectedCareDifficulties.remove(CareDifficulty.MEDIUM)
                selectedFilters["careDifficult"] = selectedCareDifficulties
            } else {
                careDifficultyMediumButton.setBackgroundColor("#24873B".toColorInt())
                selectedCareDifficulties.add(CareDifficulty.MEDIUM)
                selectedFilters["careDifficult"] = selectedCareDifficulties
            }
        }

        careDifficultyHighButton.setOnClickListener {
            val selectedCareDifficulties = selectedFilters["careDifficult"] as MutableList<CareDifficulty>
            if (selectedCareDifficulties.contains(CareDifficulty.HARD)) {
                careDifficultyHighButton.setBackgroundColor("#FFFFFFFF".toColorInt())
                selectedCareDifficulties.remove(CareDifficulty.HARD)
                selectedFilters["careDifficult"] = selectedCareDifficulties
            } else {
                careDifficultyHighButton.setBackgroundColor("#24873B".toColorInt())
                selectedCareDifficulties.add(CareDifficulty.HARD)
                selectedFilters["careDifficult"] = selectedCareDifficulties
            }
        }

        sunlightNeedSunloving.setOnClickListener {
            val selectedSunlightNeed = selectedFilters["sunlightNeed"] as MutableList<SunlightNeed>
            if (selectedSunlightNeed.contains(SunlightNeed.SUNLOVING)) {
                sunlightNeedSunloving.setBackgroundColor("#FFFFFFFF".toColorInt())
                selectedSunlightNeed.remove(SunlightNeed.SUNLOVING)
                selectedFilters["sunlightNeed"] = selectedSunlightNeed
            } else {
                sunlightNeedSunloving.setBackgroundColor("#24873B".toColorInt())
                selectedSunlightNeed.add(SunlightNeed.SUNLOVING)
                selectedFilters["sunlightNeed"] = selectedSunlightNeed
            }
        }

        sunlightNeedPartial.setOnClickListener {
            val selectedSunlightNeed = selectedFilters["sunlightNeed"] as MutableList<SunlightNeed>
            if (selectedSunlightNeed.contains(SunlightNeed.PARTIAL)) {
                sunlightNeedPartial.setBackgroundColor("#FFFFFFFF".toColorInt())
                selectedSunlightNeed.remove(SunlightNeed.PARTIAL)
                selectedFilters["sunlightNeed"] = selectedSunlightNeed
            } else {
                sunlightNeedPartial.setBackgroundColor("#24873B".toColorInt())
                selectedSunlightNeed.add(SunlightNeed.PARTIAL)
                selectedFilters["sunlightNeed"] = selectedSunlightNeed
            }
        }

        sunlightNeedShade.setOnClickListener {
            val selectedSunlightNeed = selectedFilters["sunlightNeed"] as MutableList<SunlightNeed>
            if (selectedSunlightNeed.contains(SunlightNeed.SHADE)) {
                sunlightNeedShade.setBackgroundColor("#FFFFFFFF".toColorInt())
                selectedSunlightNeed.remove(SunlightNeed.SHADE)
                selectedFilters["sunlightNeed"] = selectedSunlightNeed
            } else {
                sunlightNeedShade.setBackgroundColor("#24873B".toColorInt())
                selectedSunlightNeed.add(SunlightNeed.SHADE)
                selectedFilters["sunlightNeed"] = selectedSunlightNeed
            }
        }
    }
}