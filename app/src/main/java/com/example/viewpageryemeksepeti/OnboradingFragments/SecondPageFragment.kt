package com.example.viewpageryemeksepeti.OnboradingFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpageryemeksepeti.databinding.FragmentSecondPageBinding


class SecondPageFragment : Fragment() {
    private var _binding: FragmentSecondPageBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSecondPageBinding.inflate(inflater, container, false)
        val view = binding.root

        mainFunc()

        return view
    }

    private fun mainFunc() {
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}