package com.argentum442.coffeeguide.coffeeguide

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.main_places_list)
        val adapter = PlacesAdapter()
        recyclerView.adapter = adapter
        recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        adapter.submitList(listOf(
                Place("1 title", "1 address", "1 photo"),
                Place("2 title", "2 address", "2 photo"),
                Place("3 title", "3 address", "3 photo")
        ))
    }

}
