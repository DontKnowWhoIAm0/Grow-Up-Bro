package com.example.growupbro.enums

enum class OtherFeatures {

    FLOWERING {
        override val displayName = "Цветущее"
    },
    SMELLING {
        override val displayName = "Пахнущее"
    },
    ALLERGEN  {
        override val displayName = "Аллерген"
    },
    MEDICAL  {
        override val displayName = "Лекарственное"
    },
    EDIBLE  {
        override val displayName = "Съедобное"
    },
    AIRCLEANING {
        override val displayName = "Очищает воздух"
    };

    abstract val displayName: String

}