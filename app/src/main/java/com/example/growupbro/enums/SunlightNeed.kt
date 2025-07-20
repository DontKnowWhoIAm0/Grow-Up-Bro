package com.example.growupbro.enums

enum class SunlightNeed {
    SHADE {
        override val displayName = "Тенелюбивое"
    },
    PARTIAL {
        override val displayName = "Рассеянный свет"
    },
    SUNLOVING {
        override val displayName = "Светолюбивое"
    };

    abstract val displayName: String
}