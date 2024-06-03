package com.example.sushirestaurant.order

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

import com.example.sushirestaurant.R
import com.example.sushirestaurant.databinding.FragmentDetailsItemBinding


class DetailsItemFragment : Fragment() {


lateinit var binding:FragmentDetailsItemBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      binding= FragmentDetailsItemBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btAddToCart.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(view).navigate(R.id.myCartFragment)
        })
    }

}