package com.caloriecounter

import android.app.appsearch.SearchResults
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ListView
import android.widget.SearchView
import android.widget.TextView

// https://www.javatpoint.com/kotlin-android-custom-listview
// https://www.youtube.com/watch?v=8Pv96bvBJL4

class MainActivity : AppCompatActivity() {
    private lateinit var searchField: SearchView
    private lateinit var totalCal : TextView
    private lateinit var searchResults : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        searchField = findViewById(R.id.search_input)
        totalCal = findViewById(R.id.total)
        searchResults = findViewById(R.id.food_items)


        searchField.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(p0: String?): Boolean {
                searchField.clearFocus()

                //query the data here and attach the adapter

                return false
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                //query the data here from and attach the adapter
                return false;
            }
        })
    }
}