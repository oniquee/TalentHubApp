package com.example.projecttalenthub6.exercisenavcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.projecttalenthub6.R
import com.example.projecttalenthub6.databinding.ActivityMainNavComponentBinding

class MainNavComponentActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainNavComponentBinding

    private lateinit var navController : NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainNavComponentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        settingNavComponent()

    }


    private fun settingNavComponent() {
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment

        navController = navHostFragment.navController

    }

}