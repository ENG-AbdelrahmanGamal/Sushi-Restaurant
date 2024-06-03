package com.example.sushirestaurant.category

import android.media.Image
import com.example.sushirestaurant.R

data class ItemCategoryModel(val itemName:String,val itemDiscrip:String,val itemPrice:Double,val itemImage: Int){
    companion object{
        fun getItem()= listOf(ItemCategoryModel("item 1","Categories decriptions to put here to represent the info on items1",49.99,
            R.drawable.t),
            ItemCategoryModel("item 1","Categories decriptions to put here to represent the info on items1",49.99,
                R.drawable.ttt),
            ItemCategoryModel("item 2","Categories decriptions to put here to represent the info on items1",49.99,
                R.drawable.tt),
            ItemCategoryModel("item 3","Categories decriptions to put here to represent the info on items1",49.99,
                R.drawable.t),
            ItemCategoryModel("item 4","Categories decriptions to put here to represent the info on items1",49.99,
                R.drawable.ttt),
            ItemCategoryModel("item 5","Categories decriptions to put here to represent the info on items1",49.99,
                R.drawable.tt),
            ItemCategoryModel("item 6","Categories decriptions to put here to represent the info on items1",49.99,
                R.drawable.t),
            ItemCategoryModel("item 7","Categories decriptions to put here to represent the info on items1",49.99,
                R.drawable.t),
            )
    }
}

