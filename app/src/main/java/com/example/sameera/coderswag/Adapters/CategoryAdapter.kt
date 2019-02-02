package com.example.sameera.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.sameera.coderswag.Model.Category
import com.example.sameera.coderswag.R

//Extend calss called baseAdapter
//press alt + enter
class CategoryAdapter(context: Context, categories: List<Category>) : BaseAdapter() {

    val context = context
    val categories = categories
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
//This will create categoryView Instance every time it's scroll.so this is not efficient way to do this
//View holder paradime in next lesson
        val categoryView: View
        categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)

        val categoryImage: ImageView = categoryView.findViewById(R.id.categoryImage)
        val categoryName: TextView = categoryView.findViewById(R.id.categoryName)

        val category = categories[position]

        //Convert image name to resource ID

        val resourceID = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        categoryImage.setImageResource(resourceID)
        println(resourceID)
        categoryName.text = category.title

        return categoryView

    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }
}