package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.LanguageAdapter
import com.example.belajarandroidactivity.model.Language

class list_pemograman : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_pemograman)

        val rvBahasaProgram: RecyclerView = findViewById(R.id.rvBahasaProgram)
        val data = arrayListOf<Language>(
            Language("Golang", R.drawable.golang),
            Language("C++", R.drawable.plusplus),
            Language("Python", R.drawable.python),
            Language("Golang", R.drawable.golang),
            Language("C++", R.drawable.plusplus),
            Language("Python", R.drawable.python),
            Language("Golang", R.drawable.golang),
            Language("C++", R.drawable.plusplus),
            Language("Python", R.drawable.python),
        )

        val adapter = LanguageAdapter(data)
        rvBahasaProgram.adapter = adapter
        rvBahasaProgram.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL, false)
    }
}