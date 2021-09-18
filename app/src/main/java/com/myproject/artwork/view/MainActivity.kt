package com.myproject.artwork.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.myproject.artwork.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initialView()


    }

    private fun initialView() {
        val homeFragment = HomeFragment()
        val favoriteFragment = FavortiteFragment()
        val settingFragment = SettingFragment()
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        setCurrentFragment(homeFragment)

        bottomNavigationView.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.menu_home -> this.setCurrentFragment(homeFragment)
                R.id.menu_favorite -> this.setCurrentFragment(favoriteFragment)
                R.id.menu_setting -> this.setCurrentFragment(settingFragment)
            }
            true
        }


    }

    private fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .apply {
                replace(R.id.fragment_container_view, fragment)
                commit()
            }
    }
}


