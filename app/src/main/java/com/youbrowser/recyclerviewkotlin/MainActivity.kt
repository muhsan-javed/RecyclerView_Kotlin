package com.youbrowser.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = ArrayList<ResModel>()
        var adapterRes: ResAdapter? = null

        list.add(ResModel(R.drawable.burger, "Macdonald Burger"))
        list.add(ResModel(R.drawable.sandwich, "Subway  Sandwich"))
        list.add(ResModel(R.drawable.pizza, "Pizza hut"))

        adapterRes = ResAdapter(list,this)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = adapterRes

    }
}