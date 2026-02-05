package com.example.kathmandu.ui

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kathmandu.R
import com.example.kathmandu.ui.theme.KathmanduTheme

@Composable
fun PageDescription(
    modifier: Modifier = Modifier
){
    ItemCard(
        name =" Dharahara",
        imageId = R.drawable.dharahara_tower,
        description = "Dharahara or Bhimsen Stambha (Nepali: धरहरा; pronounced [dʱʌɾʌɦʌɾa] or [dʱʌɾʌːɾa]), is a 72-metre-tall (236 ft)[1] tower at the centre of Sundhara, Kathmandu, Nepal.[2] It was first built in 1832 by Mukhtiyar (equivalent to Prime Minister) Bhimsen Thapa under the commission of Queen Lalit Tripurasundari and was a part of the architecture of Kathmandu recognized by UNESCO.[3] It has been destroyed and reconstructed several times.\n" +
                "\n" +
                "The tower has a spiral staircase containing 213 steps. The eighth floor holds a circular balcony for observers that provides a panoramic view of the Kathmandu Valley. It also has a 5.2-metre (17 ft) bronze mast on the roof.[2]\n" +
                "\n" +
                "Most of the tower collapsed in the April 2015 Nepal earthquake, but the base remained.[4][5] A total of 180 bodies were retrieved from the debris of the tower after the earthquake.[6] Reconstruction of the tower commenced in October 2018, and it was partially opened on 24 April 2021, one day before the sixth anniversary of the earthquake.[7] However, construction work on the tower continued until September 2024.[8]"
    )
}

@Composable
private fun ItemCard(
    name : String,
    @DrawableRes imageId: Int,
    description : String,
){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            // Image with rounded corners
            Image(
                painter = painterResource(imageId),
                contentDescription = name,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .clip(RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Monument name
            Text(
                text = name,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(12.dp))

            // Description header
            Text(
                text = "Description:",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = description,
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
                color = Color.DarkGray,
                lineHeight = 20.sp,
                textAlign = TextAlign.Justify,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DescriptionPreview(){
    KathmanduTheme{
        PageDescription()
    }
}