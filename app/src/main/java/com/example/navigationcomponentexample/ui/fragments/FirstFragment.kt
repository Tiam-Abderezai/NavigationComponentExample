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
import com.example.navigationcomponentexample.R
import com.example.navigationcomponentexample.data.User
import com.example.navigationcomponentexample.databinding.FragmentFirstBinding
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {

    private lateinit var binding : FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) : View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        setupBinding()

        return binding.root
    }

    private fun setupBinding() {
        binding.apply {
            btnSearch.setOnClickListener {
                if(etSearch.text.toString().isNotEmpty()) {
                    val action = MainFragmentDirections.actionMainFragmentToListFragment(etSearch.text.toString())
                    findNavController().navigate(action)
                    etSearchContainer.isErrorEnabled = false
                } else {
                    etSearchContainer.apply {
                        isErrorEnabled = true
                        error = "Enter city name"
                    }
                }
            }
        }
    }

}