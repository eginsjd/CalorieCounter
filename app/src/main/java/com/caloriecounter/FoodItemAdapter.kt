package com.caloriecounter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.TextView

class FoodItemAdapter(private val context: Activity, private val values: List<FoodItem>)
    : BaseAdapter(){
    private lateinit var itemTitle: TextView
    private lateinit var calorieText: TextView
    private lateinit var descText: TextView

    override fun getCount(): Int {
        return values.size;
    }

    override fun getItem(p0: Int): Any {
        return values[p0];
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var rowView = LayoutInflater.from(context).inflate(R.layout.food_item_view, parent, false)

        val itemTitle = rowView.findViewById(R.id.food_title) as TextView
        val calorieText = rowView.findViewById(R.id.food_energy) as TextView
        val descText = rowView.findViewById(R.id.food_desc) as TextView

        itemTitle.text = values[position].name
        calorieText.text = values[position].calories.toString()
        descText.text = values[position].desc

        return rowView
    }
}