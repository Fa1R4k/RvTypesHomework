package com.example.rvtypeshomework

sealed class UiItem {
    data class WebSiteData(
        val name: String,
        val imageLink: String,
        val URl: String,
    ) : UiItem()

    data class TitleItem(val titleItem: String) : UiItem()
}