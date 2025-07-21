package com.example.growupbro.testik

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.growupbro.R
import com.example.growupbro.data.Question
import com.google.android.material.button.MaterialButton

class TwoAnswersFragment: Fragment(R.layout.fragment_two_answers) {
    private lateinit var question: Question
    fun setQuestion(question: Question) {
        this.question = question
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var questionField = view.findViewById<TextView>(R.id.question)
        var answer1 = view.findViewById<MaterialButton>(R.id.answer1)
        var answer2 = view.findViewById<MaterialButton>(R.id.answer2)
        var image = view.findViewById<ImageView>(R.id.image)

        questionField.text = question.getQuestionText()
        answer1.text = question.getAnswerList()[0]
        answer2.text = question.getAnswerList()[1]
        Glide.with(this).load(question.getImageURL()).into(image)

        answer1.setOnClickListener{
            clickProcessing("a")
        }
        answer2.setOnClickListener{
            clickProcessing("b")
        }
    }
    fun clickProcessing(answer: String) {
        TestManager.addAnswer(answer)
        if (TestManager.isLastQuestion()) {
            TODO("открыть экран с результатом")
        }
        else {
            val curQuestion = TestManager.getCurrentQuestion()
            if (curQuestion.getAnswerList().size == 2) {
                val fragment = TwoAnswersFragment()
                fragment.setQuestion(curQuestion)
                requireActivity().supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, fragment).addToBackStack(null)
                    .commit()
            } else {
                val fragment = ThreeAnswersFragment()
                fragment.setQuestion(curQuestion)
                requireActivity().supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, fragment).addToBackStack(null)
                    .commit()
            }

        }

    }

}