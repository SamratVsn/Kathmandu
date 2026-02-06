package com.example.kathmandu.model

import com.example.kathmandu.data.DataSource

data class CityUiState(
    val recommendationList: Map<CategoryOptions, List<Recommendation>> = emptyMap(),
    var currentCategory: CategoryOptions = CategoryOptions.SPECIALS,
    var currentPlace: Recommendation = DataSource.defaultPlace,
    val isShowingRecommendation: Boolean = true
)
