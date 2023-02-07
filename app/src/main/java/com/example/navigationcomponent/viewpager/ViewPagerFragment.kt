package com.example.navigationcomponent.viewpager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.navigationcomponent.R
import com.example.navigationcomponent.screens.FristScreen
import com.example.navigationcomponent.screens.SecondScreen
import com.example.navigationcomponent.screens.ThirdScreen


/**
 * A simple [Fragment] subclass.
 * Use the [ViewPagerFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ViewPagerFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view= inflater.inflate(R.layout.fragment_view_pager, container, false)
        val fragmnetlist= arrayListOf<Fragment>(
            FristScreen(),
            SecondScreen(),
            ThirdScreen(),
        )
        val adpater_slide_screen=ViewPagerAdapter(fragmnetlist,requireActivity().supportFragmentManager,lifecycle)
        view.findViewById<ViewPager2>(R.id.viewpager_id).adapter=adpater_slide_screen
        return view
    }
}