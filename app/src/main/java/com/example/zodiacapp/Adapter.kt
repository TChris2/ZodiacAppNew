package com.example.zodiacapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val zodiaclist: ArrayList<Zodiacs>) : RecyclerView.Adapter<Adapter.MyViewHolder>() {

    //new stuff
    private lateinit var mListener : onItemClickListener
    interface onItemClickListener{
        fun onItemClick(position: Int)
    }
    //new stuff
    fun setOnItemClickListener(listener : onItemClickListener) {
        mListener = listener
    }
    class MyViewHolder(itemView : View, listener : onItemClickListener) : RecyclerView.ViewHolder(itemView) {
        val text : TextView = itemView.findViewById(R.id.text)

        //new stuff
        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_zodiac,
            parent, false)
        return MyViewHolder(view, mListener)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentItem = zodiaclist[position]
        holder.text.text = currentItem.heading
    }

    override fun getItemCount(): Int {
        return zodiaclist.size
    }
}