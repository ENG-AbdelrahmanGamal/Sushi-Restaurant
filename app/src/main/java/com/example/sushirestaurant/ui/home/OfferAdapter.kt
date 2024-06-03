package com.example.sushirestaurant.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.sushirestaurant.databinding.ItemOfferListBinding

class OfferAdapter(val data: List<OfferModel>): RecyclerView.Adapter<OfferAdapter.OfferViewHolder>() {

class OfferViewHolder(val item :ItemOfferListBinding) :RecyclerView.ViewHolder(item.root){

}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OfferViewHolder {
        val binding=ItemOfferListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        val offerViewHolder:OfferViewHolder=OfferViewHolder(binding)
return offerViewHolder
    }

    override fun getItemCount()=data.size

    override fun onBindViewHolder(holder: OfferViewHolder, position: Int) {
       holder.item.tvTitile.text=data[position].name
        holder.item.tvAppointment.text=data[position].date
        holder.item.imItemGetOffer.setImageResource(data.get(position).image)
    }

}