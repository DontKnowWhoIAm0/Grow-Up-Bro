package com.example.growupbro.testik

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.growupbro.R
import com.google.android.material.button.MaterialButton

class StartTestFragment: Fragment(R.layout.fragment_test_start) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var button = view.findViewById<MaterialButton>(R.id.button)
        button.setOnClickListener {
            TestManager.reset()
            openQuestionFragment()
        }
    }

    fun openQuestionFragment() {
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