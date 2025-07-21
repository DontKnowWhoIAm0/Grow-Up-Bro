package com.example.growupbro.testik

import com.example.growupbro.data.Question
import com.example.growupbro.data.QuestionsRepository

object TestManager {
     var index = 0
     var answers = ""
    fun getCurrentQuestion(): Question {
       val curQuestion = QuestionsRepository.getQuestionsList()[index]
        index += 1
        return curQuestion

    }
    fun addAnswer(curAnswer: String) {
        answers = answers + curAnswer
    }
    fun isLastQuestion(): Boolean {
        if (index == QuestionsRepository.getQuestionsList().size) {
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