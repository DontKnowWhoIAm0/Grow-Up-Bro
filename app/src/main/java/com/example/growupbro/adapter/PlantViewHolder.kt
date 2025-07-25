package com.example.growupbro.adapter

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.example.growupbro.R
import com.example.growupbro.data.Plant

class PlantViewHolder(
    view: View,
    private val requestManager: RequestManager,
    private val onImageClick: (Int) -> Unit
) : RecyclerView.ViewHolder(view) {

    private val image = view.findViewById<ImageView>(R.id.image)

    fun bindData(plant: Plant) {
        requestManager.load(plant.getImageURL()).into(image)
        image.setOnClickListener {
            onImageClick(adapterPosition)
        }
    }
}