package com.example.kathmandu.model

import androidx.annotation.DrawableRes
import java.util.UUID

data class Recommendation(
    val name: String,
    val description: String,
    val categoryOptions: CategoryOptions,
    @DrawableRes val imageResourceId: Int,
    val id: String = UUID.randomUUID().toString()
)

enum class CategoryOptions {
    SPECIALS, TEMPLES, SHOPS, DESTINATIONS
}