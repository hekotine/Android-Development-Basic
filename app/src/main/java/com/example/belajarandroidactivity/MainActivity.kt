package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        variabel
        val judul:TextView = findViewById(R.id.judul)
        val nama:TextView = findViewById(R.id.nama)
        val inputNama:EditText = findViewById(R.id.inputNama)
        val kelas:TextView = findViewById(R.id.kelas)
        val inputKelas:EditText = findViewById(R.id.inputKelas)
        val kode:TextView = findViewById(R.id.kode)
        val inputKode:EditText = findViewById(R.id.inputKode)
        val btnSubmit:Button = findViewById(R.id.btnSubmit)

        val showName:TextView = findViewById(R.id.showName)
        val showClass:TextView = findViewById(R.id.showClass)
        val showCode:TextView = findViewById(R.id.showCode)

//        variabel end
        btnSubmit.setOnClickListener {
            Toast.makeText(this, "anda meminjam : ${showCode.text}",
                Toast.LENGTH_SHORT).show()
            val code:Int = inputKode.text.toString().toInt()

            showName.text = inputNama.text
            showClass.text = inputKelas.text

        when (code){
            123 -> showCode.text = "Harry Potter"
            456 -> showCode.text = "Alice In My Heart"
            789 -> showCode.text = "Vinland Saga"
        }

        }

    }
}