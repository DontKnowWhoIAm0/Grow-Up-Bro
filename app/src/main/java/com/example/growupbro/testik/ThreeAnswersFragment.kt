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

class ThreeAnswersFragment : Fragment(R.layout.fragment_three_answers) {
    private lateinit var question: Question
    fun setQuestion(question: Question) {
        this.question = question
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var questionField = view.findViewById<TextView>(R.id.question)
        var answer1 = view.findViewById<MaterialButton>(R.id.answer1)
        var answer2 = view.findViewById<MaterialButton>(R.id.answer2)
        var answer3 = view.findViewById<MaterialButton>(R.id.answer3)
        var image = view.findViewById<ImageView>(R.id.image)

        questionField.text = question.getQuestionText()
        answer1.text = question.getAnswerList()[0]
        answer2.text = question.getAnswerList()[1]
        answer3.text = question.getAnswerList()[2]
        Glide.with(this).load(question.getImageURL()).into(image)

        answer1.setOnClickListener {
            clickProcessing("a")
        }
        answer2.setOnClickListener {
            clickProcessing("b")
        }
        answer3.setOnClickListener {
            clickProcessing("c")
        }
    }

    fun clickProcessing(answer: String) {
        TestManager.addAnswer(answer)
        val curQuestion = TestManager.getCurrentQuestion()
        if (curQuestion.getAnswerList().size == 2) {
            val fragment = TwoAnswersFragment()
            fragment.setQuestion(curQuestion)
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit()
        } else {
            val fragment = ThreeAnswersFragment()
            fragment.setQuestion(curQuestion)
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit()
        }

    }

}

