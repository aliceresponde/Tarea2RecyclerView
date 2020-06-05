package com.aliceresponde.tarea2recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CityAdapter(val cityList: List<City>, val listener: CityAdapter.ClickListener) :
    RecyclerView.Adapter<CityAdapter.CityViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.city_item_layout, parent, false)
        return CityViewHolder(view)
    }

    override fun getItemCount(): Int {
        return cityList.size
    }

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        holder.onBind(cityList[position])
    }

    inner class CityViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun onBind(city: City) {
            val nameTv = view.findViewById<TextView>(R.id.cityName)
            val descTV = view.findViewById<TextView>(R.id.cityDesc)

            nameTv.text = city.name
            descTV.text = city.description
            view.setOnClickListener {
                listener.onItemClickListener(city)
            }
        }
    }

    interface ClickListener {
        fun onItemClickListener(city: City)
    }
}
