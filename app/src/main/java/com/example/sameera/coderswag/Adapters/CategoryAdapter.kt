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
        val holder: ViewHolder

        if (convertView == null) {
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()
            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            holder.categoryName = categoryView.findViewById(R.id.categoryName)
            println("I exist for the first time")
            categoryView.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
            categoryView = convertView
            println("Go green ,Recycle!")
        }


        val category = categories[position]

        //Convert image name to resource ID

        val resourceID = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourceID)

        holder.categoryName?.text = category.title

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

    private class ViewHolder {
        //hold referance for category name and category image
        var categoryImage: ImageView? = null
        var categoryName: TextView? = null
    }
}