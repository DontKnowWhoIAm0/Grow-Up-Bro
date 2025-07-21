package com.example.growupbro

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.bumptech.glide.Glide
import com.example.growupbro.adapter.PlantsAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.button.MaterialButton

class MainScreenFragment : Fragment(R.layout.fragment_main_screen) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.adapter = PlantsAdapter(
            Glide.with(this),
            {position ->
                TODO("Реализовать переход на фрагмент с полной информацией о растении")
            })

        val researchButton = view.findViewById<MaterialButton>(R.id.search)
        researchButton.setOnClickListener {
            TODO("Реализовать переход на фрагмент с выбором фильтров")
        }

    }



}