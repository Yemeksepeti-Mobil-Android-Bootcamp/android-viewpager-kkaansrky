package com.example.viewpageryemeksepeti.Onboarding

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpageryemeksepeti.OnboradingFragments.FirstPageFragment
import com.example.viewpageryemeksepeti.OnboradingFragments.SecondPageFragment
import com.example.viewpageryemeksepeti.OnboradingFragments.ThirdPageFragment

private const val FRAGMENT_COUNT = 3

class OnboardingAdapter(requireActivity: FragmentActivity) : FragmentStateAdapter(requireActivity) {


    override fun getItemCount(): Int = FRAGMENT_COUNT

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FirstPageFragment()
            1 -> SecondPageFragment()
            2 -> ThirdPageFragment()
            else -> FirstPageFragment()
        }
    }

}
