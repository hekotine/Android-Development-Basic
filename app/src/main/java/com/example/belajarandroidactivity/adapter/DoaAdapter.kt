package com.example.belajarandroidactivity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.R
import com.example.belajarandroidactivity.model.doa

class DoaAdapter (val data:ArrayList<doa>)
    : RecyclerView.Adapter<DoaAdapter.DoaViewHolder>()
{
    class DoaViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val tvDoasunnah: TextView = view.findViewById(R.id.tvDoasunnah)
        val ivDzikirdoa: ImageView = view.findViewById(R.id.ivDzikirdoa)
    }
// on create untuk mengembalikan ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_doa,parent,false)
        return DoaAdapter.DoaViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: DoaViewHolder, position: Int) {
        val item = data.get(position)
        holder.tvDoasunnah.text = item.Name
        holder.ivDzikirdoa.setImageResource(item.Image)
    }
}




