package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs

class Second : Fragment() {
   // val secondArgs:SecondArgs by navArgs()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view= inflater.inflate(R.layout.fragment_second, container, false)
     //   val numebr=secondArgs.number
        view.findViewById<Button>(R.id.btn_fragmenttwo).setOnClickListener(){
            Navigation.findNavController(view).navigate(R.id.action_second_to_frist)
        }
       // view.findViewById<TextView>(R.id.txtvw_fragment_two).text=numebr.toString()
        return view
    }
}