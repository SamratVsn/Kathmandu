package com.example.kathmandu

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
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

enum class CityScreen(@StringRes val title: Int){
    Start(title = R.string.app_name),
    Info(title = R.string.about_dev),
    Category(title = R.string.category),
    Options(title = R.string.specials),
    Description(title = R.string.shop)
}

@Composable
fun CityApp(
    viewModel: CityViewModel = viewModel()
){
    val navController = rememberNavController()
    val backStackEntry by navController.currentBackStackEntryAsState()

    val currentScreen = CityScreen.valueOf(
        backStackEntry?.destination?.route?: CityScreen.Start.name
    )

    Scaffold(
        topBar = {
            CityAppBar(
                showInfo = currentScreen.name == CityScreen.Start.name,
                currentScreen = currentScreen,
                canNavigate = navController.previousBackStackEntry != null,
                navigateUp = { navController.navigateUp() },
                navigateToInfo = { navController.navigate(CityScreen.Info.name) }
            )
        }
    ){ innerPadding ->
        val uiState by viewModel.uiState.collectAsState()

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
    navigateToInfo: () -> Unit,
    showInfo: Boolean,
    currentScreen: CityScreen,
    canNavigate: Boolean,
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier
){
    TopAppBar(
        title = { Text(stringResource(currentScreen.title)) },
        modifier = modifier,
        navigationIcon = {
            if (canNavigate) {
                IconButton(onClick = navigateUp) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Navigate back"
                    )
                }
            }
        },
        actions = {
            if (showInfo) {
                IconButton(onClick = navigateToInfo) {
                    Icon(
                        imageVector = Icons.Filled.Info,
                        contentDescription = "Info Page"
                    )
                }
            }
        }
    )
}