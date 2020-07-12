package com.example.testkotlinapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

@Suppress("DEPRECATION")
class  MyPagerAdapter (fm :  FragmentManager ) :  FragmentPagerAdapter(fm) {

    override  fun  getItem ( position :  Int ) :  Fragment {
        return  when (position) {
            0  -> {
                VoiceCallFragment ()
            }
            else  -> {
                return  VideoCallFragment ()
            }
        }
    }

    override  fun  getCount () :  Int {
        return  2
    }

    override  fun  getPageTitle ( position :  Int ) :  CharSequence {
        return  when (position) {
            0  ->  " Voice Call "
            else  -> {
                return  " Video Call "
            }
        }
    }
}