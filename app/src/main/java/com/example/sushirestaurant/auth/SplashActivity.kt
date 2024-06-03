package com.example.sushirestaurant.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.sushirestaurant.R
import com.example.sushirestaurant.StartActivity

class SplashActivity : AppCompatActivity() {

    private val splashScreenDuration: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)
Handler().postDelayed({
    var intent=Intent(this, StartActivity::class.java)
    startActivity(intent)
    finish()
},splashScreenDuration)


    }
}