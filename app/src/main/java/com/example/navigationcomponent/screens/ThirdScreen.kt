package com.example.navigationcomponent.screens

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.navigationcomponent.R


/**
 * A simple [Fragment] subclass.
 * Use the [ThirdScreen.newInstance] factory method to
 * create an instance of this fragment.
 */
class ThirdScreen : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_third_screen, container, false)
        val viewpager=activity?.findViewById<ViewPager2>(R.id.viewpager_id)
        view.findViewById<Button>(R.id.next_button_id).setOnClickListener({
            findNavController().navigate(R.id.action_viewPagerFragment_to_homeScreen)
            onBoardingFinished()
        })
        return view
    }

    private fun onBoardingFinished(){
        val shardpref=requireActivity().getSharedPreferences("ON_BOARDING",Context.MODE_PRIVATE)
        val editor=shardpref.edit()
        editor.putBoolean("FINISHED",true)
        editor.apply()
    }
}