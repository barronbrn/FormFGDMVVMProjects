package com.example.formfgdmvvmprojects.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.formfgdmvvmprojects.R
import com.example.formfgdmvvmprojects.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, InputFragment())
            .commit()

    }
}