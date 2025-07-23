package com.example.growupbro.filters

import android.os.Bundle
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

        val waterNeedMinimal = view.findViewById<MaterialButton>(R.id.minimal)
        val waterNeedMedium = view.findViewById<MaterialButton>(R.id.medium)
        val waterNeedAbundant = view.findViewById<MaterialButton>(R.id.abundant)

        val temperatureNeedCold = view.findViewById<MaterialButton>(R.id.cold)
        val temperatureNeedWarm = view.findViewById<MaterialButton>(R.id.warm)

        val sizeSmall = view.findViewById<MaterialButton>(R.id.small)
        val sizeAverage = view.findViewById<MaterialButton>(R.id.average)
        val sizeBig = view.findViewById<MaterialButton>(R.id.big)

        val safetySafe = view.findViewById<MaterialButton>(R.id.safe)
        val safetyToxic = view.findViewById<MaterialButton>(R.id.toxic)

        val otherFeaturesFlowering = view.findViewById<MaterialButton>(R.id.flowering)
        val otherFeaturesSmelling = view.findViewById<MaterialButton>(R.id.smelling)
        val otherFeaturesAllergen = view.findViewById<MaterialButton>(R.id.allergen)
        val otherFeaturesMedical = view.findViewById<MaterialButton>(R.id.medical)
        val otherFeaturesEdible = view.findViewById<MaterialButton>(R.id.edible)
        val otherFeaturesAircleaning = view.findViewById<MaterialButton>(R.id.aircleaning)

        val applyButton = view.findViewById<MaterialButton>(R.id.applyButton)

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

        waterNeedMinimal.setOnClickListener {
            val selectedWaterNeed = selectedFilters["waterNeed"] as MutableList<WaterNeed>
            if (selectedWaterNeed.contains(WaterNeed.MINIMAL)) {
                waterNeedMinimal.setBackgroundColor("#FFFFFFFF".toColorInt())
                selectedWaterNeed.remove(WaterNeed.MINIMAL)
                selectedFilters["waterNeed"] = selectedWaterNeed
            } else {
                waterNeedMinimal.setBackgroundColor("#24873B".toColorInt())
                selectedWaterNeed.add(WaterNeed.MINIMAL)
                selectedFilters["waterNeed"] = selectedWaterNeed
            }
        }

        waterNeedMedium.setOnClickListener {
            val selectedWaterNeed = selectedFilters["waterNeed"]  as MutableList<WaterNeed>
            if (selectedWaterNeed.contains(WaterNeed.MEDIUM)) {
                waterNeedMedium.setBackgroundColor("#FFFFFFFF".toColorInt())
                selectedWaterNeed.remove(WaterNeed.MEDIUM)
                selectedFilters["waterNeed"] = selectedWaterNeed
            } else {
                waterNeedMedium.setBackgroundColor("#24873B".toColorInt())
                selectedWaterNeed.add(WaterNeed.MEDIUM)
                selectedFilters["waterNeed"] = selectedWaterNeed
            }
        }

        waterNeedAbundant.setOnClickListener {
            val selectedWaterNeed = selectedFilters["waterNeed"] as MutableList<WaterNeed>
            if (selectedWaterNeed.contains(WaterNeed.ABUNDANT)) {
                waterNeedAbundant.setBackgroundColor("#FFFFFFFF".toColorInt())
                selectedWaterNeed.remove(WaterNeed.ABUNDANT)
                selectedFilters["waterNeed"] = selectedWaterNeed
            } else {
                waterNeedAbundant.setBackgroundColor("#24873B".toColorInt())
                selectedWaterNeed.add(WaterNeed.ABUNDANT)
                selectedFilters["waterNeed"] = selectedWaterNeed
            }
        }

        temperatureNeedCold.setOnClickListener {
            val selectedTemperatureNeed = selectedFilters["temperatureNeed"] as MutableList<TemperatureNeed>
            if (selectedTemperatureNeed.contains(TemperatureNeed.COLD)) {
                temperatureNeedCold.setBackgroundColor("#FFFFFFFF".toColorInt())
                selectedTemperatureNeed.remove(TemperatureNeed.COLD)
                selectedFilters["temperatureNeed"] = selectedTemperatureNeed
            } else {
                temperatureNeedCold.setBackgroundColor("#24873B".toColorInt())
                selectedTemperatureNeed.add(TemperatureNeed.COLD)
                selectedFilters["temperatureNeed"] = selectedTemperatureNeed
            }
        }

        temperatureNeedWarm.setOnClickListener {
            val selectedTemperatureNeed = selectedFilters["temperatureNeed"] as MutableList<TemperatureNeed>
            if (selectedTemperatureNeed.contains(TemperatureNeed.WARM)) {
                temperatureNeedWarm.setBackgroundColor("#FFFFFFFF".toColorInt())
                selectedTemperatureNeed.remove(TemperatureNeed.WARM)
                selectedFilters["temperatureNeed"] = selectedTemperatureNeed
            } else {
                temperatureNeedWarm.setBackgroundColor("#24873B".toColorInt())
                selectedTemperatureNeed.add(TemperatureNeed.WARM)
                selectedFilters["temperatureNeed"] = selectedTemperatureNeed
            }
        }

        sizeSmall.setOnClickListener {
            val selectedSize = selectedFilters["size"] as MutableList<Size>
            if (selectedSize.contains(Size.SMALL)) {
                sizeSmall.setBackgroundColor("#FFFFFFFF".toColorInt())
                selectedSize.remove(Size.SMALL)
                selectedFilters["size"] = selectedSize
            } else {
                sizeSmall.setBackgroundColor("#24873B".toColorInt())
                selectedSize.add(Size.SMALL)
                selectedFilters["size"] = selectedSize
            }
        }

        sizeAverage.setOnClickListener {
            val selectedSize = selectedFilters["size"] as MutableList<Size>
            if (selectedSize.contains(Size.AVERAGE)) {
                sizeAverage.setBackgroundColor("#FFFFFFFF".toColorInt())
                selectedSize.remove(Size.AVERAGE)
                selectedFilters["size"] = selectedSize
            } else {
                sizeAverage.setBackgroundColor("#24873B".toColorInt())
                selectedSize.add(Size.AVERAGE)
                selectedFilters["size"] = selectedSize
            }
        }

        sizeBig.setOnClickListener {
            val selectedSize = selectedFilters["size"] as MutableList<Size>
            if (selectedSize.contains(Size.BIG)) {
                sizeBig.setBackgroundColor("#FFFFFFFF".toColorInt())
                selectedSize.remove(Size.BIG)
                selectedFilters["size"] = selectedSize
            } else {
                sizeBig.setBackgroundColor("#24873B".toColorInt())
                selectedSize.add(Size.BIG)
                selectedFilters["size"] = selectedSize
            }
        }

        safetySafe.setOnClickListener {
            val selectedSafety = selectedFilters["safety"] as MutableList<Safety>
            if (selectedSafety.contains(Safety.SAFE)) {
                safetySafe.setBackgroundColor("#FFFFFFFF".toColorInt())
                selectedSafety.remove(Safety.SAFE)
            } else {
                safetySafe.setBackgroundColor("#24873B".toColorInt())
                selectedSafety.add(Safety.SAFE)
            }
            selectedFilters["safety"] = selectedSafety
        }

        safetyToxic.setOnClickListener {
            val selectedSafety = selectedFilters["safety"] as MutableList<Safety>
            if (selectedSafety.contains(Safety.TOXIC)) {
                safetyToxic.setBackgroundColor("#FFFFFFFF".toColorInt())
                selectedSafety.remove(Safety.TOXIC)
            } else {
                safetyToxic.setBackgroundColor("#24873B".toColorInt())
                selectedSafety.add(Safety.TOXIC)
            }
            selectedFilters["safety"] = selectedSafety
        }

        otherFeaturesFlowering.setOnClickListener {
            val selectedOtherFeatures = selectedFilters["otherFeatures"] as MutableList<OtherFeatures>
            if (selectedOtherFeatures.contains(OtherFeatures.FLOWERING)) {
                otherFeaturesFlowering.setBackgroundColor("#FFFFFFFF".toColorInt())
                selectedOtherFeatures.remove(OtherFeatures.FLOWERING)
            } else {
                otherFeaturesFlowering.setBackgroundColor("#24873B".toColorInt())
                selectedOtherFeatures.add(OtherFeatures.FLOWERING)
            }
            selectedFilters["otherFeatures"] = selectedOtherFeatures
        }

        otherFeaturesSmelling.setOnClickListener {
            val selectedOtherFeatures = selectedFilters["otherFeatures"] as MutableList<OtherFeatures>
            if (selectedOtherFeatures.contains(OtherFeatures.SMELLING)) {
                otherFeaturesSmelling.setBackgroundColor("#FFFFFFFF".toColorInt())
                selectedOtherFeatures.remove(OtherFeatures.SMELLING)
            } else {
                otherFeaturesSmelling.setBackgroundColor("#24873B".toColorInt())
                selectedOtherFeatures.add(OtherFeatures.SMELLING)
            }
            selectedFilters["otherFeatures"] = selectedOtherFeatures
        }

        otherFeaturesAllergen.setOnClickListener {
            val selectedOtherFeatures = selectedFilters["otherFeatures"] as MutableList<OtherFeatures>
            if (selectedOtherFeatures.contains(OtherFeatures.ALLERGEN)) {
                otherFeaturesAllergen.setBackgroundColor("#FFFFFFFF".toColorInt())
                selectedOtherFeatures.remove(OtherFeatures.ALLERGEN)
            } else {
                otherFeaturesAllergen.setBackgroundColor("#24873B".toColorInt())
                selectedOtherFeatures.add(OtherFeatures.ALLERGEN)
            }
            selectedFilters["otherFeatures"] = selectedOtherFeatures
        }

        otherFeaturesMedical.setOnClickListener {
            val selectedOtherFeatures = selectedFilters["otherFeatures"] as MutableList<OtherFeatures>
            if (selectedOtherFeatures.contains(OtherFeatures.MEDICAL)) {
                otherFeaturesMedical.setBackgroundColor("#FFFFFFFF".toColorInt())
                selectedOtherFeatures.remove(OtherFeatures.MEDICAL)
            } else {
                otherFeaturesMedical.setBackgroundColor("#24873B".toColorInt())
                selectedOtherFeatures.add(OtherFeatures.MEDICAL)
            }
            selectedFilters["otherFeatures"] = selectedOtherFeatures
        }

        otherFeaturesEdible.setOnClickListener {
            val selectedOtherFeatures = selectedFilters["otherFeatures"] as MutableList<OtherFeatures>
            if (selectedOtherFeatures.contains(OtherFeatures.EDIBLE)) {
                otherFeaturesEdible.setBackgroundColor("#FFFFFFFF".toColorInt())
                selectedOtherFeatures.remove(OtherFeatures.EDIBLE)
            } else {
                otherFeaturesEdible.setBackgroundColor("#24873B".toColorInt())
                selectedOtherFeatures.add(OtherFeatures.EDIBLE)
            }
            selectedFilters["otherFeatures"] = selectedOtherFeatures
        }

        otherFeaturesAircleaning.setOnClickListener {
            val selectedOtherFeatures = selectedFilters["otherFeatures"] as MutableList<OtherFeatures>
            if (selectedOtherFeatures.contains(OtherFeatures.AIRCLEANING)) {
                otherFeaturesAircleaning.setBackgroundColor("#FFFFFFFF".toColorInt())
                selectedOtherFeatures.remove(OtherFeatures.AIRCLEANING)
            } else {
                otherFeaturesAircleaning.setBackgroundColor("#24873B".toColorInt())
                selectedOtherFeatures.add(OtherFeatures.AIRCLEANING)
            }
            selectedFilters["otherFeatures"] = selectedOtherFeatures
        }

        applyButton.setOnClickListener {
            TODO("Реализовать отбор растений по фильтрам и вывод на экран (+ кнопка назад)")
        }

    }
}