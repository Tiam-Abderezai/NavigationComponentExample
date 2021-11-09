package com.example.navigationcomponentexample.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponentexample.R
import com.example.weather_app.view.DetailFragmentArgs

class ThirdFragment : Fragment(){

    private lateinit var binding : FragmentDetailBinding
    private val args by navArgs<DetailFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        setupBinding()
        return binding.root
    }

    private fun setupBinding() {
        val result = args.result
        val mainTemp = result.main.temp.toString().substringBefore(".")
        val feelsLike = result.main.feelsLike.toString().substringBefore(".")

        binding.apply {
            toolbarTitle.text = args.cityName
            tvMainTemp.text = mainTemp
            tvFeelsLike.text = feelsLike
            tvWeatherMain.text = result.weather.first().main
            tvWeatherDesc.text = result.weather.first().description

            btnButton.setOnClickListener {
                findNavController().popBackStack()
            }
        }
    }
}