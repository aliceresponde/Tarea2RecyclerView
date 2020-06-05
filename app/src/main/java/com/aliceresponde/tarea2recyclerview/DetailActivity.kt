package com.aliceresponde.tarea2recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aliceresponde.tarea2recyclerview.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mCity: City = intent.getParcelableExtra("KEY_CITY")
        binding.cityName.text = mCity.name
        binding.cityDesc.text = mCity.description
    }
}