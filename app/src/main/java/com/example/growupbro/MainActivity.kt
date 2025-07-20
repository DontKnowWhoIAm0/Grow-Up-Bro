package com.example.growupbro

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.growupbro.data.PlantsRepository

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        PlantsRepository.shuffleList()
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, MainScreenFragment())
            .commit()
    }
}