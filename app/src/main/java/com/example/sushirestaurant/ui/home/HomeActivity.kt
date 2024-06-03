package com.example.sushirestaurant.ui.home

import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle

import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.navigation.findNavController
import com.example.sushirestaurant.R
import com.example.sushirestaurant.databinding.ActivityHomeBinding
import com.google.android.material.navigation.NavigationView

class HomeActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var binding: ActivityHomeBinding
    private val TAG = "HomeActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.navViewActivity.setNavigationItemSelectedListener(this)

        val drawer = ActionBarDrawerToggle(
            this,
            binding.drawerLayoutActivity,
            binding.toolbarActivity,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        binding.drawerLayoutActivity.addDrawerListener(drawer)
        drawer.syncState()


    }

    override fun onBackPressed() {

        // Check if the current fragment is an instance of your custom Fragment
        if (binding.drawerLayoutActivity.isDrawerOpen(GravityCompat.START)) {
            binding.drawerLayoutActivity.closeDrawer(Gravity.LEFT)

        } else {
            super.onBackPressed() // If not, perform default back button behavior
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        binding.drawerLayoutActivity.closeDrawer(Gravity.LEFT)
        when (item.itemId) {
            R.id.nav_home -> {
                Toast.makeText(this, "Home", Toast.LENGTH_LONG).show()
                navigate(R.id.nav_home)

            }

            R.id.nav_order -> {
                navigate(R.id.orderFragment)
            }

            R.id.nav_menu -> {
                navigate(R.id.menuFragment)


            }

            R.id.nav_restaurant -> {

                navigate(R.id.restaurantFragment)
            }

            R.id.nav_favourites -> {

                navigate(R.id.favoritesFragment)

            }

            R.id.nav_my_cart -> {

                navigate(R.id.myCartFragment)

            }

            R.id.nav_my_account -> {
                navigate(R.id.profileFragment)

            }

        }




        return true
    }

    private fun navigate(id: Int) {
        val navController = findNavController(R.id.fragment_container_view_start)
        navController.navigate(id)
    }


}


