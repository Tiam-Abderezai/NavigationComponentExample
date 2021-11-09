package com.example.navigationcomponentexample.ui.fragments

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.navigationcomponentexample.R
import com.example.navigationcomponentexample.data.User
import com.example.navigationcomponentexample.databinding.FragmentSecondBinding
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {

    private lateinit var cityName : String

    private lateinit var binding : FragmentSecondBinding

    private val args by navArgs<ListFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        setupBinding()
        return binding.root
    }

    private fun setupBinding() {
        binding.apply {
            btnButton.setOnClickListener {
                findNavController().popBackStack()
            }
        }
    }


    override fun itemClicked(result: Result) {
        val action = SecondFragmentDirections.actionListFragmentToDetailFragment(result, cityName)
        findNavController().navigate(action)
    }
}