package com.example.growupbro

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.growupbro.data.PlantsRepository
import com.example.growupbro.testik.StartTestFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        PlantsRepository.shuffleList()
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, MainScreenFragment())
            .commit()

        val menuButton = findViewById<BottomNavigationView>(R.id.menu)
        menuButton.setOnItemSelectedListener {item ->
            when (item.itemId) {
                R.id.main_screen -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, MainScreenFragment()).addToBackStack(null)
                        .commit()
                    true
                }
                R.id.test -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, StartTestFragment()).addToBackStack(null)
                        .commit()
                    true
                }
                else -> false
            }
        }
    }

}