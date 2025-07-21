package com.example.growupbro.testik

import com.example.growupbro.data.Question
import com.example.growupbro.data.QuestionsRepository

object TestManager {
    private var index = 0
    private var answers = ""
    fun getCurrentQuestion(): Question {
       return QuestionsRepository.getQuestionsList()[index]
        index++
    }
    fun addAnswer(curAnswer: String) {
        answers = answers + curAnswer
    }
    fun isLastQuestion(): Boolean {
        if (index == QuestionsRepository.getQuestionsList().size-1) {
            return true
        }
        else {
            return false
        }
    }

    fun reset() {
        index = 0
        answers = ""
    }
}