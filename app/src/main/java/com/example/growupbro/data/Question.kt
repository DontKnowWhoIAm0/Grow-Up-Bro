package com.example.growupbro.data

data class Question(
    val question: String,
    val answers: List<String>,
    val image: String
){
    fun getQuestion(): String {
        return question
    }
    fun getAnswers(): List<String> {
        return answers
    }
    fun getImage(): String {
        return image
    }
}