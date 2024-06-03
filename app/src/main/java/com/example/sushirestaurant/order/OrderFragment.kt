package com.example.sushirestaurant.order

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sushirestaurant.R
import com.example.sushirestaurant.category.CategoriesOrderAdapter
import com.example.sushirestaurant.category.CategoryOrderModel.Companion.getOrderCategory
import com.example.sushirestaurant.databinding.FragmentOrderBinding


class OrderFragment : Fragment() {


    lateinit var binding: FragmentOrderBinding
   // var categoryOrderModel=CategoryOrderModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentOrderBinding.inflate(layoutInflater)
       return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

binding.fabMyfav.setOnClickListener(View.OnClickListener {
Navigation.findNavController(view).navigate(R.id.favoritesFragment)
})
binding.fabMyCart.setOnClickListener(View.OnClickListener {
    Navigation.findNavController(view).navigate(R.id.myCartFragment)


})
    }
}