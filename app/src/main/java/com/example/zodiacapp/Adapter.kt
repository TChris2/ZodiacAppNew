package com.example.zodiacapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val zodiaclist: ArrayList<Zodiacs>) : RecyclerView.Adapter<Adapter.MyViewHolder>() {
    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val text : TextView = itemView.findViewById(R.id.text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_zodiac,
            parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentItem = zodiaclist[position]
        holder.text.text = currentItem.heading
    }

    override fun getItemCount(): Int {
        return zodiaclist.size
    }
}