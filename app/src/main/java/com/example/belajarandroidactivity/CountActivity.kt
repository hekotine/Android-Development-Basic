package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class CountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count)

        val tvNumber:TextView = findViewById(R.id.tvNumber)
        val button:Button = findViewById(R.id.buttonCount)
        val buttonMinus:Button = findViewById(R.id.buttonMinus)
        val buttonReset:Button = findViewById(R.id.buttonReset)

//        setText = untuk merubah / mengisi text
        tvNumber.text = "0"

//        getText = mengambil text
        Log.d("number","Result : ${tvNumber.text}")

//        action dari button plus
        button.setOnClickListener {
            var countInt:Int = tvNumber.text.toString().toInt()
            countInt++
            tvNumber.text = countInt.toString()
        }
//        action dari button minus
        buttonMinus.setOnClickListener {
            var minusInt:Int = tvNumber.text.toString().toInt()
            minusInt--
            tvNumber.text = minusInt.toString()
        }
        buttonReset.setOnClickListener {
            var countInt:Int = tvNumber.text.toString().toInt()
            countInt = 0
            tvNumber.text = countInt.toString()
        }
    }
}