package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class list_nama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_nama)

//        use ArrayAdapter and Define an Array
        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
            "Virat Kohli", "Rohit Sharma", "Steve Smith",
            "Kane Willamson", "Ross Taylor"
        )

//      access the ListView from xml file
        var mListView = findViewById<ListView>(R.id.lvNama)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, users)
//        memanggil adapter
        mListView.adapter = arrayAdapter
    }
}