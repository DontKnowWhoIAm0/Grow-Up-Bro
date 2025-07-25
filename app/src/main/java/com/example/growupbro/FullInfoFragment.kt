package com.example.growupbro

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.example.growupbro.data.Plant
import com.example.growupbro.utils.FileDownloader
import com.google.android.material.button.MaterialButton

class FullInfoFragment(private val plant: Plant) : Fragment(R.layout.fragment_full_info) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val image = view.findViewById<ImageView>(R.id.image)
        val title = view.findViewById<TextView>(R.id.title)
        val description = view.findViewById<TextView>(R.id.description)
        val downloadButton = view.findViewById<MaterialButton>(R.id.download)
        val backButton = view.findViewById<MaterialButton>(R.id.back)

        Glide.with(this).load(plant.getCurrentImageURL()).transform(RoundedCorners(10)).into(image)
        title.text = plant.name
        description.text = plant.description

        image.setOnClickListener {
            plant.changeImage()
            Glide.with(this).load(plant.getCurrentImageURL()).transform(RoundedCorners(10)).into(image)
        }

        backButton.setOnClickListener {
            requireActivity().supportFragmentManager.popBackStack()
        }

        downloadButton.setOnClickListener {
            requireContext().let {
                FileDownloader.createAndSaveFile(it, plant)
            }
        }
    }
}