package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class LatihanVisibility : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_visibility)
        val text:TextView = findViewById(R.id.tvTexthello)
        val button:Button = findViewById(R.id.btnText)

        button.setOnClickListener {
           if(text.visibility == View.VISIBLE){
               text.visibility = View.INVISIBLE
           } else {
               text.visibility = View.VISIBLE
           }


        }

    }
}