package com.example.growupbro.enums

enum class Safety {

    SAFE {
        override val displayName = "Безопасное"
    },
    TOXIC  {
        override val displayName = "Ядовитое"
    };

    abstract val displayName: String

}