package com.example.growupbro

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager


class PlantsAdapter(
    private val requestManager: RequestManager,
    private val onImageClick: (Int) -> Unit
) : RecyclerView.Adapter<PlantViewHolder>() {

    override fun getItemCount(): Int {
        return PlantsRepository.getListForRecyclerView().size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_tile, parent, false)
        return PlantViewHolder(view, requestManager, onImageClick)
    }

    override fun onBindViewHolder(holder: PlantViewHolder, position: Int) {
        val currentPlant = PlantsRepository.getListForRecyclerView()[position]
        holder.bindData(currentPlant)
    }

}