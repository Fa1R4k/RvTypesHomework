package com.example.rvtypeshomework

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TitleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun onBind(item: UiItem.TitleItem) {
        itemView.findViewById<TextView>(R.id.text).text = item.titleItem
    }
}