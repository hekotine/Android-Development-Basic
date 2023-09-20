package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.DoaAdapter
import com.example.belajarandroidactivity.model.doa

class Latihan_Dashboard_Doa : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_dashboard_doa)

        val rvDoa: RecyclerView = findViewById(R.id.rvDoa)
        val cvSelengkapnya : CardView = findViewById(R.id.cvSelengkapnya)
        val data = arrayListOf<doa>(
            doa("Dzikir Dan Do'a Sunnah Setelah Shalat", R.drawable.dzikirdoa),
            doa("Do'a Harian", R.drawable.dzikirdoa),
            doa("Dzikir Harian", R.drawable.dzikirdoa),
            doa("Dzikir Dan Do'a Sunnah Setelah Shalat", R.drawable.dzikirdoa),
            doa("Do'a Harian", R.drawable.dzikirdoa),
            doa("Dzikir Harian", R.drawable.dzikirdoa)
        )

        val adapter = DoaAdapter(data)
        rvDoa.adapter = adapter
        rvDoa.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL, false)

        cvSelengkapnya.setOnClickListener{
            val intent = Intent(this,DoaHarian::class.java)
            startActivity(intent)
        }
    }

}
