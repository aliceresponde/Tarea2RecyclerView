package com.aliceresponde.tarea2recyclerview

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.aliceresponde.tarea2recyclerview.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_detail.*

class MainActivity : AppCompatActivity(), CityAdapter.ClickListener {
    private lateinit var binding: ActivityMainBinding
    private  val adapter:  CityAdapter by lazy { CityAdapter(getCities(), this@MainActivity)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.cityRv.adapter = adapter
        setContentView(binding.root)
    }

    override fun onItemClickListener(city: City) {
        Log.d("click on", city.name)
        val intent = Intent(this, DetailActivity::class.java).apply {
            putExtra("KEY_CITY", city)
        }
        startActivity(intent)
    }

    private fun getCities(): List<City> {
        return listOf(
            City("Bogota", "Capital de Colombia"),
            City("Villavicencio", "Portal del llano"),
            City("Restreo", "Tierra de Oportunudades"),
            City("Cali", "Pachanguero"),
            City("Neiva", "Tierra de opitas"),
            City("Barranquilla", "Ciudad de cantores"),
            City("Bogota", "Capital de Colombia"),
            City("Villavicencio", "Portal del llano"),
            City("Restreo", "Tierra de Oportunudades"),
            City("Cali", "Pachanguero"),
            City("Neiva", "Tierra de opitas"),
            City("Barranquilla", "Ciudad de cantores")
        )
    }
}