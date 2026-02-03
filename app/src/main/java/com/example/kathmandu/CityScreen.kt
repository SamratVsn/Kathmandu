package com.example.kathmandu

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.kathmandu.ui.CityViewModel

@Composable
fun CityApp(
    viewModel: CityViewModel = viewModel()
){
    val uiState by viewModel.uiState.collectAsState()
}