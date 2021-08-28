package com.developerbook.Kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        handler = Handler()
        // here we're delaying to startActivity after 3seconds
        handler.postDelayed({
            val openHome = Intent(this,MainActivity::class.java)
            startActivity(openHome)
            finish()
        } , 3000)
    }
}


