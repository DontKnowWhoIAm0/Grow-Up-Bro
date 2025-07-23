package com.example.growupbro.testik

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.example.growupbro.R
import com.example.growupbro.utils.FileDownloader
import com.google.android.material.button.MaterialButton

class TestResultFragment : Fragment(R.layout.fragment_test_result) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val plant = ResultSelector.findResult()
        val image = view.findViewById<ImageView>(R.id.image)
        val title = view.findViewById<TextView>(R.id.title)
        val desc = view.findViewById<TextView>(R.id.desc)
        val button = view.findViewById<MaterialButton>(R.id.button)

        Glide.with(this).load(plant?.getImageURL()).transform(RoundedCorners(10)).into(image)
        title.text = plant?.name
        desc.text = plant?.description
        button.setOnClickListener {
            requireContext().let {
                if (plant != null) {
                    FileDownloader.createAndSaveFile(it, plant)
                }
            }
        }
    }
}
