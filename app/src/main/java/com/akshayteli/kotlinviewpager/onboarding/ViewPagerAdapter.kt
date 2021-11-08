package com.akshayteli.kotlinviewpager.onboarding

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import java.util.ArrayList

/**
 * Created by Akshay Teli on 05,November,2021
 */
class ViewPagerAdapter(list:ArrayList<Fragment>,fm:FragmentManager,lifecycle: Lifecycle): FragmentStateAdapter(fm, lifecycle) {

   private val fragmentList = list

    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }


}