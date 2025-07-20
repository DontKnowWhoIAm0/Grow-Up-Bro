package com.example.growupbro

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.button.MaterialButton

class MainScreenFragment : Fragment(R.layout.fragment_main_screen) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val researchButton = view.findViewById<MaterialButton>(R.id.search)
        researchButton.setOnClickListener {
            TODO("Реализовать переход на фрагмент с выбором фильтров")
        }

        val menuButton = view.findViewById<BottomNavigationView>(R.id.menu)
        menuButton.setOnClickListener {
            TODO("Реализовать переходы между главными разделами")
        }
    }



}