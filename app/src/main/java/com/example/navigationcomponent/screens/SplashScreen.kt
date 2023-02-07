package com.example.navigationcomponent.screens

import android.content.Context
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.R


/**
 * A simple [Fragment] subclass.
 * Use the [SplashScreen.newInstance] factory method to
 * create an instance of this fragment.
 */
class SplashScreen : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Handler().postDelayed({
            if (onBoardingFinished())
                findNavController().navigate(R.id.action_splashScreen_to_homeScreen)
            else
                findNavController().navigate(R.id.action_splashScreen_to_viewPagerFragment)


        }, 2000)
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.splash_screen, container, false)
    }

    private fun onBoardingFinished(): Boolean {
        val shardpref = requireActivity().getSharedPreferences("ON_BOARDING", Context.MODE_PRIVATE)
        return shardpref.getBoolean("FINISHED", false)
    }
}