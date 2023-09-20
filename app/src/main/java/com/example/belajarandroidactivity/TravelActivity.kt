package com.example.belajarandroidactivity

import android.content.Intent
import android.media.Image
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class TravelActivity : AppCompatActivity() {
    var ibCall:ImageButton? = null
    var ibNavi:ImageButton? = null
    var ibShare:ImageButton? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel)

        ibCall = findViewById(R.id.ibCall)
        ibNavi = findViewById(R.id.ibNavi)
        ibShare = findViewById(R.id.ibShare)

        ibCall?.setOnClickListener {
            val phoneNumber = "081776554233"
            val phoneIntent = Intent(Intent.ACTION_DIAL,
                Uri.parse("tel: $phoneNumber"))
//            jalankan intent
            startActivity(phoneIntent)
        }
        ibNavi?.setOnClickListener {
            val mapIntent = Intent(Intent.ACTION_VIEW,
                Uri.parse("geo:46.495520928241525, 7.670779732527397"))
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        ibShare?.setOnClickListener {
//            pilih action untuk mengirim pesan/message
            val intent = Intent(Intent.ACTION_SEND)
//            kirim pesan yang mau dishare
            intent.putExtra(Intent.EXTRA_TEXT, "Sending...")
            intent.setType("text/plain")
//            jalankan activity dengan data yang kita kirim
            startActivity(Intent.createChooser(intent,"share to : "))
        }
    }
}