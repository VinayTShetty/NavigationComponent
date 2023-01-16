package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class Second : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view= inflater.inflate(R.layout.fragment_second, container, false)
        view.findViewById<Button>(R.id.btn_fragmenttwo).setOnClickListener(){
            Navigation.findNavController(view).navigate(R.id.action_second_to_frist)
        }
        return view
    }

}