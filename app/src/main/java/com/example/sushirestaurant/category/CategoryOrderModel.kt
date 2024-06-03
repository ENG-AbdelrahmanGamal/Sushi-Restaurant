package com.example.sushirestaurant.category

import com.example.sushirestaurant.R

data class CategoryOrderModel(val title: String, val description: String, val image: Int) {
    companion object {
        fun getOrderCategory() = listOf(
            CategoryOrderModel(
                "Category 1",
                "ahbdb dueya nd bha dga\ndmkdn djua be av",
                R.drawable.t
            ),
            CategoryOrderModel(
                "Category 2",
                "ahbdb dueya nd bha dga\ndmkdn djua be av",
                R.drawable.tt
            ),
            CategoryOrderModel(
                "Category 3",
                "ahbdb dueya nd bha dga\ndmkdn djua be av",
                R.drawable.ttt
            ),

            CategoryOrderModel(
                "Category 4",
                "ahbdb dueya nd bha dga\ndmkdn djua be av",
                R.drawable.tttt
            ),

        CategoryOrderModel(
        "Category 5",
        "ahbdb dueya nd bha dga\ndmkdn djua be av",
        R.drawable.tttt
        ))

    }
}

