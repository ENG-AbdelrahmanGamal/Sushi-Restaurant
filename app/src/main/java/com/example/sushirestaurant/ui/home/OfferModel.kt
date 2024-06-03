package com.example.sushirestaurant.ui.home

import com.example.sushirestaurant.R

data class OfferModel (val name:String,val date:String,val image:Int){
    companion object{
        fun getOffer()= listOf(
            OfferModel("Free lyrimShrimp","Friday", R.drawable.t),
            OfferModel("50%\ndiscount on prtof","15:00 to 20:30",R.drawable.tt),
            OfferModel("Free lyrimShrimp","Sunday",R.drawable.ttt),
            OfferModel("75%\ndiscount on prtof","15:00 to 20:30",R.drawable.tttt),
            OfferModel("Free lyrimShrimp","Friday", R.drawable.t),
            OfferModel("50%\ndiscount on prtof","15:00 to 20:30",R.drawable.tt),
            OfferModel("Free lyrimShrimp","Sunday",R.drawable.ttt),
            OfferModel("75%\ndiscount on prtof","15:00 to 20:30",R.drawable.tttt),
        )
    }
}
