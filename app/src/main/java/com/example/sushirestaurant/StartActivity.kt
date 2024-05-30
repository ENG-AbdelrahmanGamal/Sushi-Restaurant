package com.example.sushirestaurant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.example.sushirestaurant.databinding.StartScreenBinding

class StartActivity : AppCompatActivity() {
    lateinit var binding:StartScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=StartScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}