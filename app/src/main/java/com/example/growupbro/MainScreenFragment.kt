package com.example.growupbro

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.bumptech.glide.Glide
import com.example.growupbro.adapter.PlantsAdapter
import com.example.growupbro.data.PlantsRepository
import com.example.growupbro.filters.FiltersFragment
import com.example.growupbro.testik.StartTestFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.button.MaterialButton
import androidx.core.view.isVisible

class MainScreenFragment : Fragment(R.layout.fragment_main_screen) {

    private lateinit var adapter: PlantsAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view)
        adapter = PlantsAdapter(
            Glide.with(this),
            { position ->
                val plant = PlantsRepository.getListForRecyclerView()[position]
                requireActivity().supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, FullInfoFragment(plant)).addToBackStack(null)
                    .commit()
            })

        recyclerView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.adapter = adapter

        val researchButton = view.findViewById<MaterialButton>(R.id.search)
        researchButton.setOnClickListener {
            val bnm = requireActivity().findViewById<BottomNavigationView>(R.id.menu)
            bnm.visibility = View.GONE
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, FiltersFragment()).addToBackStack(null)
                .commit()
        }

        val resetFiltersButton = view.findViewById<MaterialButton>(R.id.filtersReset)
        resetFiltersButton.setOnClickListener {
            PlantsRepository.shuffleList()
            onResume()
        }
    }

    override fun onResume() {
        super.onResume()
        adapter.notifyDataSetChanged()
        requireActivity().findViewById<BottomNavigationView>(R.id.menu).visibility = View.VISIBLE
        if (PlantsRepository.getListForRecyclerView().size == PlantsRepository.getFullListOfPlants().size) {
            requireView().findViewById<MaterialButton>(R.id.search).visibility = View.VISIBLE
            requireView().findViewById<MaterialButton>(R.id.filtersReset).visibility = View.GONE
        } else {
            requireView().findViewById<MaterialButton>(R.id.search).visibility = View.GONE
            requireView().findViewById<MaterialButton>(R.id.filtersReset).visibility = View.VISIBLE
        }
    }
}