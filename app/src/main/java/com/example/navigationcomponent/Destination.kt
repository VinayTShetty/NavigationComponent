package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.navArgs

class Destination : Fragment() {

    private val args by navArgs<DestinationArgs>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragmentval
       val view=  inflater.inflate(R.layout.fragment_destination, container, false)
        view.findViewById<TextView>(R.id.txtVw_received_data_id).text=args.currentuser.userName.toString()+"\n"+args.currentuser.passwrd.toString()
      //  view.findViewById<ImageView>(R.id.imagesource_dest_id).setImageDrawable(args.currentuser.imageAuth)
        return view
    }
}