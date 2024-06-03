package com.example.sushirestaurant.order

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.sushirestaurant.R
import com.example.sushirestaurant.databinding.ItemFavoriteBinding

class ItemFavoritesAdaptor(val data :List<ItemFavoriteModel>): RecyclerView.Adapter<ItemFavoritesAdaptor.ItemFavViewHolder>() {

class ItemFavViewHolder(val item:ItemFavoriteBinding):RecyclerView.ViewHolder(item.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemFavViewHolder {
        val binding:ItemFavoriteBinding= ItemFavoriteBinding.inflate(LayoutInflater.from(parent.context),parent,false)
       val itemFavViewHolder:ItemFavViewHolder= ItemFavViewHolder(binding)
        return itemFavViewHolder
    }

    override fun getItemCount()=data.size

    override fun onBindViewHolder(holder: ItemFavViewHolder, position: Int) {
       holder.item.txItFavTitle.text=data[position].title
        holder.item.txItFavDescriptions.text=data[position].des
        holder.item.imFav.setImageResource(data.get(position).image)
        holder.item.fabMyHeart.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(holder.itemView).navigate(R.id.detailsItemFragment)
        })
    }
}