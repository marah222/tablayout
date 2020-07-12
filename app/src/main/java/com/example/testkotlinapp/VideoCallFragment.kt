package com.example.testkotlinapp

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_video_call.*

class VideoCallFragment() : Fragment() {
    companion object {
        fun newInstance() = VideoCallFragment()
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        Log.d("HomeFragment", "VideoCallFragment:onCreate: ")
        val view: View = inflater.inflate(R.layout.fragment_video_call, container, false)
        return view
    }

}
