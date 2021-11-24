package com.amanullah.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.amanullah.viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        binding.textView.text = viewModel.number.toString()

        binding.addButton.setOnClickListener {
            viewModel.addNumber()
            binding.textView.text = viewModel.number.toString()
        }
    }
}