package com.udacity.shoestore.shoe

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.udacity.shoestore.R
import com.udacity.shoestore.models.Shoe

/**
 * @author Jinal Tandel
 * @since 05/12/2021
 */
class ShoeListAdapter (private val dataSet: ArrayList<Shoe>?) :
    RecyclerView.Adapter<ShoeListAdapter.ViewHolder>() {

    /**
     * custom ViewHolder to handle each row
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var nameTextView: TextView = view.findViewById(R.id.shoeNameTextView)
        var companyTextView: TextView = view.findViewById(R.id.shoeCompanyTextView)
        var sizeTextView: TextView = view.findViewById(R.id.shoeSizeTextView)
        var descriptionTextView: TextView = view.findViewById(R.id.shoeDescriptionTextView)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.shoe_item_layout, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        dataSet?.let{
            viewHolder.nameTextView.text = "Name: ${it[position].name}"
            viewHolder.sizeTextView.text = "Size: ${it[position].size}"
            viewHolder.companyTextView.text = "Company: ${it[position].company}"
            viewHolder.descriptionTextView.text = "Description: ${it[position].description}"
        }
    }

    override fun getItemCount() = dataSet?.size?:0
}