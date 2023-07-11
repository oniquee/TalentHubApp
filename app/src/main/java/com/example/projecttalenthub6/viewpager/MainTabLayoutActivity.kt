package com.example.projecttalenthub6.viewpager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.projecttalenthub6.databinding.ActivityMainTabLayoutBinding

class MainTabLayoutActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainTabLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainTabLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setTabLayout()

    }

    private fun setTabLayout() {
        val vpAdapter = MainTabLayoutPagerAdapter(supportFragmentManager)

        binding.vpViewPager.adapter = vpAdapter

        binding.tlTabLayout.setupWithViewPager(binding.vpViewPager)

    }

}