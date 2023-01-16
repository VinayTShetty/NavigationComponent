package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class Frist : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater.inflate(R.layout.fragment_frist, container, false)
        view.findViewById<Button>(R.id.btn_fragmentOne).setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_frist_to_second)
        }
        return view
    }

}