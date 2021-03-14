package com.example.digitalhousefoods.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.digitalhousefoods.R

class SplashScreenActivity : AppCompatActivity() {

    private var TIME_OUT:Long = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        loadSplashScreen()
    }

    private fun loadSplashScreen(){
        Handler().postDelayed({
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        },TIME_OUT)
    }
}