package com.example.kathmandu.model

import com.example.kathmandu.model.CityPlaces.Category
import com.example.kathmandu.model.CityPlaces.Building

data class CityUiState(
    val category: Category,
    val building: Building,
)
