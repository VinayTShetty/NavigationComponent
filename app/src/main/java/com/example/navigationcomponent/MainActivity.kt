package com.example.navigationcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var navController:NavController
    private lateinit var drawerLayout:DrawerLayout
    private lateinit var appBarConfigaration:AppBarConfiguration

    private lateinit var navigationView: NavigationView
    private lateinit var listner:NavController.OnDestinationChangedListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navController=findNavController(R.id.fragment)
        drawerLayout=findViewById(R.id.drawerLayout)
        appBarConfigaration= AppBarConfiguration(navController.graph,drawerLayout)

        navigationView=findViewById(R.id.navigationView)
        navigationView.setupWithNavController(navController)
        setupActionBarWithNavController(navController,appBarConfigaration)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController=findNavController(R.id.fragment)
        return navController.navigateUp(appBarConfigaration)|| super.onSupportNavigateUp()
    }
}