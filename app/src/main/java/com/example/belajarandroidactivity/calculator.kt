package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class calculator : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        var inputOne:EditText = findViewById(R.id.inputOne)
        var inputTwo:EditText = findViewById(R.id.inputTwo)
        var btnPlus:Button = findViewById(R.id.btnCount)
        var btnMinus:Button = findViewById(R.id.btnMinus)
        var btnMulti:Button = findViewById(R.id.btnMulti)
        var btnPersen:Button = findViewById(R.id.btnPersen)
        var btnDivine:Button = findViewById(R.id.btnDivine)
        var btnClear:Button = findViewById(R.id.btnClear)
        var result:TextView = findViewById(R.id.results)

        val builder : AlertDialog.Builder = AlertDialog.Builder (this@calculator)

//        Oneclick untuk button diklik
        btnPlus.setOnClickListener{
//            buat variabel untuk menampung angka dalam tipe Int
//            fungsi toInt() untuk
            var numberOne:Int = inputOne.text.toString().toInt()
            var numberTwo:Int = inputTwo.text.toString().toInt()
            var hasilPlus:Int = numberOne+numberTwo
//            panggil hasil
            result.setText(hasilPlus.toString())
        }
        btnMinus.setOnClickListener {
            var numberOne:Int = inputOne.text.toString().toInt()
            var numberTwo:Int = inputTwo.text.toString().toInt()
            var hasilMinus:Int = numberOne-numberTwo
//            calling
            result.setText(hasilMinus.toString())
        }
        btnMulti.setOnClickListener {
            var numberOne:Int = inputOne.text.toString().toInt()
            var numberTwo:Int = inputTwo.text.toString().toInt()
            var hasilMulti:Int = numberOne*numberTwo

            result.setText(hasilMulti.toString())
        }
        btnPersen.setOnClickListener {
            var numberOne:Int = inputOne.text.toString().toInt()
            var numberTwo:Int = inputTwo.text.toString().toInt()
            var hasilPersen:Int = numberOne%numberTwo

            result.setText(hasilPersen.toString())
        }
        btnDivine.setOnClickListener {
            var numberOne:Int = inputOne.text.toString().toInt()
            var numberTwo:Int = inputTwo.text.toString().toInt()
            var hasilDivine:Int = numberOne/numberTwo

            result.setText(hasilDivine.toString())
        }
        btnClear.setOnClickListener {
//          muncul ke notif
            var hasilClear:Int = result.text.toString().toInt()

            builder.setTitle("Warning")
            builder.setMessage("Are You Sure For Clear?")
            builder.setCancelable(false)
//            notif
            builder.setPositiveButton("Yes", DialogInterface.OnClickListener{ dialog, which ->


                hasilClear = 0
                inputOne.setText("")
                inputTwo.setText("")

                result.setText(hasilClear.toString())
            })
            builder.setNegativeButton("No",DialogInterface.OnClickListener{ dialog, which ->

            })

            builder.setIcon(R.drawable.baseline_info_24)
            val alertDialog:AlertDialog = builder.create()
            alertDialog.show()

            result.setText(hasilClear.toString())
        }

    }
}