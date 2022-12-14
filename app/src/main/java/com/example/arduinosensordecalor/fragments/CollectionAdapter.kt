package com.example.arduinosensordecalor.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.arduinosensordecalor.TemperatureFragment

class CollectionAdapter(fm: FragmentActivity) :
    FragmentStateAdapter(fm) {

    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> TemperatureFragment()
            1 -> HumidityFragment()
            else -> throw IllegalStateException("Unexpected position $position")
        }
    }
}