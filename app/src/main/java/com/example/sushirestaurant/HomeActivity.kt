package com.example.sushirestaurant

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import com.example.sushirestaurant.databinding.ActivityHomeBinding
import com.example.sushirestaurant.ui.home.HomeFragment

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)


   }
    override fun onBackPressed() {
        val fragment = supportFragmentManager.findFragmentById(R.id.drawer_layout )

        // Check if the current fragment is an instance of your custom Fragment
        if (fragment is HomeFragment) {
            // Call onBackPressed method of your fragment
            fragment.onBackPressed()
        } else {
            super.onBackPressed() // If not, perform default back button behavior
        }
    }

}