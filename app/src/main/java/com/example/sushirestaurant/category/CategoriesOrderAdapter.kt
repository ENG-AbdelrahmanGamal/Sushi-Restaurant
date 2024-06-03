package com.example.sushirestaurant.category

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.sushirestaurant.R
import com.example.sushirestaurant.databinding.ItemCategoriesOfOrderBinding

class CategoriesOrderAdapter(val data:List<CategoryOrderModel>): RecyclerView.Adapter<CategoriesOrderAdapter.ViewHolderCategory>() {

    class ViewHolderCategory(val item:ItemCategoriesOfOrderBinding ):RecyclerView.ViewHolder(item.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderCategory {
       val binding=ItemCategoriesOfOrderBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        val viewHolderCategory: ViewHolderCategory = ViewHolderCategory(binding)
        return viewHolderCategory
    }

    override fun getItemCount()=data.size

    override fun onBindViewHolder(holder: ViewHolderCategory, position: Int) {
     holder.item.txTitle.text=data[position].title
        holder.item.txDescriptions.text=data[position].description
        holder.item.imItemCategories.setImageResource(data.get(position).image)
        holder.item.imArr.setOnClickListener(View.OnClickListener {
          Navigation.findNavController(holder.itemView).navigate(R.id.categoryItemFragment)
        })
    }

}

