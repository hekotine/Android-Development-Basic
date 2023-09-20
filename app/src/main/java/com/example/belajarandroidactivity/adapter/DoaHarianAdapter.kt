package com.example.belajarandroidactivity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.DoaHarian
import com.example.belajarandroidactivity.R
import com.example.belajarandroidactivity.model.DoaHarianModel

class DoaHarianAdapter (val data:ArrayList<DoaHarianModel>)
    : RecyclerView.Adapter<DoaHarianAdapter.DoaHarianViewHolder>()
{
    class DoaHarianViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val tvJudulDoaBangun : TextView = view.findViewById(R.id.tvJudulDoaBangun)
        val tvDoaArab : TextView = view.findViewById(R.id.tvDoaArab)
        val tvDoaLatin : TextView = view.findViewById(R.id.tvDoaLatin)
        val ibCollaps : ImageButton = view.findViewById(R.id.ibCollaps)
        val rlIsiDoa : RelativeLayout = view.findViewById(R.id.rlIsiDoa)
    }

    override fun onCreateViewHolder (parent: ViewGroup, viewType: Int): DoaHarianAdapter.DoaHarianViewHolder {
       val view = LayoutInflater.from(parent.context)
           .inflate(R.layout.item_doa_harian,parent,false)
        return DoaHarianAdapter.DoaHarianViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: DoaHarianAdapter.DoaHarianViewHolder, position: Int) {
        val item = data.get(position)
        holder.tvJudulDoaBangun.text = item.Judul
        holder.tvDoaArab.text = item.TextArab
        holder.tvDoaLatin.text = item.TextLatin

        holder.ibCollaps.setOnClickListener {
            if (holder.rlIsiDoa.visibility == View.GONE){
                holder.rlIsiDoa.visibility = View.VISIBLE
                holder.ibCollaps.setBackgroundResource(R.drawable.baseline_keyboard_arrow_down_24)
            }else{
                holder.rlIsiDoa.visibility = View.GONE
                holder.ibCollaps.setBackgroundResource(R.drawable.baseline_keyboard_arrow_right_24)
            }
        }
    }

}