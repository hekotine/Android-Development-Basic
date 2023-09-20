package com.example.belajarandroidactivity.adapter

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.R
import com.example.belajarandroidactivity.model.Language

data class LanguageAdapter (val data:ArrayList<Language>)
//    : untuk adapter
    : RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder>()
{
    class LanguageViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val tvBahasaProgram: TextView = view.findViewById(R.id.tvBahasaProgram)
        val ivBahasaProgram: ImageView = view.findViewById(R.id.ivBahasaProgram)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_bahasa_pemprograman,parent,false)
        return LanguageViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
      val item = data.get(position)
        holder.tvBahasaProgram.text = item.Name
        holder.ivBahasaProgram.setImageResource(item.Image)
    }
}