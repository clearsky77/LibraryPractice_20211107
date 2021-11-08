package com.clearsky77.librarypractice_20211107

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        setupEvents()
        setValues()
    }

    private fun setValues() {
    }

    private fun setupEvents() {
//        2.2초 후에 메인화면으로 이동 -> Splash종료
        val myHandler = Handler(Looper.getMainLooper())
        myHandler.postDelayed({

            val myIntent = Intent(this,MainActivity :: class.java)
            startActivity(myIntent)
            finish()

        }, 2200)
    }
}