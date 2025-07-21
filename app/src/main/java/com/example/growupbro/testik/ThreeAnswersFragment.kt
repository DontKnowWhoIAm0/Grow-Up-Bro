package com.example.growupbro.testik

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.growupbro.R
import com.example.growupbro.data.Question
import com.google.android.material.button.MaterialButton

class ThreeAnswersFragment: Fragment(R.layout.fragment_three_answers) {
    private lateinit var question: Question
    fun setQuestion(question: Question) {
        this.question = question
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var textQuestion=view.findViewById<TextView>(R.id.question)
        var textAnswer1=view.findViewById<MaterialButton>(R.id.answer1)
        var textAnswer2=view.findViewById<MaterialButton>(R.id.answer2)
        var textAnswer3=view.findViewById<MaterialButton>(R.id.answer3)
        var image = view.findViewById<ImageView>(R.id.image)

        textQuestion.text= question.getQuestion()
        textAnswer1.text = question.getAnswers()[0]
        textAnswer2.text = question.getAnswers()[1]
        textAnswer3.text = question.getAnswers()[2]
        Glide.with(this).load(question.getImage()).into(image)
        textAnswer1.setOnClickListener{
            TODO("реализовать обработку нажатия")
        }
        textAnswer2.setOnClickListener{
            TODO("реализовать обработку нажатия")
        }
        textAnswer3.setOnClickListener{
            TODO("реализовать обработку нажатия")
        }
    }

}