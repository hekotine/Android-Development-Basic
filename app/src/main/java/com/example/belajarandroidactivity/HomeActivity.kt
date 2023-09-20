package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.button.MaterialButton

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
//        deklarasi variabel
//        findviewid untuk memnaggil id
        val btnPindah:Button = findViewById(R.id.btnPindah)
        val btnShare:MaterialButton = findViewById(R.id.btnShare)
//        intent explicit
        btnPindah.setOnClickListener {
//            panggil objek intent memiliki 2 parameter
//            parameter pertama diisi dengan context this (lokasi activity awal)
//            parameter kedua isi dengan class activity yang dituju
            val intent = Intent(this,DetailActivity::class.java)
//            jalankan activity
            startActivity(intent)
        }

        btnShare.setOnClickListener {
//            pilih action untuk mengirim pesan/message
            val intent = Intent(Intent.ACTION_SEND)
//            kirim pesan yang mau dishare
            intent.putExtra(Intent.EXTRA_TEXT, "Hallo saya share ke media sosial")
            intent.setType("text/plain")
//            jalankan activity dengan data yang kita kirim
            startActivity(Intent.createChooser(intent,"share to : "))
        }

    }
}