package com.example.sushirestaurant.category

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sushirestaurant.R
import com.example.sushirestaurant.databinding.FragmentCategoriesBinding
import com.example.sushirestaurant.databinding.FragmentCategoryItemBinding
import com.example.sushirestaurant.databinding.ItemItemCategoriesBinding


class CategoriesFragment : Fragment() {

    // categor   secondone

    lateinit var binding: FragmentCategoriesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCategoriesBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerCategory.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = CategoriesOrderAdapter(CategoryOrderModel.getOrderCategory())
        }
    }
}