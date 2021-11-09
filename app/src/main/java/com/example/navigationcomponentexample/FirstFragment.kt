package com.example.navigationcomponentexample
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponentexample.databinding.FragmentFirstBinding
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {

    private lateinit var binding : FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) : View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        initUI()
        return binding.root
    }

   private fun initUI(){
        binding.apply {
            btnSecondFrag.setOnClickListener {
                val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(tv_first_frag.text.toString())
                findNavController().navigate(action)
            }
        }
    }
}