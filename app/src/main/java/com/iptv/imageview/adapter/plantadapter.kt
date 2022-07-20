package com.iptv.imageview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.iptv.imageview.R

class plantadapter:RecyclerView.Adapter<plantadapter.ViewHolder>() {


    class ViewHolder(view:View):RecyclerView.ViewHolder(view){
        val PlantImage=view.findViewById<ImageView>(R.id.image_item)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(
            parent.context).inflate(R.layout.item_horizontal_plant,parent,false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }


    override fun getItemCount(): Int =19
}