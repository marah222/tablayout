package com.example.testkotlinapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter


class  MyAdapterLife (mf : FragmentManager, l: Lifecycle) :  FragmentStateAdapter(mf,l) {
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