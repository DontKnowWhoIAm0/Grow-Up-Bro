package com.example.growupbro.data

data class Question(
    val question: String,
    val answers: List<String>,
    val image: String
){
    fun getQuestionText(): String {
        return question
    }
    fun getAnswerList(): List<String> {
        return answers
    }
    fun getImageURL(): String {
        return image
    }
}