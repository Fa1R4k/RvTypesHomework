package com.example.rvtypeshomework

import android.content.Intent
import android.net.Uri
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class WebSiteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun onBind(item: UiItem.WebSiteData) {
        val image = itemView.findViewById<ImageView>(R.id.webSiteLogo)
        val name = itemView.findViewById<TextView>(R.id.webSiteName)

        Glide.with(image).load(item.imageLink).into(image)
        name.text = item.name
        itemView.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(item.URl)
            name.context.startActivity(intent)
        }
    }
}
