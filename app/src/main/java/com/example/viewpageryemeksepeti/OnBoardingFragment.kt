package com.example.viewpageryemeksepeti

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpageryemeksepeti.databinding.FragmentOnBoardingBinding

class OnBoardingFragment : Fragment() {
    private var _binding: FragmentOnBoardingBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOnBoardingBinding.inflate(inflater, container, false)
        val view = binding.root

        mainFunc()

        return view
    }

    private fun mainFunc() {
        val adapter = OnboardingAdapter(requireActivity())
        //We set the class we created to add animation to the Viewpager
        //binding.viewPager2.setPageTransformer(VerticalFlipTransformer())
        binding.viewPager2.adapter = adapter
        binding.wormDots.setViewPager2(binding.viewPager2)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}