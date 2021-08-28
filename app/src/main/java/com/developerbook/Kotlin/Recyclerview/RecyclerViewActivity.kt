package com.developerbook.Kotlin.Recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.developerbook.Kotlin.R

class RecyclerViewActivity : AppCompatActivity() {

    lateinit var recyclerview:RecyclerView
    val data = ArrayList<RecyclerviewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        recyclerview = findViewById(R.id.rv);

        //Create data
        for (i in 1..100)
        {
            data.add(RecyclerviewModel(R.drawable.ic_launcher_background,"item"+i))
        }

        //setting Adapter
        recyclerview.layoutManager= LinearLayoutManager(this)
        recyclerview.adapter = RecAdapter(data)
    }
}