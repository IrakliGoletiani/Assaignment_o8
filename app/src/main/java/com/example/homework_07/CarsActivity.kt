package com.example.homework_07

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.homework_07.databinding.ActivityCarsBinding

class CarsActivity : AppCompatActivity() {

    lateinit var binding: ActivityCarsBinding

    private val carsList = mutableListOf<Cars>()

    lateinit var adapter: CarsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCarsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setData()
        init()
    }

    private fun setData() {
        repeat(4) {
            carsList.add(Cars(R.mipmap.ic_ferrari, "Ferrari", "Italia"))
            carsList.add(Cars(R.mipmap.ic_lamborghini, "Lamborghini", "Aventador"))
            carsList.add(Cars(R.mipmap.ic_porsche, "Porsche", "911 Turbo S"))
            carsList.add(Cars(R.mipmap.ic_mercedes, "Mercedes", "GT 63 S"))
        }
    }

    private fun init() {
        adapter = CarsAdapter(carsList)
        binding.carsRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.carsRecyclerView.adapter = adapter
    }
}