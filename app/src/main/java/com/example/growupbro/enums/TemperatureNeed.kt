package com.example.growupbro.enums

enum class TemperatureNeed {

    COLD {
        override val displayName = "Холодостойкое"
    },
    WARM {
        override val displayName = "Теплолюбивое"
    };

    abstract val displayName: String

}