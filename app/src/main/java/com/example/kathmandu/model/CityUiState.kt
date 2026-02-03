package com.example.kathmandu.model

import com.example.kathmandu.data.DataSource

data class CityUiState(
    val recommendationList: Map<CategoryOptions, List<Recommendation>> = emptyMap(),
    val currentCategory: CategoryOptions = CategoryOptions.SPECIALS,
    val currentPlace: Recommendation = DataSource.defaultPlace,
    val isShowingRecommendation: Boolean = true,
)
