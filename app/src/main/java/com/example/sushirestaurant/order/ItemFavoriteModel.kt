package com.example.sushirestaurant.order

import com.example.sushirestaurant.R

data class ItemFavoriteModel(val title:String, val des: String, val image:Int){
    companion object {
fun getItem()= listOf(ItemFavoriteModel("Item 1","ahbdb dueya nd bha dga\ndmkdn djua be av", R.drawable.t,),
        ItemFavoriteModel("Item 2","ahbdb dueya nd bha dga\ndmkdn djua be av", R.drawable.ttt),
        ItemFavoriteModel("Item 3","ahbdb dueya nd bha dga\ndmkdn djua be av", R.drawable.tt))
    }
}
