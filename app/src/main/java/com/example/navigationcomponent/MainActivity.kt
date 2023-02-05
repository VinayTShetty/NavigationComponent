package com.example.navigationcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomNavigationView=findViewById<BottomNavigationView>(R.id.bottom_navigation_view_id)
        val navigationControlloer=findNavController(R.id.fragmentContainerView)
        /**
         * This will make the navigation of fragment to corresponding Fragments.
         */
        bottomNavigationView.setupWithNavController(navigationControlloer)
        val appBarConfiguration= AppBarConfiguration(setOf(R.id.fristFragment,R.id.secondFragment,R.id.thirdFragment))
        /**
         * Change toolbar text w.r.t fragment change
         */
        setupActionBarWithNavController(navigationControlloer,appBarConfiguration)
    }
}