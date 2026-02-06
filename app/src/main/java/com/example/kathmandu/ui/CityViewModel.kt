package com.example.kathmandu.ui

import androidx.lifecycle.ViewModel
import com.example.kathmandu.data.DataSource
import com.example.kathmandu.model.CategoryOptions
import com.example.kathmandu.model.CityUiState
import com.example.kathmandu.model.Recommendation
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CityViewModel : ViewModel() {
    val _uiState = MutableStateFlow(CityUiState())
    val uiState: StateFlow<CityUiState> =_uiState.asStateFlow()

    val currentRecommendations: List<Recommendation>
        get() = DataSource.allRecommendation.filter {
            it.categoryOptions == _uiState.value.currentCategory
        }

    init {
        initializeUiState()
    }

    fun initializeUiState(){
        val recommendationCategory = DataSource.allRecommendation.groupBy { it.categoryOptions }
        _uiState.value =
            CityUiState(
                recommendationList = recommendationCategory,
            )
    }

    fun updateAndSelectDetailScreen(recommendation: Recommendation) {
        _uiState.update {
            it.copy(
                currentPlace = recommendation,
            )
        }
    }

    fun updateCategory(categoryOptions: CategoryOptions){
        _uiState.update {
            it.copy(
                currentCategory = categoryOptions,
            )
        }
    }
}