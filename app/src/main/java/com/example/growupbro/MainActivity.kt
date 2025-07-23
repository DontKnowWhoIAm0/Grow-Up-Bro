package com.example.growupbro

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.growupbro.data.PlantsRepository
import com.example.growupbro.testik.StartTestFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        PlantsRepository.shuffleList()
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, 0)
            insets
        }


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