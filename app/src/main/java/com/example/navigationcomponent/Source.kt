package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.model.User

class Source : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_source, container, false)
        view.findViewById<Button>(R.id.send_button_id).setOnClickListener({
            val userName = view.findViewById<EditText>(R.id.edttxt_id_username).text.toString()
            val password = view.findViewById<EditText>(R.id.edttxt_id_password).text.toString()
            val user = User(userName, password)
            val action = SourceDirections.actionSourceToDestination(user)
            findNavController().navigate(action)
        })
        return view
    }
}