package com.example.sushirestaurant.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.sushirestaurant.R
import com.example.sushirestaurant.databinding.FragmentRegisterBinding


class RegisterFragment : Fragment() {

 private var _binding:FragmentRegisterBinding?=null
    private val binding  get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentRegisterBinding.inflate(inflater,container,false)
        return binding.root


    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvSignIn.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_registerFragment_to_signInFragment)
        })
    }
}