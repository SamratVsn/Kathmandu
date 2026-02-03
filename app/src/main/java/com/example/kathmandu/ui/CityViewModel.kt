package com.example.kathmandu.ui

import androidx.lifecycle.ViewModel
import com.example.kathmandu.model.CityUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class CityViewModel : ViewModel() {
    val _uiState = MutableStateFlow(CityUiState())
    val uiState: StateFlow<CityUiState> =_uiState.asStateFlow()
}