package com.clearsky77.librarypractice_20211107

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    fun setupEvents() {
//        이미지뷰, 텍스트뷰, LinearLayout 등도 setOnClickListener 가능.
        imgProfile.setOnClickListener {
            val myIntent = Intent(this, ViewPhotoActivity::class.java)
            startActivity(myIntent)
        }
    }

    fun setValues() {
        Glide.with(this).load("https://livedoor.blogimg.jp/rakumatome/imgs/2/8/28b4a693.jpg").into(imgAction)
        Glide.with(this).load("https://newsimg.sedaily.com/2019/12/31/1VSAE95B8P_1.jpg").into(imgAction2)
        Glide.with(this).load("https://psneolog.com/wp-content/uploads/2018/05/e33babe650ddf436ffb83bae5d354ff6.jpg").into(imgAction3)
    }
}