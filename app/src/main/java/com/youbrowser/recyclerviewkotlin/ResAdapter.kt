package com.youbrowser.recyclerviewkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class ResAdapter(val menuList: ArrayList<ResModel> , val context:Context) : RecyclerView.Adapter<ResAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewHolder = LayoutInflater.from(parent.context).inflate(R.layout.ssmple_layout,parent,false)
        return ViewHolder(viewHolder)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.text.text = menuList[position].resName
        holder.resImage.setImageResource(menuList[position].resImage!!)
        holder.text.setOnClickListener(View.OnClickListener {
            Toast.makeText(context, "I am Clicked", Toast.LENGTH_LONG).show()
        })
    }

    override fun getItemCount(): Int {
        return menuList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val text:TextView = itemView.findViewById(R.id.resName)
        val resImage:ImageView = itemView.findViewById(R.id.images)


    }
}