package com.example.kathmandu

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.kathmandu.ui.AboutDev
import com.example.kathmandu.ui.CategoriesScreen
import com.example.kathmandu.ui.CityViewModel
import com.example.kathmandu.ui.OptionsScreen
import com.example.kathmandu.ui.PageDescription
import com.example.kathmandu.ui.StartScreen

enum class CityScreen(var title: String?){
    Start(title = "Kathmandu"),
    Info(title = "About Dev"),
    Category(title = "Select Category"),
    Options(title = null),
    Description(title = null)
}

@Composable
fun CityApp(
    viewModel: CityViewModel = viewModel()
){
    val uiState by viewModel.uiState.collectAsState()
    val navController = rememberNavController()
    val backStackEntry by navController.currentBackStackEntryAsState()

    val currentScreen = CityScreen.valueOf(
        backStackEntry?.destination?.route?: CityScreen.Start.name
    )

    val topBarTitle = when (currentScreen) {
        CityScreen.Options -> uiState.currentCategory.name
        CityScreen.Description -> uiState.currentPlace.name
        else -> currentScreen.title ?: ""
    }

    Scaffold(
        topBar = {
            CityAppBar(
                topBarTitle = topBarTitle,
                showInfo = currentScreen.name == CityScreen.Start.name,
                canNavigate = navController.previousBackStackEntry != null,
                navigateUp = { navController.navigateUp() },
                navigateToInfo = { navController.navigate(CityScreen.Info.name) }
            )
        }
    ){ innerPadding ->
        NavHost(
            navController = navController,
            startDestination = CityScreen.Start.name,
            modifier = Modifier.padding(innerPadding)
        ){
            composable(route = CityScreen.Start.name){
                StartScreen(
                    onStartClicked = {
                        navController.navigate(CityScreen.Category.name)
                    },
                    modifier = Modifier.fillMaxSize()
                )
            }
            composable(route = CityScreen.Info.name){
                AboutDev()
            }
            composable(route = CityScreen.Category.name) {
                CategoriesScreen(
                    viewModel = viewModel,
                    onCardClick = {
                        navController.navigate(CityScreen.Options.name)
                    },
                    onValueChangeSearchPlace = {
                        //TO:DO
                    }
                )
            }
            composable(route = CityScreen.Options.name) {
                OptionsScreen(
                    viewModel = viewModel,
                    uiState = uiState,
                    onButtonClicked = {
                        navController.navigate(CityScreen.Description.name)
                    },
                )
            }
            composable(route = CityScreen.Description.name) {
                PageDescription(
                    uiState = uiState
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CityAppBar(
    topBarTitle: String,
    navigateToInfo: () -> Unit,
    showInfo: Boolean,
    canNavigate: Boolean,
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier
){
    TopAppBar(
        title = {
            Text(
                text = topBarTitle,
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold
            )
        },
        modifier = modifier,
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
            navigationIconContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
            actionIconContentColor = MaterialTheme.colorScheme.onPrimaryContainer
        ),
        navigationIcon = {
            if (canNavigate) {
                IconButton(
                    onClick = navigateUp,
                    modifier = Modifier
                        .padding(4.dp)
                        .size(40.dp)
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Navigate back",
                        modifier = Modifier.size(24.dp)
                    )
                }
            }
        },
        actions = {
            if (showInfo) {
                IconButton(
                    onClick = navigateToInfo,
                    modifier = Modifier
                        .padding(4.dp)
                        .size(40.dp)
                ) {
                    Icon(
                        imageVector = Icons.Filled.Info,
                        contentDescription = "Info Page",
                        modifier = Modifier.size(24.dp)
                    )
                }
            }
        }
    )
}