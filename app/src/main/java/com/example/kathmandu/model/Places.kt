package com.example.kathmandu.model

import androidx.annotation.DrawableRes

data class Recommendation(
    val name: String,
    val description: String,
    val categoryOptions: CategoryOptions,
    @DrawableRes val imageResourceId: Int,
    val locationName: String,
    val entryFee: String,
    val tags: List<String> = emptyList()
)

enum class CategoryOptions {
    SPECIALS, TEMPLES, SHOPS, DESTINATIONS
}