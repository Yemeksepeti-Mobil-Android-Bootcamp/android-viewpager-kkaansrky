package com.example.viewpageryemeksepeti

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

private val FRAGMENT_COUNT = 3

class OnboardingAdapter(requireActivity: FragmentActivity) : FragmentStateAdapter(requireActivity) {


    override fun getItemCount(): Int = FRAGMENT_COUNT

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FirstPageFragment()
            1 -> SecondPageFragment()
            2 -> ThirdPageFragment()
            //else -> ErrorPageFragment()
            else -> FirstPageFragment()
        }
    }

}
