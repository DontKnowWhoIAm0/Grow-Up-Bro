package com.example.growupbro.enums

enum class CareDifficulty {

    EASY {
        override val displayName = "Разберется даже новичок"
    },
    MEDIUM {
        override val displayName = "Для бывалого"
    },
    HARD  {
        override val displayName = "Без профессионала не лезть"
    };

    abstract val displayName: String

}