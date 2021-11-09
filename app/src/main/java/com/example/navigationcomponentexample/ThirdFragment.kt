package com.example.navigationcomponentexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponentexample.databinding.FragmentThirdBinding
import kotlinx.android.synthetic.main.fragment_first.*

class ThirdFragment : Fragment() {

    private lateinit var binding: FragmentThirdBinding
    private val args by navArgs<ThirdFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThirdBinding.inflate(inflater, container, false)
        initUI()
            return binding.root
    }

    private fun initUI() {
        binding.apply {
            btnGoBack.setOnClickListener {
                findNavController().popBackStack()
            }
        }
    }
}