package com.example.sushirestaurant.auth

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.sushirestaurant.ui.home.HomeActivity
import com.example.sushirestaurant.R
import com.example.sushirestaurant.databinding.FragmentSignInBinding

class SignInFragment : Fragment() {


private var _binding :FragmentSignInBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding=FragmentSignInBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvRegister.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_signInFragment_to_registerFragment)

        })
        binding.btSignIN.setOnClickListener(View.OnClickListener {
            var intent=Intent(requireContext(), HomeActivity::class.java)
            startActivity(intent)

        })

    }
}