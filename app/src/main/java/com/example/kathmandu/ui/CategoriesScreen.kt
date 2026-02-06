package com.example.kathmandu.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Close
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kathmandu.R
import com.example.kathmandu.model.CategoryOptions
import com.example.kathmandu.model.CityUiState
import com.example.kathmandu.ui.theme.KathmanduTheme

@Composable
fun CategoriesScreen(
    viewModel: CityViewModel,
    onCardClick: () -> Unit,
    onValueChangeSearchPlace: (String) -> Unit,
    modifier: Modifier = Modifier,
){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top
    ){
        Spacer(modifier = Modifier.height(10.dp))
        SearchBar(
            modifier = Modifier,
            onValueChangeSearchPlace = onValueChangeSearchPlace
        )
        Spacer(modifier = Modifier.height(30.dp))
        Column() {
            CategoryCard(
                onCardClick = {
                    onCardClick()
                    viewModel.updateCategory(categoryOptions = CategoryOptions.SPECIALS)
                },
                imageVector = Icons.Default.Build,
                mainText = stringResource(R.string.specials),
                description = stringResource(R.string.specials_description)
            )
            CategoryCard(
                onCardClick = {
                    onCardClick()
                    viewModel.updateCategory(categoryOptions = CategoryOptions.TEMPLES)
                },
                imageVector = Icons.Filled.Place,
                mainText = stringResource(R.string.temples),
                description = stringResource(R.string.temples_description)
            )
            CategoryCard(
                onCardClick = {
                    onCardClick()
                    viewModel.updateCategory(categoryOptions = CategoryOptions.SHOPS)
                },
                imageVector = Icons.Filled.ShoppingCart,
                mainText = stringResource(R.string.shop),
                description = stringResource(R.string.shop_description)
            )
            CategoryCard(
                onCardClick = {
                    onCardClick()
                    viewModel.updateCategory(categoryOptions = CategoryOptions.SHOPS)
                },
                imageVector = Icons.AutoMirrored.Filled.List,
                mainText = stringResource(R.string.tourist),
                description = stringResource(R.string.tourist_description)
            )
        }
    }
}

@Composable
private fun CategoryCard(
    onCardClick: () -> Unit,
    imageVector: ImageVector,
    mainText: String,
    description: String,
){
    Card(
        onClick = onCardClick,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFE6E6E6)
        ),
        shape = RoundedCornerShape(20.dp)
    ){
        Row(
            modifier = Modifier
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Icon(
                imageVector = imageVector,
                contentDescription = "Icons",
                modifier = Modifier
                    .size(40.dp)
                    .background(
                        color = Color(0xFF424242),
                        shape = CircleShape
                    )
                    .padding(8.dp),
                tint = Color.White
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(){
                Text(
                    text = mainText,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = description,
                    fontSize = 14.sp,
                    color = Color.Gray
                )
            }
        }
    }
}

@Composable
private fun SearchBar(
    modifier: Modifier = Modifier,
    onValueChangeSearchPlace: (String) -> Unit
){
    var textState by rememberSaveable {
        mutableStateOf("")
    }
    TextField(
        modifier = modifier,
        placeholder = {
            Row(
                Modifier.fillMaxWidth()
                    .padding(1.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search Icon",
                )
                Text(
                    text = "Enter name place"
                )
            }
        },
        singleLine = true,
        shape = MaterialTheme.shapes.large,
        value = textState,
        onValueChange = {
            textState = it
            onValueChangeSearchPlace(textState)
        },
        trailingIcon = {
            if (textState.isNotEmpty()) {
                IconButton(onClick = {
                    textState = ""
                    onValueChangeSearchPlace("")
                }) {
                    Icon(
                        imageVector = Icons.Outlined.Close,
                        contentDescription = "Delete Search"
                    )
                }
            }
        }
    )
}