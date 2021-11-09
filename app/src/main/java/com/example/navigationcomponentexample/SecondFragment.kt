package com.example.navigationcomponentexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponentexample.databinding.FragmentSecondBinding
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding
    private val args by navArgs<SecondFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        initUI()
        return binding.root
    }

    private fun initUI(){
        binding.apply {
            btnGoBack.setOnClickListener {
                findNavController().popBackStack()
            }
            btnThirdFrag.setOnClickListener {
                val action = SecondFragmentDirections.actionSecondFragmentToThirdFragment("text")
                findNavController().navigate(action)
            }
        }
    }
}