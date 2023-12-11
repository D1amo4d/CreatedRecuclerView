package com.example.createdrecuclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.createdrecuclerview.databinding.ActivityMainBinding
import com.example.createdrecuclerview.ui.home.HomeFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().add(R.id.fr_home, HomeFragment()).commit()
    }
}