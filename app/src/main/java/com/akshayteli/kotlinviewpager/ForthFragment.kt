package com.akshayteli.kotlinviewpager

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2


class ForthFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_forth, container, false)


        val finish = view.findViewById<TextView>(R.id.finish)

        finish.setOnClickListener {
            findNavController().navigate(R.id.action_viewPagerFragment_to_homeFragment)
            isOnBoardingDone()
        }




        return view
    }

    private fun isOnBoardingDone(){

        val sharedpref = requireActivity()?.getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedpref.edit()
        editor.putBoolean("Finished",true)
        editor.apply()

    }


}