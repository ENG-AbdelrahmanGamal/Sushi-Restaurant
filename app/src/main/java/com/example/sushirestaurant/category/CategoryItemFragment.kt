package com.example.sushirestaurant.category

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sushirestaurant.R
import com.example.sushirestaurant.category.ItemCategoryModel.Companion.getItem
import com.example.sushirestaurant.databinding.FragmentCategoryItemBinding


class CategoryItemFragment : Fragment() {


    lateinit var  binding :FragmentCategoryItemBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
   binding= FragmentCategoryItemBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.recyclerItemCategory.apply {
            layoutManager=LinearLayoutManager(requireContext())
          adapter=ItemCategoriesAdapter(getItem())
        }
    }
}