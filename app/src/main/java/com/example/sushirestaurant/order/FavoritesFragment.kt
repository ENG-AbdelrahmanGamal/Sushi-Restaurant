package com.example.sushirestaurant.order

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sushirestaurant.R
import com.example.sushirestaurant.databinding.FragmentFavoritesBinding
import com.example.sushirestaurant.order.ItemFavoriteModel.Companion.getItem


class FavoritesFragment : Fragment() {

        lateinit var binding:FragmentFavoritesBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding= FragmentFavoritesBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerViewFav.apply {
            layoutManager=LinearLayoutManager(requireContext())
            adapter=ItemFavoritesAdaptor(getItem())


        }

    }



}