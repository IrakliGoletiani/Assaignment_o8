package com.example.homework_07

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework_07.databinding.ItemsCarsLayoutBinding

class CarsAdapter(private val carsList: MutableList<Cars>) :
    RecyclerView.Adapter<CarsAdapter.CarsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarsViewHolder {
        val binding =
            ItemsCarsLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return CarsViewHolder(binding)
    }

    override fun getItemCount() = carsList.size

    override fun onBindViewHolder(holder: CarsViewHolder, position: Int) {
        holder.onBind()
    }

    inner class CarsViewHolder(private val binding: ItemsCarsLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind() {
            val model = carsList[adapterPosition]
            binding.tvBrand.text = model.brand
            binding.tvModel.text = model.model
            binding.ivImage.setImageResource(model.image)
        }
    }
}