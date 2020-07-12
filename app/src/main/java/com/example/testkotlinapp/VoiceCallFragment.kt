package com.example.testkotlinapp

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_voice_call.*

class VoiceCallFragment : Fragment() {
    companion object {
        fun newInstance() = VoiceCallFragment()
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        Log.d("HomeFragment", "1VoiceCallFragment:onCreate: ")
        val view: View = inflater.inflate(R.layout.fragment_voice_call, container, false)
        return view
    }
}
