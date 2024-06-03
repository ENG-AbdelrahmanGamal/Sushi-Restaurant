package com.example.sushirestaurant.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.sushirestaurant.R
import com.example.sushirestaurant.databinding.FragmentStartBinding


class StartFragment : Fragment() {

private var _binding :FragmentStartBinding?=null
    private val binding get() =_binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding=FragmentStartBinding.inflate(inflater,container,false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btRegister.setOnClickListener(View.OnClickListener {
//            findNavController().navigate(R.id.action_startFragment_to_registerFragment)
            Navigation.findNavController(view).navigate(R.id.action_startFragment_to_registerFragment)
        })
        binding.btSignIN.setOnClickListener(View.OnClickListener {
//            findNavController().navigate(R.id.action_registerFragment_to_signInFragment)
            Navigation.findNavController(view).navigate(R.id.action_startFragment_to_signInFragment)


        })
    }
}