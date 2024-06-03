package com.example.sushirestaurant.profile

 class UserProfile(val name:String,val email:String,val password:String,val lnauguage: Language)
{

    companion object{
        fun getUser()={
            UserProfile("Abdelrahman Gamal","abdelrahmansoby92@gmail.com","abdo123",
                Language.ARABIC
            )

        }
    }
    enum class Language(val language: String){
        ENGLISH("English"), ARABIC("Arabic")
    }

    override fun toString(): String {
        return "UserProfile(name='$name', email='$email', password='$password', lnauguage=$lnauguage)"
    }
}
