package com.example.sushirestaurant.category

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sushirestaurant.databinding.ItemItemCategoriesBinding

class ItemCategoriesAdapter(val data:List<ItemCategoryModel>): RecyclerView.Adapter<ItemCategoriesAdapter.ItemViewHolder>() {


    class ItemViewHolder(val item:ItemItemCategoriesBinding):RecyclerView.ViewHolder(item.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
       val  binding:ItemItemCategoriesBinding=ItemItemCategoriesBinding.inflate(LayoutInflater.from(parent.context),parent,false)
       val itemViewHolder=ItemViewHolder(binding)
        return itemViewHolder
    }

    override fun getItemCount()=data.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.item.txItItTitle.text=data[position].itemName
        holder.item.txItItDescriptions.text=data[position].itemDiscrip
        holder.item.txItItPrice.text= data[position].itemPrice.toString()
        holder.item.imItemItemCategories.setImageResource(data.get(position).itemImage)

    }
}