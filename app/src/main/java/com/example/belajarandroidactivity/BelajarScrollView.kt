package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import jp.wasabeef.glide.transformations.BlurTransformation

class BelajarScrollView : AppCompatActivity() {
    var ivBgjjk:ImageView? = null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belajar_scroll_view)

       ivBgjjk = findViewById(R.id.ivBgjjk)
        Glide.with(this)
            .load(R.drawable.bgjjkthree)
            .transform(BlurTransformation(10,3))
            .into(ivBgjjk!!)
    }
}