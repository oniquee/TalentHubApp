package com.example.projecttalenthub6

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.projecttalenthub6.databinding.ActivityMainBinding
import com.example.projecttalenthub6.exercisenavcomponent.MainNavComponentActivity
import com.example.projecttalenthub6.firebaserealtimedb.FirebaseRealtimeDBActivity
import com.example.projecttalenthub6.networking.HomeListUsersActivity
import com.example.projecttalenthub6.sharedpreferences.SharedPreferencesActivity
import com.example.projecttalenthub6.viewpager.MainTabLayoutActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setMoveToOtherActivity()

//        val textView = findViewById<TextView>(R.id.tv_text)

        binding.tvText.text = String.format("Hello TalentHub Class!")

//        textView.text = String.format("Hello TalentHub Class!")

//        setUI()

    }

    private fun setMoveToOtherActivity() {
        binding.btnMainActivity.setOnClickListener {
            val i = Intent(this, SecondMainActivity::class.java)
            startActivity(i)
        }

        binding.btnMoveToNavComponent.setOnClickListener {
            val i = Intent(this, MainNavComponentActivity::class.java)
            startActivity(i)
        }

        binding.btnMoveToViewPager.setOnClickListener {
            val i = Intent(this, MainTabLayoutActivity::class.java)
            startActivity(i)
        }

        binding.btnMoveToListGithubUsers.setOnClickListener {
            val i = Intent(this, HomeListUsersActivity::class.java)
            startActivity(i)
        }

        binding.btnMoveToSharedPreference.setOnClickListener {
            val i = Intent(this, SharedPreferencesActivity::class.java)
            startActivity(i)
        }

        binding.btnMoveToFirebaseRealtimeDb.setOnClickListener {
            val i = Intent(this, FirebaseRealtimeDBActivity::class.java)
            startActivity(i)
        }

    }


//        private fun setUI() {
//            binding.apply {
//                tvText
//            }
//        }

}