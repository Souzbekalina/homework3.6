package com.alina.homework36

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alina.homework36.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().add(R.id.one_container, FirstFragment()).commit()
        supportFragmentManager.beginTransaction().add(R.id.two_container, SecondFragment()).commit()

    }
}