package com.example.growupbro.testik

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.growupbro.MainScreenFragment
import com.example.growupbro.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class TestFragment : Fragment(R.layout.fragment_test_main_screen) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // TODO("Реализовать подстановку фрагмента с началом теста")

        val menuButton = view.findViewById<BottomNavigationView>(R.id.menu)
        menuButton.setOnItemSelectedListener {item ->
            when (item.itemId) {
                R.id.test -> {true}
                R.id.main_screen -> {
                    parentFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, MainScreenFragment())
                        .addToBackStack(null)
                        .commit()
                    true
                }
                else -> false
            }
        }
    }

}