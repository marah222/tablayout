package com.example.testkotlinapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private  val mOnNavigationItemSelectedListener =  BottomNavigationView.OnNavigationItemSelectedListener {item ->
        when (item.itemId)  {
            R.id.menu_home -> {
              setContent("Home")
                val fragment =  HomeFragment ()
                addFragment (fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.menu_notification -> {
              setContent("Notification")
                return@OnNavigationItemSelectedListener true
            }
            R.id.menu_search -> {
               setContent("Search")
                return@OnNavigationItemSelectedListener true
            }
            R.id.menu_profile -> {
                setContent("Profile")
                return@OnNavigationItemSelectedListener true
            }
            else -> false
        }
        false
    }
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            bottomNav.setOnNavigationItemSelectedListener (mOnNavigationItemSelectedListener)
            val fragment =  HomeFragment ()
            addFragment (fragment)

    }
    private fun setContent(content: String) {
        setTitle(content)
        tvLabel.text = content
    }
    @SuppressLint("PrivateResource")
    private  fun  addFragment (fragment : Fragment) {
        supportFragmentManager
            .beginTransaction ()
            .setCustomAnimations ( R.anim.design_bottom_sheet_slide_in, R.anim.design_bottom_sheet_slide_out)
            .replace ( R.id.content, fragment, fragment.javaClass.getSimpleName ())
            .commit ()
    }
}