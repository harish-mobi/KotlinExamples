package com.developerbook.Kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.developerbook.Kotlin.Recyclerview.RecyclerViewActivity

class MainActivity : AppCompatActivity() {



  private  lateinit var recyclerview:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerview=findViewById(R.id.recyclerview_btn)

        recyclerview.setOnClickListener(View.OnClickListener { startActivity(Intent(this@MainActivity, RecyclerViewActivity::class.java))
        })
    }
}