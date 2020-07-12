package com.example.testkotlinapp

import android.util.SparseArray
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT

class MyPagersAdapter(fragmentManager: FragmentManager, private val fragments: List<Fragment>)
    : FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val retainedFragments: SparseArray<Fragment> = SparseArray()

    override fun getItem(position: Int): Fragment {
        return if (retainedFragments.get(position) != null)
            retainedFragments.get(position)
        else
            fragments[position]
    }

    override fun getCount() = this.fragments.size

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val fragment = super.instantiateItem(container, position) as Fragment
        retainedFragments.put(position, fragment)

        return fragment
    }

    override fun destroyItem(container: ViewGroup, position: Int, view: Any) {
        if (retainedFragments.get(position) != null) {
            retainedFragments.remove(position)
        }
        super.destroyItem(container, position, view)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return if (position == 0)
           "tab 0"
        else
            "tab 1"
    }
}