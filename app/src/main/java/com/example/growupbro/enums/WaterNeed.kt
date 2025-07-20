package com.example.growupbro.enums

enum class WaterNeed {
    MINIMAL {
        override val displayName = "Минимальный"
    },
    MEDIUM {
        override val displayName = "Умеренный"
    },
    ABUNDANT  {
        override val displayName = "Обильный"
    };

    abstract val displayName: String
}