package com.example.testkotlinapp

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.get
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_voice_call.view.*

class HomeFragment : Fragment() {
    private lateinit var viewPager: ViewPager2
    private lateinit var tabs: TabLayout

    private lateinit var pagersAdapter: MyPagersAdapter
    private val fragments: MutableList<Fragment> = mutableListOf()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        viewPager = view.findViewById(R.id.viewpager_main)
        tabs = view.findViewById(R.id.tabs_main)
        Log.d("HomeFragment", "onCreate: ")
       // viewPager.adapter = MyAdapterLife(this.getChildFragmentManager(), this.getLifecycle())
        viewPager.adapter = ViewPagerFragmentAdapter(childFragmentManager, this.getLifecycle())

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        TabLayoutMediator(tabs, viewPager) { tab, position ->
            tab.text = when(position) {
                0 -> "Size"
                else -> "Template"
            }
            Log.d("HomeFragment", "onViewCreated:TabLayoutMediator ")
            viewPager.setCurrentItem(tab.position, true)
        }.attach()
    }

}