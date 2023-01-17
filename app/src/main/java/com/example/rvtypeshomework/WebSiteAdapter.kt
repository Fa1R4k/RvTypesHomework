package com.example.rvtypeshomework

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.lang.Exception


class WebSiteAdapter(private val listSiteData: List<UiItem>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        when (viewType) {
            WEBSITE_TYPE -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.rv_item_website, parent, false)
                WebSiteViewHolder(view)
            }
            TITLE_TYPE -> {
                val view =
                    LayoutInflater.from(parent.context).inflate(R.layout.title_item, parent, false)
                TitleViewHolder(view)
            }
            else -> throw Exception()
        }

    override fun getItemCount(): Int = listSiteData.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is WebSiteViewHolder -> holder.onBind(listSiteData[position] as UiItem.WebSiteData)
            is TitleViewHolder -> holder.onBind(listSiteData[position] as UiItem.TitleItem)
        }
    }

    override fun getItemViewType(position: Int): Int = when (listSiteData[position]) {
        is UiItem.WebSiteData -> WEBSITE_TYPE
        is UiItem.TitleItem -> TITLE_TYPE
        else -> throw Exception()
    }


    companion object {
        private const val TITLE_TYPE = 1
        private const val WEBSITE_TYPE = 2
    }
}