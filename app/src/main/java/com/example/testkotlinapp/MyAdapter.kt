package com.example.testkotlinapp

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter


class  MyAdapter (f : Fragment) :  FragmentStateAdapter(f) {
    override fun getItemCount(): Int {
     return 2
    }

    override fun createFragment(position: Int): Fragment {
      //  Log.d("HomeFragment", "createFragment :: position: "+position)
        return when(position) {
            0 -> {
                VoiceCallFragment.newInstance()
            }
            else -> {
                VideoCallFragment.newInstance()
            }
        }
    }
}