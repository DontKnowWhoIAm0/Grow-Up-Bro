package com.example.growupbro.enums

enum class Size {

    SMALL {
        override val displayName = "Маленькое"
    },
    AVERAGE {
        override val displayName = "Среднее"
    },
    BIG  {
        override val displayName = "Большое"
    };

    abstract val displayName: String

}