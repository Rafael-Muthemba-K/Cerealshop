package com.example.cerealsorderingapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CerealAdapter(private val cereals: List<Cereal>) : RecyclerView.Adapter<CerealAdapter.CerealViewHolder>() {

    // ViewHolder class to hold the views
    class CerealViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cerealName: TextView = itemView.findViewById(R.id.cereal_name)
        val cerealPrice: TextView = itemView.findViewById(R.id.cereal_price)
        // Add more views as needed
    }

    // Called when RecyclerView needs a new ViewHolder of the given type to represent an item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CerealViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_cereal, parent, false)
        return CerealViewHolder(view)
    }

    // Called by RecyclerView to display the data at the specified position
    override fun onBindViewHolder(holder: CerealViewHolder, position: Int) {
        val cereal = cereals[position]
        holder.cerealName.text = cereal.name
        holder.cerealPrice.text = cereal.price.toString()
        // Bind other views as needed
    }

    // Returns the total number of items in the data set held by the adapter
    override fun getItemCount(): Int {
        return cereals.size
    }
}
