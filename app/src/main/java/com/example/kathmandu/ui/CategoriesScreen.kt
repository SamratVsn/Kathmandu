package com.example.kathmandu.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material.icons.automirrored.filled.ArrowForward
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kathmandu.R
import com.example.kathmandu.model.CategoryOptions

@Composable
fun CategoriesScreen(
    viewModel: CityViewModel,
    onCardClick: () -> Unit,
    onValueChangeSearchPlace: (String) -> Unit,
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.surface),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ){
        Spacer(modifier = Modifier.height(24.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Explore Kathmandu",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onSurface
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Discover hidden gems & cultural wonders",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                textAlign = TextAlign.Center
            )
        }

        Spacer(modifier = Modifier.height(24.dp))
        //Search Bar
        SearchBar(
            modifier = Modifier.padding(horizontal = 24.dp),
            onValueChangeSearchPlace = onValueChangeSearchPlace
        )
        Spacer(modifier = Modifier.height(32.dp))
        //Categories
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            Text(
                text = "Categories",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp),
                color = MaterialTheme.colorScheme.onSurface
            )

            CategoryCard(
                onCardClick = {
                    onCardClick()
                    viewModel.updateCategory(categoryOptions = CategoryOptions.SPECIALS)
                },
                imageVector = Icons.Default.Build,
                mainText = stringResource(R.string.specials),
                description = stringResource(R.string.specials_description)
            )
            Spacer(modifier = Modifier.height(12.dp))
            CategoryCard(
                onCardClick = {
                    onCardClick()
                    viewModel.updateCategory(categoryOptions = CategoryOptions.TEMPLES)
                },
                imageVector = Icons.Filled.Place,
                mainText = stringResource(R.string.temples),
                description = stringResource(R.string.temples_description)
            )
            Spacer(modifier = Modifier.height(12.dp))
            CategoryCard(
                onCardClick = {
                    onCardClick()
                    viewModel.updateCategory(categoryOptions = CategoryOptions.SHOPS)
                },
                imageVector = Icons.Filled.ShoppingCart,
                mainText = stringResource(R.string.shop),
                description = stringResource(R.string.shop_description)
            )
            Spacer(modifier = Modifier.height(12.dp))
            CategoryCard(
                onCardClick = {
                    onCardClick()
                    viewModel.updateCategory(categoryOptions = CategoryOptions.DESTINATIONS)
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
            .padding(horizontal = 24.dp, vertical = 6.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 1.dp,
            pressedElevation = 4.dp
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Icon with circular background
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(
                        color = Color(0xFFE3F2FD), // Light blue background
                        shape = CircleShape
                    ),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = imageVector,
                    contentDescription = mainText,
                    modifier = Modifier.size(24.dp),
                    tint = Color(0xFF2196F3) // Blue tint
                )
            }

            Spacer(modifier = Modifier.width(16.dp))

            // Text content
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = mainText,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF1A1A1A),
                    lineHeight = 24.sp
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = description,
                    fontSize = 13.sp,
                    color = Color(0xFF666666),
                    lineHeight = 18.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }

            Spacer(modifier = Modifier.width(8.dp))

            // Arrow icon
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                contentDescription = "Navigate to $mainText",
                modifier = Modifier.size(20.dp),
                tint = Color(0xFF999999)
            )
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